import java.util.Scanner;

class problem1 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		double num1=sc.nextDouble();
		System.out.println("enter the second number:");
		double num2=sc.nextDouble();
		
		System.out.println("enter the operation");
		String operation=sc.next();
		if(operation.equals("+"))
		{
			System.out.println("output is "+(num1+num2));
		}

		else if(operation.equals("-"))
		{
			System.out.println("output is "+(num1-num2));
		}
		
		else if(operation.equals("*"))
		{
			System.out.println("output is "+(num1*num2));
		}

		else if(operation.equals("/"))
		{
			System.out.println("output is "+(num1/num2));
		}
		else
		{
			System.out.println();
	    }
	}
}


