
/* 
 * Write a program  to check if the String is a Pangram or not.
 * 
 * a sentence is said to be Panagram if it contains all the letters from English alphabets.
 */


public class Question4
{
	public static void main(String[] args)
	{
		String sentence1 = "inueron";

		String sentence2 = "the five boxing wizards jump quickly"; // is a pangram

		System.out.println("INueron is Pangram : " + isPangram(sentence1));
		
		System.out.println("Sentence2  is Pangram : " + isPangram(sentence2));
	}

	static boolean isPangram(String str)
	{
		// 'a' = 97 , 'z'=122 
		for (int i = 97; i <= 122; i++)
		{
			boolean flag = false;

			for (int index = 0; index < str.length(); index++)
			{
				// if this 'if' condition is false 
                // anywhere the sentence is no Pangram
				if ((int) str.charAt(index) == i)
				{
					flag = true;
					break;
				}

			}
			if (flag == false)
				return false;
		}

		return true;
	}
}
