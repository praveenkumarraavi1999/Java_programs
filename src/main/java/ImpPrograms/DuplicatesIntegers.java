package ImpPrograms;


import java.util.HashSet;
import java.util.Set;

public class DuplicatesIntegers {
	public static void dup()
	{
		int[] array = {1, 4, 3, 1, 4, 5, 7, 3};

        // Create an empty set
        Set<Integer> set = new HashSet<>();

        // Add each element to the set (duplicates automatically ignored)
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        // Print the set
        System.out.println("Set elements: " + set);

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dup();

	}

}
