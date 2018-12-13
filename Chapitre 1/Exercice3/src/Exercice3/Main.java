package Exercice3;//jamais de chiffre dans les packages!!!!!!!!!!!!!!!!!!!!

import java.text.ParseException;

public class Main {
    public static void main(String[] args){
        String [] array = {"1413","341","13","3151","131","666"};
        double result = 0;

        try {
            result = calculateAverage(array);
        } catch (ParseException e) {
            System.out.println("the function calculate is incorrect");
        }

        System.out.println("result : " + result);

    }

    public static double calculateAverage(String [] array) throws ParseException {
        double average = 0;

        for (String element:array){
            average += Integer.parseInt(element);
        }

        if(array.length != 0){
            return average/array.length;
        }
        return average;
    }

}

