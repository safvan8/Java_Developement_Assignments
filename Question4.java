public class Question4
{
    public static void main(String[] args)
    {
        int n=7;
        for (int row=1;row<=(2*n);row++)
        {
            for (int colm=1;colm<=(2*n);colm++)
            {
                if( ( row - colm >=6 ) || ( row + colm >= 21)
                )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
