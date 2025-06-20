package ImpPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=120;
		int rev=0;
		while(number>0)
		{
			rev=rev*10+number%10;
			number=number/10;
		}
		System.out.println(rev);
		
	}

}
