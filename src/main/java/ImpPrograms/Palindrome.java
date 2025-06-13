package ImpPrograms;

public class Palindrome {
	public static void palin(int num)
	{
		int number=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(rev==number)
		{
			System.out.println(number+" is a palindrome");
		}
		else
		{
			System.out.println(number +" is not a palindrome");
		}
			
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Palindrome.palin(141);

	}
//	hghghgh
}
