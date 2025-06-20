package ImpPrograms;

public class PrimeNumbers1to10 {
	public static void primes()
	{
		int num=10;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				if(j%num==0)
				{
					count++;
					
					
				}
				
				
			}
			if(count==2)
			{
				System.out.println(i+ " prime number");
			}
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primes();
	}

}
