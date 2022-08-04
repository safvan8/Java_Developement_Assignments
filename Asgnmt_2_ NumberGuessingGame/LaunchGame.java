import java.util.Scanner;
/**
 * 
 * @author safvan.p
 *
 */
class Guesser
{
	private int numberGuessed;
	private int validNumber;

	public int guessTheNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser please Enter the Guessed number :");

        // to restrict guesser input between 1 to 10
        boolean flag = true;
        while (flag)
        {
            numberGuessed = scan.nextInt();
            if (numberGuessed > 0 && numberGuessed <= 10)
            {
                flag = false;
                validNumber = numberGuessed;
                System.out.println("########Valid number guessed by Guesser  is :" + validNumber+" ########");
            }
            else
            {
                System.out.println("Invalid Number guessed ! Try  a number between 1 to 10 ");
            }
        }
        return validNumber;

    }

}

class Player
{
	private int numberPredicted;
	private int validNumber;

    // to count the number of players
    static int playerCount = 0;

    // to restrict player input between 1 to 10
    public int predictTheNumber()
    {
        playerCount++;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the number predicted by the player " + playerCount);

        boolean flag=true;
        while (flag)
        {
            numberPredicted = scan.nextInt();

            if (numberPredicted > 0 && numberPredicted <= 10)
            {
                validNumber = numberPredicted;
                System.out.println("********* Valid number Guessed by Player "+ playerCount+ " is :" + validNumber+" *********" );
                flag = false; // to exit from the loop
            }
            else
            {
                System.out.println("Invalid Number ! Predict a number between 1 to 10 ");
            }

        }
        return validNumber;
    }

}

class Umpire
{
	private int numberFromGuesser;
	private int numberFromPlayer1;
	private int numberFromPlayer2;
	private int numberFromPlayer3;

    // method to collect number from the Guesser and Players
	public void collectNumers()
    {
        // collecting number from the Guesser
        Guesser guessingMan = new Guesser();
        numberFromGuesser = guessingMan.guessTheNumber();

        // collecting numbers from the 3 player

        // creating 3 player objects by each players
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        // to predict 3 numbers
        numberFromPlayer1 = player1.predictTheNumber();
        numberFromPlayer2 = player2.predictTheNumber();
        numberFromPlayer3 = player3.predictTheNumber();
    }

    // method for finding the winner by comparing predicted values
    public void compareAndFindWinner()
    {
        System.out.println("\n!!!!!!!!!!!!!!! RESULT !!!!!!!!!!!!!!!\n");

        if (numberFromGuesser == numberFromPlayer1)
        {
            if (numberFromGuesser == numberFromPlayer2)
            {
                if (numberFromGuesser == numberFromPlayer3)
                    System.out.println("All three Players Guessed correctly !!!");
                else
                    System.out.println(" Player 1 and Player 2 Won the game !!");
            }
            else if (numberFromGuesser == numberFromPlayer3)
                System.out.println(" Player 1 and Player 3 won the game!!");
            else
                System.out.println(" Player1 won the game ");
        }

        else if (numberFromGuesser == numberFromPlayer2)
        {
            if (numberFromGuesser == numberFromPlayer3)
                System.out.println("Player 2 and Player 3 won the game!!! ");
            else
                System.out.println("Player 2 won the game!!");
        }

        else if (numberFromGuesser == numberFromPlayer3)
            System.out.println("Player 3 won the game !!");

        else
            System.out.println("GAME OVER !! \n  All prediction are  wrong ");

    }
    
    public void displaySummary()
    {
    	// creating an array to store player values
    	int[] accuracyOfPlayer= new int[4];
    	
    	// array index denotes the player number
    	// finding the difference between guessed and predicted number , and storing to array )
		accuracyOfPlayer[1] = howCloseToGuesserNum(numberFromPlayer1);  
		accuracyOfPlayer[2] = howCloseToGuesserNum(numberFromPlayer2);
		accuracyOfPlayer[3] = howCloseToGuesserNum(numberFromPlayer3);
    	
		System.out.println("\n==================Game Summary=============");
		// printing the how close the prediction
		for (int playerNum = 1; playerNum < accuracyOfPlayer.length; playerNum++)
		{
			if (accuracyOfPlayer[playerNum] == 0)
			{
				System.out.println(" The player" + playerNum + " guessed correcctly!!!!!");
				continue;
			}

			System.out.println(" The player" + playerNum + " is " + accuracyOfPlayer[playerNum] + " digits away!!!");

		}
    	
    			
    }
    
    // to find closeness of the predicted number towards guessed number
	int howCloseToGuesserNum(int num)
	{
		if (num > numberFromGuesser)
			return num - numberFromGuesser;
		else
			return numberFromGuesser - num;
	}
}

public class LaunchGame
{
    public static void main(String[] args)
    {
        Umpire umpr = new Umpire();
        umpr.collectNumers();
        umpr.compareAndFindWinner();
        umpr.displaySummary();
    }
}
