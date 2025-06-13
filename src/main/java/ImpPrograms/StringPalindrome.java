package ImpPrograms;

public class StringPalindrome {
	public static void strPalindrome(String str)
	{
		str=str.toLowerCase();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println(str+" is a palindrome");
		}
		else
		{
			System.out.println(str+" is not a palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindrome.strPalindrome("MalayaLam");

	}

}
