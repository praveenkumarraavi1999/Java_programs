package ImpPrograms;

public class PrintPatterns {
	
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}

		
	}
}
