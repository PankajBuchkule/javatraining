package assingment;

public class FirstAssingment {

	public static void main(String[] args){ 	
		   
    	System.out.println("Out put using Turnary oprator company Name :");
    	String[] company = {"Infosys","TCS","TechM","CTS","Wipro","Paratus","IBM"};
  
        for (String org : company){
        	System.out.println(org);
        }
        
        System.out.println("Out put using for loop of company Name : ");
        for (int i=0; i<company.length; i++) {
        	System.out.println(company[i]);
        }
        
	}
}
