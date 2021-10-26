import java.util.*;

public class Student {
    public int age;
    public int grade;
    public String name;
    public String id;

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