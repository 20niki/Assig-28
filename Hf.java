import java.util.*;
class Hf
	{
		public static void main(String[]Args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Fist number");
		int a=sc.nextInt();
		System.out.println("Secound number");
		int b=sc.nextInt();
		int i=1;
		int x=0;
		do
		{
		if(a%i==0 && b%i==0)
		x=i;
		i++;
		}while(i<=a || i<=b);
		System.out.println("\tHcf"+x);
		}
	}