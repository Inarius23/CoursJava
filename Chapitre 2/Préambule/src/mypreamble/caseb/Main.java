package mypreamble.caseb;

public class Main {
    public static void main(String[] args){

        Person first = new Person("first",35,"person", "23/10/2312");
        Person second = new Person("second",38,"person", "23/10/2318");
        Person third = new Person("third",12,"person", "23/10/2321", first, second);

        System.out.println(third.getFather().getAge());
        System.out.println(third.getFather().getName());
        System.out.println(third.getFather().getSurname());

        System.out.println(third.getFather().getAge());
        System.out.println(third.getMother().getName());
        System.out.println(third.getMother().getSurname());

        System.out.println(first.getListChilds().get(0).getName());
        System.out.println(second.getListChilds().get(0).getName());
    }
}
