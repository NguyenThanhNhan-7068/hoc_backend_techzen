package java_oop.bai_3_ngay_17_12_2025.bai_tap.Bai_1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "Nhan", 9.5);
        Student s2 = new Student("SV02", "VI", 7.0);
        Student s3 = new Student("SV03", "Khanh", 9.0);

        System.out.println("So luong sinh vien: " + Student.getStudentCount());
    }
}
