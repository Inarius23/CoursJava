package exercice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("fileToRead.txt"));
        ArrayList<String> list = new ArrayList<String>();
        int sizeArrayList;
        int average;
        String mark;
        Instant start = Instant.now();
        Duration duration;

        setArrayList(list, reader);

        average = calculateAverage(list);
        System.out.println("average : " + average);

        mark = getStudentMark(list,"arnaud@gmail.com");
        System.out.println("Student mark : " + mark);

        duration = Duration.between(start,Instant.now());
        System.out.println("Execution Time : " + duration.toMillis() + " milliseconds");

    }

    public static void setArrayList(ArrayList list, BufferedReader reader) throws IOException {
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) { //lis le fichier jusqu'à la fin du fichier
            list.add(line);
        }
    }

    public static int calculateAverage(ArrayList list){
        int average=0;
        int mark;

        for(int i=0;i<list.size();i++) {
            mark = Integer.parseInt(list.get(i).toString().substring(list.get(i).toString().indexOf(':') + 1));
            average += mark;
        }

        return average/list.size();
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