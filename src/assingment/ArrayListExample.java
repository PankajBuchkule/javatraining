package assingment;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Circle> arrayOfCircles = new ArrayList();

		arrayOfCircles.add(new Circle(2, "red"));
		arrayOfCircles.add(new Circle(3, "Black"));
		arrayOfCircles.add(new Circle(6, "Yellow"));
		System.out.println("Redious of 3rd Circlr is " + arrayOfCircles.get(2).getRadius());

		for (int i = 0; i <= arrayOfCircles.size(); i++) {
			System.out.println(arrayOfCircles.get(i).getRadius() + arrayOfCircles.get(i).getColor());
		}
		
		for (Circle c1 : arrayOfCircles) {
			System.out.println(c1.getRadius() + c1.getColor());
		}
	}
}
