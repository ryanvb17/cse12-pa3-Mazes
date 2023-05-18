/* Class to implement a Maze solver */

public abstract class MazeSolver {
	
	public static Square solve(Maze maze, SearchWorklist wl) {
		Square current;
		wl.add(maze.start);
		maze.start.visit();
		while (!wl.isEmpty()) {
			current = wl.remove();
			if (current.equals(maze.finish)) return current;
			else {
				Square north = maze.contents[current.getRow()-1][current.getCol()];
				Square south = maze.contents[current.getRow()+1][current.getCol()];
				Square east = maze.contents[current.getRow()][current.getCol()+1];
				Square west = maze.contents[current.getRow()][current.getCol()-1];

				if (north.getIsWall() == false) {
					wl.add(north);
					north.visit();
					north.setPrevious(current);
				}
				if (south.getIsWall() == false) {
					wl.add(south);
					south.visit();
					south.setPrevious(current);
				}
				if (east.getIsWall() == false) {
					wl.add(east);
					east.visit();
					east.setPrevious(current);
				}
				if (west.getIsWall() == false) {
					wl.add(west);
					west.visit();
					west.setPrevious(current);
				}
			}
		}
		return null;
	}

	/* Add any helper methods you want */
}

