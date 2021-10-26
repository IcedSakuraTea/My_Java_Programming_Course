import java.util.*;

public class Student {
    private int grade;
    private String name;

    public Student() {
        grade = 1;
        name = "NoName";
    }

    public Student(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public boolean setAge(int age) {
        if (age < 0) {
            return false;
        }
        this.age = age;
        return true;
    }

    public boolean setId(String id) {
        this.id = id;
        return true;
    }

    public boolean setStudent(int grade, String name, String id) {
        this.grade = grade;
        this.name = name;
        this.id = id;
        return true;
    }
}