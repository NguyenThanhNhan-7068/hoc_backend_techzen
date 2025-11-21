package bai_tap_ngay_19_11;

import java.util.Scanner;

public class DiemTrungBinh {
    public static void diemTrungBinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem Toan: ");
        float toan = sc.nextFloat();
        System.out.println("Nhap he so Toan: ");
        int hsToan = sc.nextInt();

        System.out.println("Nhap diem Ly: ");
        float ly = sc.nextFloat();
        System.out.println("Nhap he so Ly: ");
        int hsLy = sc.nextInt();

        System.out.println("Nhap diem Hoa: ");
        float hoa = sc.nextFloat();
        System.out.println("Nhap he so Hoa: ");
        int hsHoa = sc.nextInt();
        float diemTB = (toan * hsToan + ly * hsLy + hoa * hsHoa) / (hsToan + hsLy + hsHoa);

        System.out.println("Diem Toan: " + toan + " - He so: " + hsToan);
        System.out.println("Diem Ly: " + ly + " - He so: " + hsLy);
        System.out.println("Diem Hoa: " + hoa + " - He so: " + hsHoa);
        System.out.println("Diem trung binh: " + diemTB);
    }

    public static void main(String[] args) {
        diemTrungBinh();
    }
}
