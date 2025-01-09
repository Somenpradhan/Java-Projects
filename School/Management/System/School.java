package School.Management.System;

public class School 
{
    private static int totalMoneyEarned = 0;
    private static int totalMoneySpent = 0;
    private Student[] students;
    private Teacher[] teachers;
    private Parent[] parents;
    private int studentCount;
    private int teacherCount;
    private int parentCount;

    public School() {
        students = new Student[100];
        teachers = new Teacher[100];
        parents = new Parent[100];
        studentCount = 0;
        teacherCount = 0;
        parentCount = 0;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }

    public void addStudent(Student student) {
        students[studentCount++] = student;
    }

    public void addTeacher(Teacher teacher) {
        teachers[teacherCount++] = teacher;
    }

    public void addParent(Parent parent) {
        parents[parentCount++] = parent;
    }

    public void showStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].toString());
        }
    }

    public void showTeachers() {
        for (int i = 0; i < teacherCount; i++) {
            System.out.println(teachers[i].toString());
        }
    }

    public void showParents() {
        for (int i = 0; i < parentCount; i++) {
            System.out.println(parents[i].toString());
        }
    }

    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }
}