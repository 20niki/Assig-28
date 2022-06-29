import java.util.*;
class Natural 
{
    public static void main(String args[])
    {
       
        System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
	 int i = 1 ;
        int sum = 0;
        do
        {
            sum = sum +i;
            i++;
        }while(i <= x);
        System.out.println("Sum of "+x+" numbers is :"+sum);
    } 
}