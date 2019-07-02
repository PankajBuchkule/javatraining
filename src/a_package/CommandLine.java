package a_package;

public class CommandLine {

	public static void main(String[] args123) { // arr
		// TODO Auto-generated method stub

		int sum = 0;
		System.out.println("No of arguments are : " + args123.length);
		for (int i = 0; i < args123.length; i++) {
			sum = sum + Integer.parseInt(args123[i]);
			System.out.println("Sum of number is : " +sum);
		}
		System.out.println("The Sum of arguments passed is : " +sum);
		
	}

}
