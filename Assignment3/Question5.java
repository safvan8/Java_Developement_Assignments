/* write a program to count and print repeating characters of a given sentence.
   A character appearing more than once is considered as repeated 
  */

import java.util.ArrayList;
import java.util.List;

public class Question5
{
	public static void main(String[] args)
	{
		
		// removing spaces
		
		String sentence= "Enterprise Java with SpringBoot Development - iNueron - safvan ".replaceAll("\\s",""); 
		
		// creating an ArrayList to store the result 
		//( ArrayList is used because  we don't know number of elements in array)
		List<String> result=new ArrayList<String>();
		
		// iterating over each chara int the sentence
		for(int i=0;i<sentence.length()-1; i++)
		{
			int count=0;
			// to count repeating words
			for (int j=i+1;j<sentence.length();j++)
			{
				if( sentence.charAt(i) == sentence.charAt(j))
				{
					
					count++;
				}
			}
			
			if (count >1) // considered as repeating
				result.add(sentence.charAt(i)+" repeats "+ count +" times");
		}
		
		
		// printing the result
		for (String s: result)
		{
			System.out.println(s);
		}
	}
}
