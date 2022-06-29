import java.util.Scanner;

class ReverseNaturalDo 
{
	
	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter the Maximum integer Value : ");
		num = sc.nextInt();
		int i=num;
		do
		{
		System.out.print(i +"\t"); 
		i--;
		 }while(i >= 1);

	}
}