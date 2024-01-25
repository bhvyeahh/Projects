import java.util.Random;
import java.util.Scanner;
public class Stone_paper_game {
    public static void main(String[] args) {
        Random number = new Random();
        Scanner sc = new Scanner(System.in);
        int n ;
        String compChoice = "",userChoice = "";
        n = number.nextInt(3); 
        if (n == 0){
            compChoice = "rock";
        }
        else if (n == 1){
            compChoice= "paper";
        }
        else {
            compChoice = "scissor";
        }
        System.out.println("--------------- WELCOME TO STONE PAPER SCISSOR GAME! ---------------\n");
        System.out.println("You have 3 choices: Rock, Paper and scissor\n");
        System.out.print("Enter your choices: ");
        String choices = sc.nextLine();
        choices = choices.toLowerCase();
        switch (choices)
        {
            case "rock":
                userChoice = "rock";
                break;
            case "paper":
                userChoice = "paper";
                break;
            case "scissor":
                userChoice = "scissor";
                break;
        }
            if (userChoice == compChoice)
            {
                System.out.println("Game Tied!!");
            }
                else if((userChoice == ("rock")    && compChoice == ("scissor"))||
                        (userChoice == ("paper")   && compChoice == ("rock"))||
                        (userChoice == ("scissor") && compChoice == ("paper")))
                {
                    System.out.println("You win");
                }
                else  {
                    System.out.println("You lose!!");
                }
                System.out.println("Computer chose: " + compChoice);
                System.out.println("You chose: " + choices);
        sc.close();
    }
}


