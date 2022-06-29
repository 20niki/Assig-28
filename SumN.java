import java.util.*;
class SumN
	{
		public static void main(String[]args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i,sum=0;
		for(i=0;i<=n;i++)
		{
		sum=sum+i;
		}
		System.out.println(sum);
		}
	}
