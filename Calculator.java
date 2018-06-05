

public class Calculator implements Calculations
{
	
	int add(int a, int b)
	{
		return (a+b);
	}
	int subtract(int a, int b)
	{
		return (a-b);
	}
	int multiply(int a, int b)
	{
		return (a*b);
	}
	int divide(int a, int b)
	{
		return (a/b);
	}
	public static void main(String args[ ])
	{
		Calculator c1=new Calculator();
		System.out.println("The sum of 10 and 5: "+c1.add(10,5));
		System.out.println("The difference of 10 and 5: "+c1.subtract(10,5));
		System.out.println("The product of 10 and 5: "+c1.multiply(10,5));
		System.out.println("The quotient of 10 and 5: "+c1.divide(10,5));
	}
}