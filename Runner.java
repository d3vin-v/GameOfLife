import java.util.*;

public class Runner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int g;
		int m;
		
		Grid[][] grid;
		
		do {
			System.out.println("Menu: ");
			System.out.println("1. Create grid");
			System.out.println("2. Manually Paint");
			System.out.println("3. Quit");
			m = scan.nextInt();
			
			switch(m) {
				case 1: //create grid
					System.out.println("Enter grid size: ");
					g = scan.nextInt();
					Grid.createGrid(g);
					break;
				case 2: //manually paint
					int y; int x;
					System.out.println("Enter x value: ");
					x = scan.nextInt();
					System.out.println("Enter y value: ");
					y = scan.nextInt();
					Grid.manualPaint(y, x);
					break;
				case 3: //exit
					System.out.println("Goodbye");
					break;
			}
			
			
		}while(m < 3);
		
		
		scan.close();
	}
}
