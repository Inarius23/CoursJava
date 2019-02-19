package mypreamble.casea;

import java.util.ArrayList;

public class Employe {
    private String name;
    private int id;
    private String job;
    private Service service;


    public Employe(String name, int id, String job, Service service) {
        this.name = name;
        this.id = id;
        this.job = job;
        this.service = service;
        service.addEmployee(this);
    }

    public void removeFromService(){
        if(this.service.listEmployee.contains(this)){
            this.service.removeEmployeeOfService(this);
        }
        this.service = null;
    }

    public void removeService(){
        this.service = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
