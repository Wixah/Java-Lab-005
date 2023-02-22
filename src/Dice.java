/**
 *
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 2023/02/21
 * @since Version 1.0
 */
import java.util.Random;

public class Dice {
    public int sideFacingUp;
    public int sides;
    public Random randomGenerator;

    // Constructor
    public  Dice(int sides) {
        this.sides = sides;
        randomGenerator = new Random();// this is a keyword for "this" object that's being created.
    }

    public int roll(){
        this.sideFacingUp = this.randomGenerator.nextInt(this.sides);
        return sideFacingUp;
    }

}

