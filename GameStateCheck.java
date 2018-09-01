
import java.util.*;

public class GameStateCheck
{
  private char [][] init_board = new char[10][10];
  private char [][] board = new char[10][10];
  private ArrayList<Shape> my_shape = new ArrayList<Shape>();

  GameStateCheck()
  {
      init_fill_board();
      shape_list();
  }

  public void shape_list()
  {
    my_shape.add(new Shape(0, 4, 1, 3, 2, 3, 1, 4, 2, 4));
    my_shape.add(new Shape(1, 3, 1, 5, 1, 6, 2, 6));
    my_shape.add(new Shape(2, 3, 2, 5, 3, 5, 3, 6));
    my_shape.add(new Shape(3, 3, 3, 7, 3, 8, 4, 8));
    my_shape.add(new Shape(4, 3, 4, 7, 5, 7, 5, 8));
    my_shape.add(new Shape(5, 3, 6, 7, 7, 7, 6, 8));
    my_shape.add(new Shape(6, 4, 5, 4, 4, 5, 5, 5, 5, 6));
    my_shape.add(new Shape(7, 4, 6, 4, 6, 5, 6, 6, 7, 5));
    my_shape.add(new Shape(8, 3, 8, 5, 8, 6, 7, 6));
    my_shape.add(new Shape(9, 3, 6, 2, 6, 3, 5, 3));
    my_shape.add(new Shape(10, 3, 5, 1, 6, 1, 5, 2));
  }

  public boolean is_valid_move(GameState state)
  {
    for(int i=0; i<10; i++)
    {
      board[i] = init_board[i].clone();
    }

    for(Shape shape : my_shape)
    {
      if(fill_board(shape,state))
        return false;
    }
    return true;
  }

  public void init_fill_board()
  {

    //Initiall making a board false
    for(int i=0; i < 10; i++)
    {
      for(int j=0; j<10; j++)
      {
        init_board[i][j] = 'F';
      }
    }


    //Filling the black pieces
    for(int i=0; i<10; i++)
    {
      init_board[i][0] = 'T';
      init_board[i][9] = 'T';
    }
    for(int i =1; i < 9; i++)
    {
      init_board[0][i] = 'T';
      init_board[9][i] = 'T';
    }

    init_board[1][1] = 'T'; init_board[1][2] = 'T'; init_board[2][1] = 'T';
    init_board[7][1] = 'T'; init_board[8][1] = 'T'; init_board[8][2] = 'T';
    init_board[1][7] = 'T'; init_board[1][8] = 'T'; init_board[2][8] = 'T';
    init_board[8][7] = 'T'; init_board[7][8] = 'T'; init_board[8][8] = 'T';
    init_board[3][4] = 'T'; init_board[4][4] = 'T'; init_board[4][3] = 'T';

  }

  public boolean fill_board(Shape shape, GameState gs)
  {

    if(shape.getSize() == 3)
    {
      if((board[shape.getX1() + gs.state[shape.getID()*2]][shape.getY1() + gs.state[shape.getID()*2+1]]) == 'T')
      {
        return true;
      }
      else
      {
        board[shape.getX1() + gs.state[shape.getID()*2]][shape.getY1() + gs.state[shape.getID()*2+1]] = 'T';
      }
      //-----------------------------------------------------------------
      if((board[shape.getX2() + gs.state[shape.getID()*2]][shape.getY2() + gs.state[shape.getID()*2+1]]) == 'T')
      {
        return true;
      }
      else
      {
        board[shape.getX2() + gs.state[shape.getID()*2]][shape.getY2() + gs.state[shape.getID()*2+1]] = 'T';
      }
      //-----------------------------------------------------------------------
      if((board[shape.getX3() + gs.state[shape.getID()*2]][shape.getY3() + gs.state[shape.getID()*2+1]]) == 'T')
      {
        return true;
      }
      else
      {
        board[shape.getX3() + gs.state[shape.getID()*2]][shape.getY3() + gs.state[shape.getID()*2+1]] = 'T';
      }
    }


    if(shape.getSize() == 4)
    {
      if((board[shape.getX1() + gs.state[shape.getID()*2]][shape.getY1() + gs.state[shape.getID()*2+1]]) == 'T')
      {
        return true;
      }
      else
      {
        board[shape.getX1() + gs.state[shape.getID()*2]][shape.getY1() + gs.state[shape.getID()*2+1]] = 'T';
      }
      //-----------------------------------------------------------------
      if((board[shape.getX2() + gs.state[shape.getID()*2]][shape.getY2() + gs.state[shape.getID()*2+1]]) == 'T')
      {
        return true;
      }
      else
      {
        board[shape.getX2() + gs.state[shape.getID()*2]][shape.getY2() + gs.state[shape.getID()*2+1]] = 'T';
      }
      //-----------------------------------------------------------------------
      if((board[shape.getX3() + gs.state[shape.getID()*2]][shape.getY3() + gs.state[shape.getID()*2+1]]) == 'T')
      {
        return true;
      }
      else
      {
        board[shape.getX3() + gs.state[shape.getID()*2]][shape.getY3() + gs.state[shape.getID()*2+1]] = 'T';
      }
      //-----------------------------------------------------------------------
      if((board[shape.getX4() + gs.state[shape.getID()*2]][shape.getY4() + gs.state[shape.getID()*2+1]]) == 'T')
      {
        return true;
      }
      else
      {
        board[shape.getX4() + gs.state[shape.getID()*2]][shape.getY4() + gs.state[shape.getID()*2+1]] = 'T';
      }

    }
    return false;
  }
}
