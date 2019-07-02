package a_package;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int a, b, c,d;
		a=b=5;
		c=10;
		try
		{
		d=c/(a-b);
		System.out.println(d);
		}catch (ArithmeticException e2) {
			System.out.println("Cool");
			e2.printStackTrace();
			}
		Thread.sleep(1000);
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
		
		}

}
