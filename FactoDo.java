import java.util.*;
class FactoDo
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\tEnter Number:");
	int n=sc.nextInt();
	int fact=1;
	int i=1;
	do
	{
	fact=fact*i;
	i++;
	}while(n>=i);
	System.out.print("Fctorial is:"+fact);

	}
}
	
	