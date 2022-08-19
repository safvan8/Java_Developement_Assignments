
/*
 
 Write a program  to reverse a sentence while preserving the position.
Input : “Think Twice”
Output : “kniht eciwt”
 
 */
public class Question2
{
	public static void main(String[] args)
	{
		String sentence = "Think Twice";

		String result = "";

		String[] arr = sentence.split(" "); // ["Think","Twice"]

		// reversing the array
		for (int i = arr.length - 1; i >= 0; i--)
		{
			result = result + arr[i] + " "; // Twice Think
		}

		// reversing the string


		char[] c = result.toCharArray(); // converting to char array

		// reversing the string 
		
		String answer = "";
		for (int i = c.length - 1; i >= 0; i--)
		{
			answer = answer + c[i];
		}

		System.out.println(answer);

	}
}
