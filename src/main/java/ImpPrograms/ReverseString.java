package ImpPrograms;

public class ReverseString {
	public static void revString(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("rev of "+str+" is "+rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString.revString("praveen");

	}

}
