
import java.util.Scanner; 
import java.util.Random; 

public class RockPaperScissors
{ 
    public static void main(String[] args) 
    { 
        String userChoice; 
        String computerChoice = ""; 
        int randInt;
        String response; 
        Scanner scan = new Scanner(System.in); 
        Random generator = new Random(); 
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Please enter a move. Rock = r, Paper = p, and Scissors = s.");
        randInt = generator.nextInt(3) ;
       
    
        if (randInt == 0) 
            computerChoice = "r"; 
        else if (randInt == 1) 
            computerChoice = "p"; 
        else if (randInt == 2) 
            computerChoice = "s"; 
        System.out.println("Enter your move: "); 
        userChoice = scan.next();
       System.out.println("the computer's move is: " + computerChoice); 
      
        if (userChoice.equals(computerChoice)) 
            System.out.println("It's a tie"); 
        else if (userChoice.equals("r")) 
            if (computerChoice.equals("s")) 
                System.out.println("Rock beats scissors. You win");
            else if (computerChoice.equals("p")) 
                System.out.println("Paper covers rock. You lose"); 
           
                else if (userChoice.equals("s")) 
                    if (computerChoice.equals("p")) 
                        System.out.println("Scissors cut paper. You win"); 
                    else if (computerChoice.equals("r")) 
                        System.out.println("Rock beats scissors. You lose"); 
                        
            else if (userChoice.equals("p")) 
                if (computerChoice.equals("s")) 
                    System.out.println("Scissor cuts paper. You lose"); 
                else if (computerChoice.equals("r")) 
                    System.out.println("Paper covers rock. You win");
                    else 
                        System.out.println("Invalid user input."); 
                        
                  
    }
}