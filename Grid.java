
public class Grid{
	static boolean[][] grid;
	static int gridSize;
	
	public static void createGrid(int ig) {
		gridSize = ig;
		grid = new boolean[ig][ig];
		System.out.println("Grid created");
	}
	
	public static void manualPaint(int y, int x) {
		if(!grid[y][x]) {
			grid[y][x] = true;
		}else {
			grid[y][x] = false;
		}
		System.out.println("Point painted");
	}
	
	public static String toStringg() {
		String output = "";
		String temp;
		for(int i = grid.length - 1; i >= 0; i--) {
			for(int j = 0; j < grid.length - 1; j++) {
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

