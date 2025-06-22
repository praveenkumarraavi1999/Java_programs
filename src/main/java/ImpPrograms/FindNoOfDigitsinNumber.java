package ImpPrograms;

public class FindNoOfDigitsinNumber {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=23145;
		int count=0;
				
				while(number>0)
				{
					int digit=number%10;
					count++;
					number=number/10;
				}
				System.out.println(count);

	}

}
