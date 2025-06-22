package ImpPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesIngersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,4,3,2,1,4,6,8,2,3,6};
		Set<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<=numbers.length-1;i++)
		{
			if(hs.add(numbers[i]))
			{
				System.out.println("uniques numbers "+numbers[i]);
			}
//			else
//			{
//				System.out.println("duplicates "+numbers[i]);
//			}
		}

	}

}
