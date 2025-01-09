package School.Management.System;

public class Main 
{
    public static void main(String[] args) 
    {
        School school = new School();

        Student student1 = new Student(1, "Soumya", "A", 10, "2005-01-01", "Sudhakara Nayak", 50000);
        Student student2 = new Student(2, "Ram", "B", 12, "2003-01-01", "GauriSankar Barik", 50000);

        Teacher teacher1 = new Teacher(1, "Ms. Neha", "Math", "123 School St");
        Teacher teacher2 = new Teacher(2, "Mr. Ram", "Science", "456 School St");

        Parent parent1 = new Parent(1, "Sudhakara Nayak", "Soumya", 50000);
        Parent parent2 = new Parent(2, "GauriSankar Barik", "Ram", 50000);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addParent(parent1);
        school.addParent(parent2);

        System.out.println("Students:");
        school.showStudents();
        System.out.println("Teachers:");
        school.showTeachers();
        System.out.println("Parents:");
        school.showParents();

        student1.setFeesPaid(20000);
        System.out.println("Remaining fees for " + student1.getName() + ": " + student1.getRemainingFees());

        School.updateTotalMoneyEarned(20000);
        System.out.println("Total money earned by the school: " + School.getTotalMoneyEarned());
    }
}