/**
 *
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 2023/02/21
 * @since Version 1.0
 */
public class Player {
    private String name;
    private int score;

    public Player(String x) {
        name = x;
    }
    public String getName() {
         return name;
     }
     public int getScore() {
         return score;
     }
     public void toss(Dice dice) {
         score = dice.roll();
    }
}
