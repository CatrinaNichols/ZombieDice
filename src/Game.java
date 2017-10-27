
import java.util.Scanner;

public class Game {
        /*
    d.	Game – This class is the proverbial brains of the application.
    This class is the ONLY class allowed to interact directly with the users at the keyboard.
    This class will have exactly two instances of Player and three instances of Die.
    This class is also the only one allowed to interact directly with the Cup class to get new dice.
     */
    private static void game(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        Cup cup = new Cup();
        /*
        1.	Every game is 2-player (human vs. human). At the beginning of the game, the players are each prompted to enter his/her name.
             a.	If the name entered is the empty string, the name defaults to “Player1” or “Player2” appropriately.
         */
        System.out.println("Player 1, please enter name.");
        String player1 = scanner.nextLine();
            if (player1.equals("")) {
                String player1="Player1";
            }
        System.out.println("Player 2, please enter name.");
        String player2 = scanner.nextLine();
        if (player1.equals("")) {
            String player2="Player2";
        }
        boolean turn = true;
        while (turn)
        //2.	Player 1 goes first.
        //3.	During a turn, the current player’s name, “brains eaten”, “survivors cornered”, and “shots fired” are displayed.
            System.out.println(player1);
            System.out.println("Brains Eaten: " + player1.showBrains + "\nSurvivors Cornered: " + player1.showCornered + "\nShots Fired: " + player1.showShots;
        int tempbrains=0;
        //5.	The player begins his/her turn by rolling the dice.
        System.out.println(cup);


        if (player1.shotsfired >= 3){
            turn = false;
            tempbrains = 0;
        }
        //6.	After each roll, the player can choose to stop and eat the brains of the cornered survivors or continue to roll in an effort to gather more brains.
            /*
            a.	If the player stops, the brains of the cornered survivors are eaten.
            Add the value from “cornered survivors” to “brains eaten” and end the player’s turn.
            b.	If the player chooses to roll again, he/she MUST reroll dice that came up as footprints.
            New dice are created for those that came up brains or shotgun blasts.
             */
            System.out.println(" Would you like to continue? y/n");
            String cont = scanner.nextLine();
            if (cont.equals("n")){
                turn = false;
                player1.showbrains = tempbrains + player1.showbrains;

            }


    }
}
