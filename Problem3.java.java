import java.util.Scanner;

class Problem3
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int num1=num;
		int decresedNo=--num;
		if(num1%2==0)
		{
			for(int i=1; i<=(decresedNo*2); i++)
			{
				if(i%2!=0)
				{
					System.out.print(i+",");
					
				}
			}
		}
		else
		{
			for(int i=1; i<=(num1*2); i++)
			{
				if(i%2!=0)
				{
					System.out.print(i+",");
					
				}
			}
		}
	}
}