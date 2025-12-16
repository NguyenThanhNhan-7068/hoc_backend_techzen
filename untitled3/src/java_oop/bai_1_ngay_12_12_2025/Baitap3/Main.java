package java_oop.bai_1_ngay_12_12_2025.Baitap3;

public class Main {
    public static void main(String[] args) {
        Point diem1 = new Point();
        Point diem2 = new Point();

        System.out.println("nhap diem thu nhat:");
        diem1.input();
        System.out.println("nhap diem thu 2:");
        diem2.input();
        System.out.println("khoang cach la: " + diem1.distanceTo(diem2));
    }
}

