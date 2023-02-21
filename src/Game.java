/**
 *
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 2023/02/10
 * @since Version 1.0
 */
import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public void play() {
    }

    public Player nextPlayer(Player current) {
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
    }

    public static void main(String[] args) {
    }
}
