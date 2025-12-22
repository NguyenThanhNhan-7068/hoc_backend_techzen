package java_core.buoi5_bai_tap_ngay26_11_2025;

import java.util.Scanner;

public class BaiTap6 {
    static String hoTen;
    static int tuoi;
    static String gioiTinh;
    static double luongCoBan;
    static double diemTB;

    static void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();

        System.out.print("Nhap luong co ban: ");
        luongCoBan = sc.nextDouble();

        System.out.println("Nhap điem trung binh: ");
        diemTB = sc.nextDouble();
    }

    static void inThongTin() {
        System.out.println("=== THÔNG TIN NHÂN VIÊN ===");
        System.out.println("Ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("Điem tb: " + diemTB);
    }

    public static void main(String[] args) {
        nhapThongTin();
        inThongTin();
    }
}
