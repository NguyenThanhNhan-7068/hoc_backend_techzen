package java_oop.bai_2_ngay_15_12_2025.bai_tap.bai_tap_3;

public class Main {
    public static void main(String[] args) {
        Student sv = new Student(1, "nhan", -8);
//        sv.setName("");
//        sv.setScore(-5);
        System.out.println("================================");
        System.out.println("ID: " + sv.getId());
        System.out.println("Ten: " + sv.getName());
        System.out.println("Diem: " + sv.getScore());
    }

}

