package assingment;

import java.util.Scanner;

public class EvenOddNumber {
    static int isEven(int n) 
    { 
        return (n & 1); 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        int n; 
        System.out.println("Enter Number: "); 
        Scanner in = new Scanner(System.in);				
        n = in.nextInt(); 
        if(isEven(n)==0) 
            System.out.print("Even"); 
        else
            System.out.print("Odd"); 
        in.close();
    } 
} 
