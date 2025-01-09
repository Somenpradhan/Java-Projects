package School.Management.System;

public class Student 
{
    private int id;
    private String name;
    private String section;
    private int grade;
    private String dateOfBirth;
    private String parentsInformation;
    private double feesPaid;
    private double feesTotal;

    public Student(int id, String name, String section, int grade, String dateOfBirth, String parentsInformation, double feesTotal) {
        this.id = id;
        this.name = name;
        this.section = section;
        this.grade = grade;
        this.dateOfBirth = dateOfBirth;
        this.parentsInformation = parentsInformation;
        this.feesPaid = 0;
        this.feesTotal = feesTotal;
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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(double feesPaid) {
        this.feesPaid = feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(double feesTotal) {
        this.feesTotal = feesTotal;
    }

    public double getRemainingFees() {
        return feesTotal - feesPaid;
    }

    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Section: " + section + ", Grade: " + grade +
               ", Date of Birth: " + dateOfBirth + ", Fees Paid: " + feesPaid + ", Total Fees: " + feesTotal;
    }
}