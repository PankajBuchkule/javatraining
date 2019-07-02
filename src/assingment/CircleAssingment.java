	package assingment;

	import java.util.Scanner;

	public class CircleAssingment {

		public static void main(String[] args) {

			int redius;
	        double area = 0;
	        CircleAssingment c = new CircleAssingment();
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter radius of circle:");
	        redius = s.nextInt();
	        c.Circle(area);
	        area = 3.14 * redius * redius;
	        System.out.println("Area of circle:"+area);
	        s.close();
					
		}

		private void Circle(double area) {
			// TODO Auto-generated method stub
			
		}

	}
