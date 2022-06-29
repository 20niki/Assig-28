import java.util.Scanner;

class P_NUsingDo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value n : ");
		int n = sc.nextInt();
		int i=1;
		do
		{
		i++;
		System.out.print("\t"+i);
		}while(i<n);
		
	}
}