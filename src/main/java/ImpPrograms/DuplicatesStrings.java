package ImpPrograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] colours= {"blue","red","blue","white","black","black"};
		Set<String> hs=new HashSet<String>();
		Collections.addAll(hs, colours);
		System.out.println(hs);
		

	}

}
