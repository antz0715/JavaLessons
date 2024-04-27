import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private String grade;
    private List<String> subjects;

    public Student(String id, String name, String grade, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.subjects = new ArrayList<>(subjects);
    }

    public String getId() {
        return id;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updateGrade(String grade) {
        this.grade = grade;
    }

    public void updateSubjects(List<String> subjects) {
        this.subjects = new ArrayList<>(subjects);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade + ", Subjects: " + subjects;
    }
}

public class StudentManager {
    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline left-over

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
        scanner.close();
    }

    private static void addStudent() {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();
        System.out.print("Enter subjects (comma separated): ");
        List<String> subjects = Arrays.asList(scanner.nextLine().split(",\\s*"));

        students.add(new Student(id, name, grade, subjects));
        System.out.println("Student added successfully.");
    }

    private static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.print("Enter new name: ");
                student.updateName(scanner.nextLine());
                System.out.print("Enter new grade: ");
                student.updateGrade(scanner.nextLine());
                System.out.print("Enter new subjects (comma separated): ");
                student.updateSubjects(Arrays.asList(scanner.nextLine().split(",\\s*")));
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        String id = scanner.nextLine();
        Student found = null;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                found = student;
                break;
            }
        }
        if (found != null) {
            students.remove(found);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student ID not found.");
        }
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("\nList of Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
