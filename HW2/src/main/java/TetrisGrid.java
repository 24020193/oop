// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.
package hw2;
public class TetrisGrid {

	private boolean[][] grid;

	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}


	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		boolean found = true;
		while (found) {
			found = false;
			for (int y = 0; y < grid[0].length; y++) {
				if (isFullRow(y)) {
					clearRow(y);
					found = true;
					break;
				}
			}
		}
	}

	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid;
	}



	private boolean isFullRow(int y) {
		for (int x = 0; x < grid.length; x++) {
			if (!grid[x][y]) {
				return false;
			}
		}
		return true;
	}

	private void clearRow(int y) {
		for (int yy = y; yy < grid[0].length - 1; yy++) {
			for (int x = 0; x < grid.length; x++) {
				grid[x][yy] = grid[x][yy + 1];
			}
		}
		
		for (int x = 0; x < grid.length; x++) {
			grid[x][grid[0].length - 1] = false;
		}
	}
}

