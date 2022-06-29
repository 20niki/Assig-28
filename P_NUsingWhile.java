import java.util.Scanner;

class P_NUsingWhile 
{
	public static void main(String[] args)
	{
		
		int i;

		
		Scanner Sc = new Scanner(System.in);

		
		System.out.print("Enter the value n : ");

		
		int n = Sc.nextInt();

		System.out.print("Numbers are : ");
		for(i=1;i<=n;i++)
		
		{
			System.out.print("\t"+i);
			
		}
	}
}