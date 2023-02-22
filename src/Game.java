import java.util.Scanner;

/**
 *
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 2023/02/20
 * @since Version 1.0
 */

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public Game(Player one, Player two, Dice pair) {
        p1 = one;
        p2 = two;
        die = pair;
    }

    public static void main(String[] args) {
        Scanner smackTalkScanner = new Scanner(System.in);
        System.out.println("Can I get the name of our first contestant, please?");
        String firstPlayer = smackTalkScanner.nextLine();
        System.out.println("Can I get the name of contestant number two, please?");
        String secondPlayer = smackTalkScanner.nextLine();
        System.out.println("Please roll your dice and enter the sides here: ");
        int pair = Integer.parseInt(smackTalkScanner.nextLine());

        Dice sidedDie = new Dice(pair);
        Player playerOne = new Player(firstPlayer);
        Player playerTwo = new Player(secondPlayer);

        //Create a new Game object and pass its constructor two new Player objects, and a new Dice object.
        Game firstGame = new Game(playerOne, playerTwo, sidedDie);

        //use the Game object to call the play method and play the game.
        firstGame.play();
    }
    public void play() { //Method play
        Player current = this.p1; // needs to declare a local Player variable named current that gets assigned this.p1
        takeTurn(current); //and calls methods takeTurn,
        current = nextPlayer(current); //nextPlayer,
        takeTurn(current); //and takeTurn
        announceWinner(); //again before printing method announceWinner
    }
    public Player nextPlayer(Player current) { //Method nextPlayer
        if (current == this.p1) { //needs to use conditions to check the current Player parameter,
            current = this.p2; //and switch to the other Player
        } else {
            current = this.p1;
        }
        return current;
    }
    public void takeTurn(Player player) {
        player.toss(this.die);
    }
    public void announceWinner() { //Method announceWinner
        String p1Name = p1.getName();
        String p2Name = p2.getName();
        int p1Score = p1.getScore();
        int p2Score = p2.getScore();
        System.out.printf("Player One: %s",p1Name);
        System.out.printf("\nWith a score of: " + p1Score + "!" + "\n%s, you call that a dice roll?", p1Name);
        System.out.print("\nPlayer Two: " + p2Name);
        System.out.printf("\nWith a score of: " + p2Score + "!" + "\n%s, I've seen better... I suppose we'll announce a winner.", p2Name); //needs to display each Player's name and score,
        System.out.println("\nAnd the winner is....");
        int number = 1;

        while (true) {
            System.out.println(number);
            if (number >= 3) {
                break;
            }

            number = number + 1;
        }if (p1Score > p2Score) { //then using conditions needs to determine which Player's score is highest,
            System.out.printf("\n%s! Congratulations %s, you are a fine specimen of dice rolling abilities. %s, how does it feel to lose?", p1Name, p1Name, p2Name); //and finally return the winning Player's name.
        } else if (p2Score > p1Score) {
            System.out.printf("\n%s! Congratulations %s, you are a fine specimen of dice rolling abilities. %s, how does it feel to lose?", p2Name ,p2Name, p1Name);
        } else {
            System.out.println("We've reached a tie! We have two losers leaving the arena today. Better luck next time you two!");

        }
    }
}

