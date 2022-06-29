import java.util.Scanner;

class ReverseNatural 
{
	
	public static void main(String[] args) 
	{
		int num, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Maximum integer Value : ");
		num = sc.nextInt();	
		
		for(i = num; i >= 1; i--)
		{
			System.out.print(i +"\t"); 
		}	
	}
}