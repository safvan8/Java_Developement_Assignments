// WAP to sort a String Alphabetically.

import java.sql.Array;
import java.util.Arrays;

public class Question6
{
	public static void main(String[] args)
	{
		String str = "SaFvAn JAva".toLowerCase().replaceAll("\\s", "");

		char[] chArray = str.toCharArray();

		// performing selection sort
		for (int i = 0; i < chArray.length - 1; i++)
		{
			for (int j = i + 1; j < chArray.length; j++)
			{
				if (chArray[i] > chArray[j])
				{
					// swapping
					char temp = chArray[i];
					chArray[i] = chArray[j];
					chArray[j] = temp;
				}
			}
		}

		// System.out.println("Sorted array is: ".concat(Arrays.toString(chArray))); //
		// to print sorted array

		System.out.println("sorted string: " + new String(chArray));

		/*
		 * // To sort array using inbuilt sort() method of array
		 * 
		 * String s="hello"; 
		 * char[] ch=s.toCharArray(); Arrays.sort(ch);
		 * System.out.println(ch);
		 * 
		 * 
		 */

	}
}
