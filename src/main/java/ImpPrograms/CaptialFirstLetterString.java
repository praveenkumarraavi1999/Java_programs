package ImpPrograms;

public class CaptialFirstLetterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="i love myself";
		String[] words=input.split(" ");
		
		StringBuilder sb=new StringBuilder();
		for(String word:words)
		{
			if(!word.isEmpty())
			{
				String capital=Character.toUpperCase(word.charAt(0)) + word.substring(1);
				sb.append(capital).append(" ");
			}
		}
		System.out.println(sb.toString().trim());

	}

}
