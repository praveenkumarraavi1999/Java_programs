package ImpPrograms;

public class PrimeNumber {
	
	public static void main(String[] args)
	{
		primeNumb(7);
	}
	public static void primeNumb(int number)
	{
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
			count++;
		}
		}
		if(count==2)
		{
			System.out.println("given number is prime");
			
		}
		else 
			System.out.println("not Prime");
	}
}
