package test;

import java.util.Objects;

public class Student implements Cloneable{
    private String name;
    private double mark;
    private Address address;


    public boolean equals(Object o){
        if(!(o instanceof Student)){
            return false;
        }

        Student student = (Student) o;
        return student.name.equals(name);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
