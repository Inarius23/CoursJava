package exercice;

public class Main {
    public static void main(String[] args){

        //a)
        De dice = new De();
        System.out.println("première valeur : " + dice.getValue());
        dice.rollTheDice();
        System.out.println("seconde valeur : " + dice.getValue());

        //b)
        double rolls = 0;
        double pow;
        double a = 0;

        for(int i = 0 ; i < args.length ; i++){
            a = args.length - i;
            pow = Math.pow(10, a);

            rolls += Integer.parseInt(args[i])*pow;
        }

        for (int i = 0 ; i < rolls; i++){
            dice.rollTheDice();
            System.out.println("valeur : " + dice.getValue());
        }

        //c)
        De dice2 = new De();

        for (int i = 0 ; i < rolls; i++){
            dice.rollTheDice();
            dice2.rollTheDice();
            System.out.println("valeur premier dé : " + dice.getValue());
            System.out.println("valeur deuxième dé : " + dice.getValue());
        }
    }
}
