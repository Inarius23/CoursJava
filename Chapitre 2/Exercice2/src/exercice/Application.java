package exercice;

import java.util.ArrayList;

public class Application  {

    ArrayList<ArrayList<Mark>> list;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public void print(){
        for(int i = 0; i < this.list.size(); i++){
            System.out.println("STUDENT " + i);
            for(int j = 0 ; j < this.list.get(i).size() ; i++){
                System.out.println("mark " + i + " : " + this.list.get(i).get(j));
            }
            System.out.println(" ");
        }
    }

    public float average(int position){
        float average = 0;
        int number = this.list.get(position).size();

        for(int i = 0; i < this.list.get(position).size() ; i++){
            average += this.list.get(position).get(i).getValue();
        }
        average = average / number;

        return average;
    }

    public void add(int position, String subject,float value){
        Mark mark = new Mark(value, subject);
        this.list.get(position).add(mark);
    }

    public int compute(){
        int size=0;

        for(int i = 0; i<this.list.size() ; i++){
            if(size < this.list.get(i).size()){
                size = this.list.get(i).size();
            }
        }

        return size;
    }

    public float [] avgs(){
        float[] averages= new float[this.list.size()];

        for(int i = 0; i < averages.length; i++){
            averages[i] = average(i);
        }

        return averages;
    }
}
