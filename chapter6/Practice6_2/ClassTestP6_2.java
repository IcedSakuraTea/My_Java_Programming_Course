import Student.java;

public class ClassTestP6_2 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu1.setAge(19);
        stu1.setId("A0001");

        stu2.setStudent(2, "Kevin", "A0002");
        System.out.println("Age\tID\tGrade\tName");
        System.out.println(stu1.age + "\t" + stu1.id);
        System.out.println("\t" + stu2.id + "\t" + stu2.grade + "\t" + stu2.name);
    }
}