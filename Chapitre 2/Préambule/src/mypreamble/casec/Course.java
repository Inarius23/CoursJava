package mypreamble.casec;

import java.util.ArrayList;

public class Course {
    String name;
    String description;
    ArrayList<Result> listResults;

    public Course(String name, String description) {
        this.name = name;
        this.description = description;
        this.listResults = new ArrayList<Result>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Result> getListResults() {
        return listResults;
    }

    public void addResults(Result result) {
        this.listResults.add(result);
    }
}
