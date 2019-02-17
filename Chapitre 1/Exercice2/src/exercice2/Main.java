package exercice2; //jamais de chiffre dans les packages!!!!!!!!!!!!!!!!!!!!

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        BufferedReader reader = null;
        ArrayList<String> list = new ArrayList<String>();
        double average;
        String mark;
        Instant start = Instant.now();
        Duration duration;


        try{
            reader = new BufferedReader(new FileReader("fileToRead.txt"));
        }catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(1);
        }

        try{
            setArrayList(list, reader);
        }catch (IOException e){
            System.out.println(e);
        }


        average = calculateAverage(list);
        System.out.println("average : " + average);

        mark = getStudentMark(list,"arnaud@gmail.com");
        System.out.println("Student mark : " + mark);

        duration = Duration.between(start,Instant.now());
        System.out.println("Execution Time : " + duration.toMillis() + " milliseconds");

    }

    public static void setArrayList(ArrayList list, BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) { //lis le fichier jusqu'à la fin du fichier
            list.add(line);
        }
    }

    public static double calculateAverage(ArrayList list){
        double average=0;
        int mark;

        for(int i=0;i<list.size();i++) {
            mark = Integer.parseInt(list.get(i).toString().substring(list.get(i).toString().indexOf(':') + 1));
            average += mark;
        }

        if(list.size() != 0){
            return average/list.size();
        }
        return average;
    }

    public static String getStudentMark(ArrayList list, String studentEmail) {
        String mark = "student not found";

        for(int i=0;i<list.size();i++) {
            if(studentEmail.equals(list.get(i).toString().substring(0, list.get(i).toString().indexOf(':')))){
                mark = list.get(i).toString().substring(list.get(i).toString().indexOf(':')+1);
            }
        }

        return mark;
    }
}