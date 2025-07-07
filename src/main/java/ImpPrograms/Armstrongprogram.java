package ImpPrograms;

public class Armstrongprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int ori=num;
		int lastdig=0;
		int arm=0;
		int digit=String.valueOf(num).length();
		while(num>0)
		{
			lastdig=num%10;
			arm+=Math.pow(lastdig, digit);
			num=num/10;
		}
		System.out.println(arm);
		if(ori==arm)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not a armstrong");
		}

	}

}
