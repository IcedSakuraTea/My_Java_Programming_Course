import StudentP6_1.java;

public class ClassTestP6_1 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.age = 18;
        stu1.grade = 1;
        stu1.name = "Kevin";
        stu1.id = "A00001";

        System.out.println(stu1.getName());
        System.out.println(stu1.getId());
        System.out.println(stu1.getAge());
    }
}