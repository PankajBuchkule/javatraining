package assingment;

import java.util.Scanner;
 
class ReverseNumber
{
   public static void main(String args[])
   {
      int n, reverse = 0;
         
      System.out.println("Enter an integer to reverse"); //This statement will capture the user input
      Scanner in = new Scanner(System.in);				 //Captured input would be stored in number num
      n = in.nextInt(); 								 //While Loop: Logic to find out the reverse number
         
      while(n != 0)
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }
       
      System.out.println("Reverse of the number is " + reverse);
      in.close();
   }
}
