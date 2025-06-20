package ImpPrograms;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=121;
		int rev=0;
		while(number>0)
		{
			rev=rev*10+number%10;
			number=number/10;
			
		}
		//System.out.println(rev);
		if(rev ==number)
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");

		}

	}

}
