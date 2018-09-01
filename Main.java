import java.util.Comparator;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;


class StateComparator implements Comparator<GameState>
{
	public int compare(GameState a, GameState b)
	{
		for(int i = 0; i < 22; i++)
		{
			if(a.state[i] < b.state[i])
				return -1;
			else if(a.state[i] > b.state[i])
				return 1;
		}
		return 0;
	}
}

public class Main
{
	static String stateToString(GameState b)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(Byte.toString(b.state[0]));
		for(int i = 1; i < b.state.length; i++) {
			sb.append(",");
			sb.append(Byte.toString(b.state[i]));
		}
		return sb.toString();
	}



	public static void main(String args[]) throws Exception
	{
		System.out.println("loading ...");
		StateComparator comp = new StateComparator();
		GameStateCheck gsc = new GameStateCheck();
		//Viz v;
    //Queue
    Queue<GameState> q = new LinkedList<>();
		TreeSet<GameState> t = new TreeSet<GameState>(comp);
		//TreeSet<GameState> t = new TreeSet<GameState>();
    HashMap<GameState,GameState> path = new HashMap<GameState,GameState>();
		GameState winingState = new GameState(null);

    GameState a = new GameState(null);
    q.add(a);
		t.add(a);
		//System.out.println("Push: " + stateToString(a));

		while(!q.isEmpty())
		{
			GameState tree_root = q.remove();

			//System.out.println("\nPop: " + stateToString(tree_root));

			if((tree_root.state[0] == 4) && (tree_root.state[1] == -2 ))
	    {
	      //System.out.println("Goal reached");
				winingState = tree_root;
				break;
	    }

			for(int i=0; i<22; i++)
			{
				GameState check = new GameState(null);
				for(int j=0; j<22; j++)
					check.state[j] = tree_root.state[j];

				check.state[i]+=1;
				if(( gsc.is_valid_move(check)) && !(t.contains(check)) )
				{
					q.add(check);
					t.add(check);
					path.put(check,tree_root);
					// System.out.println(stateToString(tree_root));
					//System.out.println("Push: " + stateToString(check));
				}
			}

			for(int i=0; i<22; i++)
			{
				GameState check = new GameState(null);
				for(int j=0; j<22; j++)
					check.state[j] = tree_root.state[j];

				check.state[i]-=1;
				if(( gsc.is_valid_move(check)) && !(t.contains(check)) )
				{
					q.add(check);
					t.add(check);
					path.put(check,tree_root);
					//System.out.println("Push: " + stateToString(check));
				}
			}

		}

		//System.out.println("Size is = : " + path.size());

		Stack<GameState> my_stack = new Stack<GameState>();
		GameState result = path.get(winingState);
		//GameState final = new GameState(null);
		my_stack.push(winingState);
		while(path.size() != 0)
		{
			my_stack.push(result);
			if(result == a)
			{
				//System.out.println("initial state reached");
				//my_stack.push(a);
				break;
			}
			else
			{
				result = path.get(result);
			}
		}

		new Viz(my_stack);

		// System.out.println("Size of Stack is " + my_stack.size());

		// while(!my_stack.isEmpty())
		// {
		// 	GameState amx = new GameState(null);
		// 	amx = my_stack.pop();
		//
		// 	for(int i = 0; i < 11; i++)
		// 		System.out.print(i + "]  " + "(" + amx.state[2 * i] + "," +	amx.state[2 * i + 1] + ") ");
		//
		// 	System.out.println();
		//
		// }
	}
}
