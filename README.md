# Puzzle Solver
This program solves the puzzle, Intelligently, in a optimal way. The concept used here is BFS and language used is Java. 

# INITIAL STATE
![Image description](https://github.com/anjanpoudel/optimal-pathfinder/blob/master/initial_state.png)

# GOAL OF THE PUZZLE
The goal is to move the red piece (0) to a position adjacent to the top. That is, move it to where the orange piece (10) is currently located. Black pieces cannot be moved. The pieces cannot overlap. The pieces cannot be rotated. Think about solving this with mind. For very smart person on earth it will take atleast 1hr. But Computer Algorithm solves it in 2 minutes(thats a lot for computer as well but its complex)

# FINAL STATE
![Image description](https://github.com/anjanpoudel/optimal-pathfinder/blob/master/final_state.png)

# HOW TO RUN 
To run this puzzle clone the project and run following command in linux terminal

1) java Main.java
2) javac Main

Wait for 1-2 minutes (depending on computational power)

# CHALLANGES

Biggest challange was Managing application memory because there were more then 1000 of game states running. It was solved by encoding the state of this game with an array of 22 bytes. This saved lots of memory and improved computational time. 

# ACCOMPLISHMENT

Major accomplishment was, how the choice of data structure can significantly change performance of algorithm. For instance, in this algorith Binary Search Tree(BST) was used to store game state insted of vector/array. Which reduce the time complexity in searching and improved overall time complexity.  
