package java_core.buoi5_bai_tap_ngay26_11_2025;

import java.util.Scanner;

public class BaiTap7 {
    static Scanner sc = new Scanner(System.in);
    static String hoTen1, gioiTinh1;
    static int tuoi1;
    static double luongCoBan1, diemTB1;

    static String hoTen2, gioiTinh2;
    static int tuoi2;
    static double luongCoBan2, diemTB2;

    static String hoTen3, gioiTinh3;
    static int tuoi3;
    static double luongCoBan3, diemTB3;

    static String hoTen4, gioiTinh4;
    static int tuoi4;
    static double luongCoBan4, diemTB4;

    static String hoTen5, gioiTinh5;
    static int tuoi5;
    static double luongCoBan5, diemTB5;

    static void nhapNV1() {
        System.out.println("ten nv1:");
        hoTen1 = sc.nextLine();
        System.out.println("tuoi: ");
        tuoi1 = Integer.parseInt(sc.nextLine());
        System.out.println("gioi tinh: ");
        gioiTinh1 = sc.nextLine();
        System.out.println("Luong cb: ");
        luongCoBan1 = Double.parseDouble(sc.nextLine());
        System.out.println("diem TB: ");
        diemTB1 = Double.parseDouble(sc.nextLine());
    }

    static void nhapNV2() {
        System.out.println("ten nv 2:");
        hoTen2 = sc.nextLine();
        System.out.println("tuoi: ");
        tuoi2 = Integer.parseInt(sc.nextLine());
        System.out.println("gioi tinh: ");
        gioiTinh2 = sc.nextLine();
        System.out.println("Luong cb: ");
        luongCoBan2 = Double.parseDouble(sc.nextLine());
        System.out.println("diem TB: ");
        diemTB2 = Double.parseDouble(sc.nextLine());
    }

    static void nhapNV3() {
        System.out.println("ten nv 3:");
        hoTen3 = sc.nextLine();
        System.out.println("tuoi: ");
        tuoi3 = Integer.parseInt(sc.nextLine());
        System.out.println("gioi tinh: ");
        gioiTinh3 = sc.nextLine();
        System.out.println("LLuong cb: ");
        luongCoBan3 = Double.parseDouble(sc.nextLine());
        System.out.println("diem TB: ");
        diemTB3 = Double.parseDouble(sc.nextLine());
    }

    static void nhapNV4() {
        System.out.println("ten nv 4:");
        hoTen4 = sc.nextLine();
        System.out.println("tuoi: ");
        tuoi4 = Integer.parseInt(sc.nextLine());
        System.out.println("gioi tinh: ");
        gioiTinh4 = sc.nextLine();
        System.out.println("Luong cb: ");
        luongCoBan4 = Double.parseDouble(sc.nextLine());
        System.out.println("diem TB: ");
        diemTB4 = Double.parseDouble(sc.nextLine());
    }

    static void nhapNV5() {
        System.out.println("ten nv 5:");
        hoTen5 = sc.nextLine();
        System.out.println("tuoi: ");
        tuoi5 = Integer.parseInt(sc.nextLine());
        System.out.println("gioi tinh: ");
        gioiTinh5 = sc.nextLine();
        System.out.println("Luong cb: ");
        luongCoBan5 = Double.parseDouble(sc.nextLine());
        System.out.println("diem TB: ");
        diemTB5 = Double.parseDouble(sc.nextLine());
    }

    static void inNV1() {
        System.out.println("NV1: ten: " + hoTen1 + " - tuoi: "+ tuoi1 + " - gioi tinh: " + gioiTinh1 +" - luong co ban: " + luongCoBan1 +" - diem TB: " + diemTB1);
    }
    static void inNV2() {
        System.out.println("NV2: ten: " + hoTen2 + " - tuoi: "+ tuoi2 + " - gioi tinh: " + gioiTinh2 +" - luong co ban: " + luongCoBan2 +" - diem TB: " + diemTB2);
    }
    static void inNV3() {
        System.out.println("NV3: ten:" + hoTen3 + " - tuoi:"+ tuoi3 + " - gioi tinh: " + gioiTinh3 +" - luong co ban: " + luongCoBan3 +" - diem TB: " + diemTB3);
    }
    static void inNV4() {
        System.out.println("NV4: ten:" + hoTen4 + " - tuoi:"+ tuoi4 + " - gioi tinh: " + gioiTinh4 +" - luong co ban: " + luongCoBan4 +" - diem TB: " + diemTB4);
    }
    static void inNV5() {
        System.out.println("NV5: ten:" + hoTen5 + " - tuoi:"+ tuoi5 + " - gioi tinh: " + gioiTinh5 +" - luong co ban: " + luongCoBan5 +" - diem TB: " + diemTB5);
    }

    public static void main(String[] args) {
        System.out.print("Nhap nv so (1–5): ");
        int n = sc.nextInt();
        sc.nextLine();
        switch (n) {
            case 5: nhapNV5();
            case 4: nhapNV4();
            case 3: nhapNV3();
            case 2: nhapNV2();
            case 1: nhapNV1(); break;
            default: System.out.println("Số không hợp lệ!"); return;
        }
        System.out.println();
        System.out.println("===== DANH SÁCH NHÂN VIÊN =====");
        switch (n) {
            case 5: inNV5();
            case 4: inNV4();
            case 3: inNV3();
            case 2: inNV2();
            case 1: inNV1(); break;
        }
    }
}
