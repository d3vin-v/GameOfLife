
public class Grid{
	static boolean[][] grid;
	static int gridSize;
	
	Grid(int g){
		grid = new boolean[g][g];
	}
	
	public static boolean[][] createGrid(int ig) {
		gridSize = ig;
		grid = new boolean[ig][ig];
		System.out.println("Grid created");
		return grid;
	}
	
	public static void manualPaint(int y, int x) {
		if(!grid[y][x]) {
			grid[y][x] = true;
		}else {
			grid[y][x] = false;
		}
		System.out.println("Point painted");
	}
	
	void next() {
		boolean[][] tempGrid = new boolean[rows()][cols()];

        for(int row = 0; row < rows(); row++){
            for(int col = 0; col < cols(); col++){
                // 2 cases
                // count neighbors
                int neighbors = numNeighbors(row,col);

                if(grid[row][col]){
                    // 1 - alive
                    tempGrid[row][col] = (neighbors == 2 || neighbors == 3);
                } else {
                    // 2 - dead
                    tempGrid[row][col] = (neighbors == 3);
                }
            }
        }
        grid = tempGrid;
	}
	
	private int numNeighbors(int row, int col){
        int count = 0;
        count += get(row-1, col-1)?1:0;
        count += get(row-1, col)?1:0;
        count += get(row-1, col+1)?1:0;
        count += get(row, col-1)?1:0;
        count += get(row, col+1)?1:0;
        count += get(row+1, col-1)?1:0;
        count += get(row+1, col)?1:0;
        count += get(row+1, col+1)?1:0;

        return count;
    }
	
	int rows(){
        return grid.length;
    }

    int cols(){
        return grid[0].length;
    }

    void change(int row, int col) {
        grid[row][col] = !grid[row][col];
    }
    
    boolean get(int row, int col){
        return grid[(row + rows()) % rows()][(col + cols()) % cols()];
    }
	
	@Override
	public String toString() {
		String output = "";
		String temp;
		for(int i = 0; i < grid.length - 1; i++) {
			for(int j = grid.length - 1; j >= 0; j--) {
				if(grid[i][j]) {
					temp = "1";
				}else {
					temp = "0";
				}
				output = temp + " " + output;
			}
			output = "\n" + output;
		}
		return output;
	}
}
