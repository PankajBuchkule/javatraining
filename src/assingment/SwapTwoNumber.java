package assingment;

/*public class SwapTwoNumber {

	// Java Program to swap two numbers  without 
	// using temporary variable 
		  
	public static void main(String a[]) 
	    { 
	        int x = 10; 
	        int y = 5; 
	        x = x + y; 
	        y = x - y; 
	        x = x - y; 
	        System.out.println("After swaping:" + " x = " + x + ", y = " + y); 
	    } 
	} 

*/
public class SwapTwoNumber {
	 
    public static void main(String a[]){
        int x = 10;
        int y = 20;
        	System.out.println("Before swap:");
        	System.out.println("x value: "+x);
        	System.out.println("y value: "+y);
        		
        		x = x+y;
        		y = x-y;
        		x = x-y;
        	
        	System.out.println("\nAfter swap:");
        	System.out.println("x value: "+x);
        	System.out.println("y value: "+y);
    }
}