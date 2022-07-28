
public class Question1
{
    public static void main(String[] args)
    {
        PrintInueron(5);

        System.out.println();

        PrintSafvan(5);
    }


    static void PrintSafvan (int n)
    {

        // to print rows for all the Letters
        for (int row = 1; row <= n; row++)
        {

            // ********* to print columns with  $ Symbol  for Letter S  *********************** *
            for (int colmn = 1; colmn <= n; colmn++)
            {
                if (row == 1 || row == (n / 2 + 1) || row == n ||
                        (colmn == 1 && row != (n - 1)) || (colmn == n && row != (n / 2))
                )
                {
                    System.out.print("$");
                } else
                    System.out.print(" ");
            }
            System.out.print(" "); // some space before next Letter

            // ********* to print columns with  $ Symbol  for Letter A  *********************** *
            // to print left spaces
            for (int spaces = 1; spaces <= n - row; spaces++)
            {
                System.out.print(" ");
            }
            // to print  $ Symbol
            for (int colmn = 1; colmn <= row; colmn++)
            {
                if (row > (n / 2 + 1) && colmn == (n / 2) || row > (n / 2 + 1) && colmn == (n / 2 + 1) || // 2nd & (n/2+1)ird columns not required for both rows
                        row == n && colmn == (n - 1)      // for nth row
                )
                    System.out.print("  ");
                else
                    System.out.print("$ ");

            }

            // to print right spaces
            for (int spaces = 1; spaces <= n - row; spaces++)
            {
                System.out.print(" ");
            }
            System.out.print(" "); // some space before next Letter


            // ********* to print columns with  $ Symbol  for Letter F  *********************** *
            for (int colmn = 1; colmn <= n; colmn++)
            {
                if (row == 1 || row == (n / 2 + 1) || colmn == 1)
                    System.out.print("$ ");
                else
                    System.out.print("  ");
            }

            System.out.print(" "); // some space before next Letter


            // *********** to print columns with  $ Symbol  for Letter V  *********************** *

            // to print left spaces
            for (int space = 0; space < row; space++)
            {
                System.out.print(" ");
            }

            // to print-columns-  $ Symbol  for V
            for (int column = (n + 1 - row); column >= 1; column--)
            {
                if (column == n + 1 - row || column == 1)  // printing column in the 1st and last column
                    System.out.print("$ ");
                else
                    System.out.print("  ");
            }
            // to print right spaces
            for (int space = 0; space < row; space++)
            {
                System.out.print(" ");
            }

            System.out.print(" "); // some space before next Letter


            // ********* to print columns with  $ Symbol  for Letter A  *********************** *
            // to print left spaces
            for (int spaces = 1; spaces <= n - row; spaces++)
            {
                System.out.print(" ");
            }
            // to print  $ Symbol
            for (int colmn = 1; colmn <= row; colmn++)
            {
                if (row > (n / 2 + 1) && colmn == (n / 2) || row > (n / 2 + 1) && colmn == (n / 2 + 1) || // 2nd & (n/2+1)ird columns not required for both rows
                        row == n && colmn == (n - 1)      // for nth row
                )
                    System.out.print("  ");
                else
                    System.out.print("$ ");

            }

            // to print right spaces
            for (int spaces = 1; spaces <= n - row; spaces++)
            {
                System.out.print(" ");
            }
            System.out.print(" "); // some space before next Letter


            // ********* to print columns with  $ Symbol  for Letter N  *********************** *
            for (int colmn = 1; colmn <= n; colmn++)
            {
                if (colmn == 1 || colmn == row || colmn == n)
                {
                    System.out.print("$ ");
                } else
                    System.out.print("  ");
            }
            System.out.print(" "); // some space before next Letter


            // ********* to print a Separator Dot between name and Initial  *********************** *
            for (int column = 1; column <= n; column++)
            {
                if (row == (n - 1) && (column == (n / 2) || column == (n / 2 + 1)) ||
                        row == n && (column == (n / 2) || column == (n / 2 + 1))
                )
                    System.out.print("$");
                else
                    System.out.print(" ");
            }
            System.out.print("   "); // some space before next Letter

            // ********* to print columns with  $ Symbol  for Letter P  *********************** *
            for (int column = 1; column <= n; column++)
            {
                if (row == 1 || row == (n / 2 + 1) || column == 1 || (column == n && row != (n - 1) && row != n))
                    System.out.print("$ ");
                else
                    System.out.print("  ");
            }


            System.out.println();
        }
    }



    static void PrintInueron( int n)
    {
        for (int row=1;row<=n;row++)
        {

            // to print ' i ' in small Letter like in logo
            for (int colm=1;colm<=2;colm++)
            {

                if (row == 1)
                    System.out.print("$$");
                else
                    System.out.print("**");

            }
            System.out.print ("  "); // some space before next letter

            // To print N ,, after i
            for (int column=1;column <=n;column++)
            {
                if  (column ==1 || column == row || column == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("   "); // some space before next Letter


            // to print U
            for (int colm=1;colm<=n;colm++)
            {
                if ( (colm == 1 && row !=n) || (row==n && colm !=1 && colm !=n ) || (colm == n && row !=n  )   )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            System.out.print ("  "); // some space before next letter

            // to print E
            for (int colm=1;colm<=n;colm++)
            {
                if ( row ==1 || row==(n+1)/2 || row==n  || colm==1 )
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.print ("  "); // some space before next letter

            //  To print R
            for (int colm=1;colm<=n;colm++)
            {
                if ( ( colm ==1) || (row == 1 && colm != 5 )  ||  (row == (n+1) /2 && colm != 5)  ||
                        (row==(n-1)/2 && colm==n) ||  (row-colm == 1))
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.print ("  "); // some space before next letter



            // to print O
            for (int colm=1;colm<=n;colm++)
            {
                if (    (row == 1 && colm != 1 && colm!=n)  || (row ==n && colm !=1 && colm !=n)  ||
                        (colm == 1 && row !=1 && row !=n) || (colm ==n && row !=1 && row !=n)      )
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.print ("  "); // some space before next letter

            // To print N ,Last letter
            for (int column=1;column <=n;column++)
            {
                if  (column ==1 || column == row || column == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("   "); // some space before next Letter





            System.out.println(); // new line
        }
    }


}