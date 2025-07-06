package ImpPrograms;

public class capitalword {

	public static void main(String[] args) {
		String st="i love my country";
		String[] str=st.split(" ");
		StringBuilder sb=new StringBuilder();
		for(String word:str)
		{
			if(! word.isEmpty())
			{
			String capital=Character.toUpperCase(word.charAt(0))+word.substring(1);
			sb.append(capital).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
		

	}

}
