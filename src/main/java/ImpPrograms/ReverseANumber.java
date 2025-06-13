package ImpPrograms;

public class ReverseANumber {
	public static void revNumber(int number)
	{
		int numb=number;
		int rev=0;
		while(numb>0)
		{
			rev=rev*10+numb%10;
			numb=numb/10;
			
		}
		System.out.println("Reversed num of "+number+" is "+ rev);
	}
	
	public static void main(String[] args)
	{
		revNumber(345);
	}

}
