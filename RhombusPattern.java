import java.util.*;
public class RhombusPattern
{
    
 
    public static void main(String[] args)
    {
             
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
              System.out.print("Enter Symbol : ");
	
              char c = sc.next().charAt(0);
   int i=1;
 	while(i<=n)
               {
                   int j=1;
                     while(j++<=n-i)
                
                        {
                               System.out.print(" ");
                        }
j=1;
                       while(j++<=n)
                        {
                               System.out.print(c);
                        }
                   
                            System.out.println();
		    i++;
               }             
 
 
                
    }
}