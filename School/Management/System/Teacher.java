package School.Management.System;

public class Teacher 
{
    private int id;
    private String name;
    private String subject;
    private String contactInformation;
    private String classSchedule;
    private String gradeBook;

    public Teacher(int id, String name, String subject, String contactInformation) 
    {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.contactInformation = contactInformation;
        this.classSchedule = "";
        this.gradeBook = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getClassSchedule() {
        return classSchedule;
    }

    public void setClassSchedule(String classSchedule) {
        this.classSchedule = classSchedule;
    }

    public String getGradeBook() {
        return gradeBook;
    }

    public void setGradeBook(String gradeBook) {
        this.gradeBook = gradeBook;
    }
    
    public String toString() {
        return "Teacher ID: " + id + ", Name: " + name + ", Subject: " + subject + ", Contact: " + contactInformation;
    }
}