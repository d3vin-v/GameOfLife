
public class Grid{
	static boolean[][] grid;
	
	public static void createGrid(int ig) {
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
	
}

