package exercice;


import java.util.Random;

public class De {
    static final int result = 5;
    int value;
    Random rand = new Random();

    public De() {
        this.value = rand.nextInt(result) + 1;
    }

    public int getValue() {
        return value;
    }

    public void rollTheDice() {
        this.value = rand.nextInt(result) + 1;
    }


}
