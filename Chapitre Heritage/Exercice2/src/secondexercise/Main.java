package secondexercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Geometry> list = new ArrayList<>();
        list.add(new Rectangle(10,20));
        list.add(new Square(15));
        list.add(new Ellipsis(10,20));
        list.add(new Circle(15));
        list.add(new Sphere(15));
        list.add(new Cylinder(10,20));
        list.add(new Rectangle(12,25));
        list.add(new Square(11));
        list.add(new Ellipsis(11,50));
        list.add(new Circle(135));
        list.add(new Sphere(115));
        list.add(new Cylinder(1130,250));


        list.sort((objectA, objectB)->objectA.compareTo(objectB));
        list.stream().forEach((element)-> System.out.println("area ==> " + element.area()));


    }
}
