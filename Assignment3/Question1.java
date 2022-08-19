/*
 * write a program to reverse a string  
 */

import java.util.Scanner;

public class Question1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str1 = sc.nextLine();

		String result = "";

		// to reverse the string
		for (int i = str1.length() - 1; i >= 0; i--)
		{
			result = result + str1.charAt(i);
		}

		System.out.println("The reversed string is: " + result);
	}
}
