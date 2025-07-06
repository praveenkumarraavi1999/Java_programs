package ImpPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Hi love is love and you are not is a love ";
		String[] words=input.split(" ");
		//Set<String> hs=new HashSet<String>();
		Set<String> hs=new LinkedHashSet<String>();
		for(String word:words)
		{
			if(hs.add(word))
			{
				
			}
		}
		System.out.print(hs);
		

	}

}
