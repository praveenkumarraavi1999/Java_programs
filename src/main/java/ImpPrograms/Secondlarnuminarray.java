package ImpPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Secondlarnuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,5,7,8,9,5,4,3,9};
		//Set<Integer> ss=new TreeSet<>();
//		Arrays.sort(nums);
//		Arrays.asList(nums);
//		System.out.println(nums);
		Set<Integer> ss=new HashSet<Integer>();
		for(int num: nums)
		{
			ss.add(num);
		}
		System.out.println(ss);
		
		

	}

}
