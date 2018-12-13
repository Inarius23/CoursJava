package Exercice3;

import java.text.ParseException;

public class Main {
    public static void main(String[] args){
        String [] array = {"1413","341","13","3151","131","666"};
        int result;

        result = calculateAverage(array);

        System.out.println("result : " + result);

    }

    public static int calculateAverage(String [] array){
        int average = 0;

        for (String element:array){
            try {
                average += Integer.parseInt(element);
            }catch (Exception e) {
                System.out.println(element + " is not a interger");
                System.out.println("Error : " + e.getMessage());
            }
        }

        return average/array.length;
    }
}
