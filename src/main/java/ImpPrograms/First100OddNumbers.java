package ImpPrograms;

public class First100OddNumbers {
	public static void first()
	{
		int number;
		
		for(int i=1;i<=100;i++)
		{
			//if(number[i])
			//System.out.println(i);
			if(i%2 !=0)  //odd
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first();

	}

}
