package ImpPrograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[])
	{
		String word1 = "santosh";
		String word2 = "hsotnas";
		if(word1.length()!=word2.length())
		{
			System.out.println("Its not an anagram");
		}
		else 
		{
			char[] w1 = word1.toCharArray();
			char[] w2 = word2.toCharArray();
			Arrays.sort(w1);
			Arrays.sort(w2);
			if(Arrays.equals(w1, w2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not an anagram");
			}
			
		}
	}
}