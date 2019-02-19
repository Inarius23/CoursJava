package mypreamble.casec;

public class Result {
    String name;
    String subject;
    int mark;
    Course course;
    Student student;

    public Result(String name, String subject, int mark, Course course, Student student) {
        this.name = name;
        this.subject = subject;
        this.mark = mark;
        this.course = course;
        course.addResults(this);
        this.student = student;
        student.addResult(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
