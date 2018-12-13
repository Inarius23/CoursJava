package Exercice3;

import java.text.ParseException;

public class Main {
    public static void main(String[] args){
        String [] array = {"1413","341","13","3151","131","666"};
        int result = 0;

        try {
            result = calculateAverage(array);
        } catch (ParseException e) {
            System.out.println("the function calculate is incorrect");
        }

        System.out.println("result : " + result);

    }

    public static int calculateAverage(String [] array) throws ParseException {
        int average = 0;

        for (String element:array){
            average += Integer.parseInt(element);
        }

        try{
            average/=array.length;
        }catch (RuntimeException e){
            System.out.println(e);
        }

        return average;
    }

}

