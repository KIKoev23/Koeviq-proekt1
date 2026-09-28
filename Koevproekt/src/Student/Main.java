package Student;

public class Main{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Koev");
        student.setAge(18);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}