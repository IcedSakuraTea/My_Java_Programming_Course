import java.util.Scanner;
import Student.java;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println("student1 use getGrade and setGrade, student2 use getName and setName");
        student1.setGrade(sc.nextInt());
        student2.setName(sc.next());

        System.out.println("Student1:" + "grade=" + student1.getGrade() + " name=" + student1.getName());
        System.out.println("Student2:" + "grade=" + student2.getGrade() + " name=" + student2.getName());
    }

}
