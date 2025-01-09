package School.Management.System;

public class Parent 
{
    private int id;
    private String name;
    private String studentName;
    private double feesPaid;
    private double feesTotal;

    public Parent(int id, String name, String studentName, double feesTotal) 
    {
        this.id = id;
        this.name = name;
        this.studentName = studentName;
        this.feesPaid = 0;
        this.feesTotal = feesTotal;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getStudentName() 
    {
        return studentName;
    }

    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public double getFeesPaid() 
    {
        return feesPaid;
    }

    public void setFeesPaid(double feesPaid) 
    {
        this.feesPaid = feesPaid;
    }

    public double getFeesTotal() 
    {
        return feesTotal;
    }
    public String toString() 
    {
        return "Parent ID: " + id + ", Name: " + name + ", Student Name: " + studentName + ", Fees Paid: " + feesPaid + ", Total Fees: " + feesTotal;
    }
}