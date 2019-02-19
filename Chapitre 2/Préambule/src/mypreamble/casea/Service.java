package mypreamble.casea;

import java.util.ArrayList;

public class Service {
    private String name;
    ArrayList<Employe> listEmployee;

    public Service(String name) {
        this.name = name;
        listEmployee = new ArrayList<Employe>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employe> getListEmployee() {
        return listEmployee;
    }

    public void addEmployee(Employe employe){

        if(!listEmployee.contains(employe)){
            listEmployee.add(employe);
            employe.setService(this);
        }else{
            System.out.println("l'employee existe déjà");
        }
    }

    public void removeEmployeeOfService(Employe employe){
        if(listEmployee.contains(employe)){
            listEmployee.remove(employe);
        }else{
            System.out.println("l'employee n'existe pas dans le service " + this.name);
        }
    }

    public void removeEmployee(Employe employe){
        if(listEmployee.contains(employe)){
            listEmployee.remove(employe);
            employe.removeService();
        }else{
            System.out.println("l'employee n'existe pas dans le service " + this.name);
        }
    }



}
