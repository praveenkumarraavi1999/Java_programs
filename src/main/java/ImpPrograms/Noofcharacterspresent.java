package ImpPrograms;

public class Noofcharacterspresent {
	public static void chars() throws InterruptedException
	{
		String word="praveenkumar";
		int count=0;
		for(int i=0;i<=word.length()-1;i++)
		{
			//if(word.charAt(i)=='a')
			if(word.charAt(i)=='a')
			{
				count++;
				Thread.sleep(10);
			}
			
			
			
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Noofcharacterspresent.chars();
		Noofcharacterspresent nn=new Noofcharacterspresent();
		//nn.chars();
	}

}
