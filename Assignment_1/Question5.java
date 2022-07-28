public class Question5
{
    public static void main(String[] args)
    {
        int n=7;
        for (int row=1;row<=(2*n);row++)
        {
            for (int colm=1;colm<=(2*n);colm++)
            {
                if ( ( row + colm <= n+1) || (row - colm >= n-1) || (row ==1) || (row == 2 *n)
                )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}