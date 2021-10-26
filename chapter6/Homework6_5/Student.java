public class Student {
    private int age;
    private int grade;
    private String name;

    public Student() {
        this.age = 20;
        this.grade = 1;
        this.name = "NoName";
    }

    public Student(int age, int grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public int getGrade() {
        return this.grade;
    }

    public String getName() {
        return this.name;
    }

    public boolean setAge(int age) {
        this.grade = age;
        return true;
    }

    public boolean setGrade(int grade) {
        this.grade = grade;
        return true;
    }

    public boolean setName(String name) {
        this.name = name;
        return true;
    }

    public boolean setStudent() {
        this.age = 20;
        this.grade = 1;
        this.name = "NoName";
        return true;
    }

    public boolean setStudent(int grade) {
        this.grade = grade;
        return true;
    }

    public boolean setStudent(int age, int grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
        return true;
    }
}