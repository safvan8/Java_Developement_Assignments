


/*
 * Write a program  to count number of special characters.
 * 
 Special Characters(32–47 / 58–64 / 91–96 / 123–126): 
 Special characters include all printable characters that are neither letters nor numbers. 
 These include punctuation or technical, mathematical characters. 
 */

import java.util.ArrayList;
import java.util.List;

public class Question8
{
    public static void main(String[] args)
    {
        String sentence = "Ent~erPrise J@V@ w!th $pringb00t^$".replaceAll("\\s", ""); // trim remove all spaces
        
        // to display special Characters in result with index
        ArrayList<String> specialChars =new ArrayList<String>();
        
        int count = 0;
        for (int i = 0; i < sentence.length(); i++)
        {

			int s= sentence.charAt(i);
            if ((s >= 32 && s <= 47) || (s >= 58 && s <= 64)
                    || (s >= 91 && s <= 96) || (s >= 123 && s <= 126))
            {
                count++;
                specialChars.add(sentence.charAt(i)+" index: "+i);
            }
        }
        
        System.out.println("Total number of special characters: "+ count);
        System.out.println("\n"+specialChars);
    }
}
