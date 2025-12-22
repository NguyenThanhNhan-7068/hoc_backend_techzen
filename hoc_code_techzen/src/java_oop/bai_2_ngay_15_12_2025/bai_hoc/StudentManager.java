package java_oop.bai_2_ngay_15_12_2025.bai_hoc;

public class StudentManager {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("nhan");
        s1.setName("thien tu");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s2.getName());

    }
}
