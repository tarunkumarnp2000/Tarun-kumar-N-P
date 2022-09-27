import java.util.Scanner;
public class Program2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the values of n");
		int n=scan.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.print(((2*i)+1)+" ");
		
		}
	
	}
}