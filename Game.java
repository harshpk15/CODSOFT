import java.util.Scanner;
import java.util.Random;

public class Game 
{
    public static void main(String[] args)
    {
        Random random=new Random();
        Scanner S=new Scanner(System.in);
        int round=0;
        int score=0;
        int attempts=1;
        boolean playagain=true;

        while(playagain)
        {
            int targetNumber=random.nextInt(100);
            System.out.println("Round"+(round+1));
            while (attempts<10)
             {
                System.out.print("Enter your guess (1 to 100): ");
                int userGuess = S.nextInt();
                attempts++;
                
                if (userGuess == targetNumber) 
                {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                } 
                else if (userGuess < targetNumber) 
                {
                    System.out.println("Too low! Try again.");
                } 
                else 
                {
                    System.out.println("Too high! Try again.");
                }
                
                if (attempts>=10)
                {
                    System.out.println("Out of attempts! The correct number was " + targetNumber);
                }
            }
            round++;

            System.out.print("Do you want to play another round? (yes/no): ");
            String playString=S.next();
            playagain=playString.equals("yes");
        }
        
        System.out.println("Game over! Your final score is: " + score);
        S.close();
    }
}

