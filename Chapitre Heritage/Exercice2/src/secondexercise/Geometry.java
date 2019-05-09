package secondexercise;

public abstract class Geometry implements Comparable<Geometry>{
    abstract double area();

    @Override
    public int compareTo(Geometry o) {
        if(this.area() > o.area()){
            return 1;
        }else if(this.area() < o.area()){
            return -1;
        }else{
            return 0;
        }
    }
}
