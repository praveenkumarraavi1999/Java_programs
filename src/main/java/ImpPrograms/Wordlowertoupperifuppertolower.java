package ImpPrograms;

public class Wordlowertoupperifuppertolower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="hellO worLd JAVA SelenIuM TesT";
		String[] input1=input.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for(String input2 : input1)
		{
			if(input2.equals(input2.toLowerCase()))
			{
				sb.append(input2.toUpperCase());
			}
			else
			{
				if(input2.equals(input2.toUpperCase()))
				{
					sb.append(input2.toLowerCase());
				}
			}
		}
		System.out.println(sb);

	}

}
