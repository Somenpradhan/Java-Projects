import java.util.Scanner;

interface CrudOperations 
{
    void create();
    void read();
    void update();
    void delete();
}

class Management implements CrudOperations 
{
    private String[] managementRecords = new String[10]; // Assuming a maximum of 10 records
    private Scanner scanner;

    public Management(Scanner scanner) 
    {
        this.scanner = scanner;
    }

    @Override
    public void create() 
    {
        System.out.print("Enter ID (1-10): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Role: ");
        String role = scanner.nextLine();
        if (id >= 1 && id <= 10) 
        {
            managementRecords[id - 1] = role;
            System.out.println("Management record created: ID " + id + ", Role " + role);
        } 
        else 
        {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void read() 
    {
        System.out.print("Enter ID (1-10): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 1 && id <= 10 && managementRecords[id - 1] != null) 
        {
            System.out.println("Management record ID " + id + ": " + managementRecords[id - 1]);
        } else {
            System.out.println("Record not found");
        }
    }

    @Override
    public void update() 
    {
        System.out.print("Enter ID (1-10): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 1 && id <= 10 && managementRecords[id - 1] != null) 
        {
            System.out.print("Enter new Role: ");
            String role = scanner.nextLine();
            managementRecords[id - 1] = role;
            System.out.println("Management record updated: ID " + id + ", New Role " + role);
        } else {
            System.out.println("Record not found");
        }
    }

    @Override
    public void delete() {
        System.out.print("Enter ID (1-10): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 1 && id <= 10 && managementRecords[id - 1] != null) {
            managementRecords[id - 1] = null;
            System.out.println("Management record deleted: ID " + id);
        } else {
            System.out.println("Record not found");
        }
    }
}

class Teacher implements CrudOperations {
    private String[][] teacherRecords = new String[10][2]; // Assuming a maximum of 10 teachers
    private Scanner scanner;

    public Teacher(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void create() {
        System.out.print("Enter ID (101-110): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        if (id >= 101 && id <= 110) {
            int index = id - 101;
            teacherRecords[index][0] = name;
            teacherRecords[index][1] = subject;
            System.out.println("Teacher record created: ID " + id + ", Name " + name + ", Subject " + subject);
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void read() {
        System.out.print("Enter ID (101-110): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 101 && id <= 110) {
            int index = id - 101;
            if (teacherRecords[index][0] != null) {
                System.out.println("Teacher record ID " + id + ": Name " + teacherRecords[index][0] + ", Subject " + teacherRecords[index][1]);
            } else {
                System.out.println("Record not found");
            }
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void update() {
        System.out.print("Enter ID (101-110): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 101 && id <= 110) {
            int index = id - 101;
            if (teacherRecords[index][0] != null) {
                System.out.print("Enter new Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new Subject: ");
                String subject = scanner.nextLine();
                teacherRecords[index][0] = name;
                teacherRecords[index][1] = subject;
                System.out.println("Teacher record updated: ID " + id + ", New Name " + name + ", New Subject " + subject);
            } else {
                System.out.println("Record not found");
            }
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void delete() {
        System.out.print("Enter ID (101-110): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 101 && id <= 110) {
            int index = id - 101;
            if (teacherRecords[index][0] != null) {
                teacherRecords[index][0] = null;
                teacherRecords[index][1] = null;
                System.out.println("Teacher record deleted: ID " + id);
            } else {
                System.out.println("Record not found");
            }
        } else {
            System.out.println("Invalid ID");
        }
    }
}

class Student implements CrudOperations {
    private String[][] studentRecords = new String[10][2]; // Assuming a maximum of 10 students
    private Scanner scanner;

    public Student(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void create() {
        System.out.print("Enter ID (201-210): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();
        if (id >= 201 && id <= 210) {
            int index = id - 201;
            studentRecords[index][0] = name;
            studentRecords[index][1] = grade;
            System.out.println("Student record created: ID " + id + ", Name " + name + ", Grade " + grade);
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void read() {
        System.out.print("Enter ID (201-210): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 201 && id <= 210) {
            int index = id - 201;
            if (studentRecords[index][0] != null) {
                System.out.println("Student record ID " + id + ": Name " + studentRecords[index][0] + ", Grade " + studentRecords[index][1]);
            } else {
                System.out.println("Record not found");
            }
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void update() {
        System.out.print("Enter ID (201-210): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 201 && id <= 210) {
            int index = id - 201;
            if (studentRecords[index][0] != null) {
                System.out.print("Enter new Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new Grade: ");
                String grade = scanner.nextLine();
                studentRecords[index][0] = name;
                studentRecords[index][1] = grade;
                System.out.println("Student record updated: ID " + id + ", New Name " + name + ", New Grade " + grade);
            } else {
                System.out.println("Record not found");
            }
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void delete() {
        System.out.print("Enter ID (201-210): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 201 && id <= 210) {
            int index = id - 201;
            if (studentRecords[index][0] != null) {
                studentRecords[index][0] = null;
                studentRecords[index][1] = null;
                System.out.println("Student record deleted: ID " + id);
            } else {
                System.out.println("Record not found");
            }
        } else {
            System.out.println("Invalid ID");
        }
    }
}

class Parent implements CrudOperations {
    private String[][] parentRecords = new String[10][2]; // Assuming a maximum of 10 parents
    private Scanner scanner;

    public Parent(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void create() {
        System.out.print("Enter ID (301-310): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Relation: ");
        String relation = scanner.nextLine();
        if (id >= 301 && id <= 310) {
            int index = id - 301;
            parentRecords[index][0] = name;
            parentRecords[index][1] = relation;
            System.out.println("Parent record created: ID " + id + ", Name " + name + ", Relation " + relation);
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void read() {
        System.out.print("Enter ID (301-310): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 301 && id <= 310) {
            int index = id - 301;
            if (parentRecords[index][0] != null) {
                System.out.println("Parent record ID " + id + ": Name " + parentRecords[index][0] + ", Relation " + parentRecords[index][1]);
            } else {
                System.out.println("Record not found");
            }
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void update() {
        System.out.print("Enter ID (301-310): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 301 && id <= 310) {
            int index = id - 301;
            if (parentRecords[index][0] != null) {
                System.out.print("Enter new Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new Relation: ");
                String relation = scanner.nextLine();
                parentRecords[index][0] = name;
                parentRecords[index][1] = relation;
                System.out.println("Parent record updated: ID " + id + ", New Name " + name + ", New Relation " + relation);
            } else {
                System.out.println("Record not found");
            }
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void delete() {
        System.out.print("Enter ID (301-310): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (id >= 301 && id <= 310) {
            int index = id - 301;
            if (parentRecords[index][0] != null) {
                parentRecords[index][0] = null;
                parentRecords[index][1] = null;
                System.out.println("Parent record deleted: ID " + id);
            } else {
                System.out.println("Record not found");
            }
        } else {
            System.out.println("Invalid ID");
        }
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management(scanner);
        Teacher teacher = new Teacher(scanner);
        Student student = new Student(scanner);
        Parent parent = new Parent(scanner);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Manage Management Records");
            System.out.println("2. Manage Teacher Records");
            System.out.println("3. Manage Student Records");
            System.out.println("4. Manage Parent Records");
            System.out.println("5. Exit");
            System.out.println("Choose from the above Options (1/2/3/4/5)");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manageSection("Management", management);
                    break;
                case 2:
                    manageSection("Teacher", teacher);
                    break;
                case 3:
                    manageSection("Student", student);
                    break;
                case 4:
                    manageSection("Parent", parent);
                    break;
                case 5:
                    System.out.println("Thank You");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void manageSection(String sectionName, CrudOperations operations) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Managing " + sectionName + " records:");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Back to main menu");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    operations.create();
                    break;
                case 2:
                    operations.read();
                    break;
                case 3:
                    operations.update();
                    break;
                case 4:
                    operations.delete();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}