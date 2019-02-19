package mypreamble.caseb;

import java.util.ArrayList;

public class Person {
    String name;
    int age;
    String surname;
    String birthday;
    Person mother;
    Person father;
    ArrayList<Person> listChilds;

    public Person(String name, int age, String surname, String birthday, Person mother, Person father) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.birthday = birthday;
        this.mother = mother;
        mother.addChild(this);
        this.father = father;
        father.addChild(this);
        this.listChilds = new ArrayList<Person>();
    }

    public Person(String name, int age, String surname, String birthday) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.birthday = birthday;
        listChilds = new ArrayList<Person>();
    }

    public ArrayList<Person> getListChilds() {
        return listChilds;
    }

    public void setListChilds(ArrayList<Person> listChilds) {
        this.listChilds = listChilds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addChild(Person child){
        if(!this.listChilds.contains(child)){
            this.listChilds.add(child);
        }else{
            System.out.println("l'enfant existe déjà");
        }
    }
}
