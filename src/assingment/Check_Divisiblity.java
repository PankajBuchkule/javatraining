package assingment;
public class Check_Divisiblity
{
    public static void main(String[] args) 
    {
//        int n;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter any number:");
//        n = s.nextInt();
        for(int i=1; i<=50; i++)
        {
        	if(i % 3 == 0)
        {
            System.out.println(i+ " : ABC");
            
        }
        if(i % 5 == 0)
        {
            System.out.println(i+" : DEF");
            
        } 
        if(i % 10 == 0)
        {
            System.out.println(i+" : GHI");
        }        
        }
    }
}