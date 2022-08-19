
// WAP to count the number of Vowels and Consonants present inside a String

public class Question7
{
	public static void main(String[] args)
	{
		String name = "Java Developer";

		// to find number of vowels and consonants

		int vowels = 0;
		int consonants = 0;

		String str = name.replaceAll("\\s", ""); // to remove all spaces

		for (int i = 0; i < str.length(); i++)
		{

			char c = str.charAt(i);
			if ((int) c >= 65 && (int) c >= 65)
			{

				if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'I' || c == 'i' || c == 'o' || c == 'O'
						|| c == 'u' || c == 'U')
				{
					vowels++;
				} else
					consonants++;
			}
		}

		System.out.println("Count of Vowels: " + vowels + "  " + " Consonants: " + consonants);
	}
}
