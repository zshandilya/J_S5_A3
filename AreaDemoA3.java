import java.util.Scanner;

public class AreaDemoA3 {
	
	public static void area (TriangleA3 x) {
		double a;
		a=0.5*x.getBase()*x.getHeight();
		
		System.out.println("Area of Triangle: "+a);
	}
	
	public static void area (RectangleA3 x) {
		double a;
		a=x.getLength()*x.getBreadth();
		
		System.out.println("Area of Rectangle: "+a);
	}

	public static void main(String[] args) {

		TriangleA3 t;
		RectangleA3 r;
		Scanner s = new Scanner (System.in);
		int op;
		double x,y;
		
		do {
			System.out.println("****** CALCULATE AREA ******");
			System.out.println("1. RECTANGLE");
			System.out.println("2. TRIANGLE");
			System.out.println("3. EXIT");
			System.out.print("Enter Your Option(1-3): ");
			op=s.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.print("Enter length of rectangle(>0): ");
				x=s.nextDouble();
				if (x>0) {
					System.out.print("Enter breadth of rectangle(>0): ");
					y=s.nextDouble();
					if (y>0) {
						r=new RectangleA3(x,y);
						area(r);
					}
					else
						System.out.println("Incorrect Value. Breadth must be positive. Please try again ...\n");
				}
				else
					System.out.println("Incorrect Value. Length must be positive. Please try again ...\n");
				break;
				
			case 2:
				System.out.print("Enter base length of triangle(>0): ");
				x=s.nextDouble();
				if (x>0) {
					System.out.print("Enter height of triangle(>0): ");
					y=s.nextDouble();
					if (y>0) {
						t=new TriangleA3(x,y);
						area(t);
					}
					else
						System.out.println("Incorrect Value. Height must be positive. Please try again ...\n");
				}
				else
					System.out.println("Incorrect Value. Bae Length must be positive. Please try again ...\n");
				break;
				
			case 3:
				System.out.println("Thank You for using this Application.");
				System.out.println("Good Bye !!!");
				break;
				
			default:
				System.out.println("Incorrect Option.");
				System.out.println("Please try again.");
				break;
			
			}
		
		} while (op!=3);
		s.close();
	}

}
