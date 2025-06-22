package ImpPrograms;

public class SumDigitsInNumber {
	
	public static void sumDigits()
	{
		int number=123;
		int sum=0;
		
		
		while(number>0)
		{
			int digit=number%10;      //gets last digit
			sum=sum+digit;            //gets 0+3=3   
			number=number/10;         //eliminates last digit of given number  12
			
			
			
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumDigits();

	}

}
