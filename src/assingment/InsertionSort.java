package assingment;

/*
public class InsertionSort {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {15, 6, 30, 2, 50, 28};  //Output: 2 6 15 28 30 50    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    
*/

/*
 * Java Program to Implement Insertion Sort
 */
 

 
/* Class InsertionSort */

import java.util.Scanner;
public class InsertionSort 
{
    /* Insertion Sort function */
    public static void sort( int arr[] )
    {
        int N = arr.length;
        int i, j, temp;
        for (i = 1; i< N; i++) 
        {
            j = i;
            temp = arr[i];    
            while (j > 0 && temp < arr[j-1])
            {
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;            
        }        
    }    
    /* Main method */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        System.out.println("Insertion Sort Test\n");
        int n, i;
        /* Accept number of elements */
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
        /* Create integer array on n elements */
        int arr[] = new int[ n ];
        /* Accept elements */
        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        /* Call method sort */
        sort(arr);
        /* Print sorted Array */
        System.out.println("\nElements after sorting ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();  
        scan.close();
    }   
}