package ImpPrograms;

import java.util.Arrays;

public class Anagram {
	public static void ana(String word1, String word2)
	{
		
		
		String word11=word1.toLowerCase();
		String word22=word2.toLowerCase();
		
		if(word11.length() != word22.length())
		{
			System.err.println("Not a anagram");
		}
		else
		{
			char[] word111=word11.toCharArray();
			char[] word222=word22.toCharArray();
			
			Arrays.sort(word111);
			Arrays.sort(word222);
			
			if(Arrays.equals(word111, word222))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not a anagram");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ana("listen", "silent");

	}

}
