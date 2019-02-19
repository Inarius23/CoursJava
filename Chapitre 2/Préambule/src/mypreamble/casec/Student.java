package mypreamble.casec;

import java.util.ArrayList;

public class Student {
    int name;
    int surname;
    int age;
    ArrayList<Result> listResult;

    public Student(int name, int surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.listResult = new ArrayList<Result>();
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getSurname() {
        return surname;
    }

    public void setSurname(int surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Result> getListResult() {
        return listResult;
    }

    public void addResult(Result result){
        this.listResult.add(result);
    }
}
