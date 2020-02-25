import java.util.*;

public class Runner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int g;
		int menu;
//		boolean[][] grid = null;
		Grid grid = null;
		
		do { //menu
			System.out.println("Menu: ");
			System.out.println("1. Create grid");
			System.out.println("2. Manually Paint");
			System.out.println("3. Next");
			// add "cycle time"
			System.out.println("4. Quit");
			menu = scan.nextInt();
			
			switch(menu) {
				case 1: //create grid
					System.out.println("Enter grid size: ");
					g = scan.nextInt();
					grid = new Grid(g);
//					grid = Grid.createGrid(g);
					System.out.println(grid);
					break;
				case 2: //manually paint
					int y; int x;
					System.out.println("Enter x value(Points are considered on quadrant IV): ");
					x = scan.nextInt();
					System.out.println("Enter y value: ");
					y = scan.nextInt();
					Grid.manualPaint(y, x);
					System.out.println(grid);
					break;
				case 4: //exit
					System.out.println("Goodbye");
					break;
			}
			
		}while(menu < 3);
		
		scan.close();
	}
}
