/*
 * Write a program  to check if  string2 is anagram of String1.
 * eg:- string1 : car
 *      string2 : arc  
 *      
 *     Expected result : String1 is an anagram of string2
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String 1: ");
		String str1 = sc.next().toLowerCase();
		
		System.out.print("Enter string 2 (to check anagram of String 1) :  ");
		String str2 = sc.next().toLowerCase(); // check str2 is anagram of str1
		
		char[] chArray = str1.toCharArray();

		List<Character> str1List = new ArrayList<Character>();
		
		// adding char array to array list
		for (int i: chArray)
		{
			str1List.add((char) i);
		}
		
		int trueCounts=0;
		
		// iterating over str2
		for (int i=0; i< str2.length() ;i++)
		{
			boolean flag=false;
			
			if ( str1List.contains(str2.charAt(i)) )
			{		
				flag= true;
				trueCounts++;
				continue;
			}
			
			if (flag== false)
			{
				System.out.println("\nString2 is not an anagram of String1 ");
				System.exit(0);
			} 
		}
		
		if (str1.length() == trueCounts)
		{
			System.out.println("\nString2 is an anagram of String1");
		}
		else
		{
			System.out.println("\nString2 is not an anagram of String1");
		}
	}
}
