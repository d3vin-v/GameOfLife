
public class Grid{
	static boolean[][] grid;
	
	public static void createGrid(int ig) {
		grid = new boolean[ig][ig];
		
	}
	
	public static void manualPaint(int y, int x) {
		grid[y][x] = false;
	}
	
}

