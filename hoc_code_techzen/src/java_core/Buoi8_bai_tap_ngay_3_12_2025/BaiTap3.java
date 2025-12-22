package java_core.Buoi8_bai_tap_ngay_3_12_2025;

import java.util.Scanner;

public class BaiTap3 {

    public static void nhapNhanVien(String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB, int index, Scanner sc) {
        sc.nextLine();
        System.out.print("ho va ten: ");
        hoTen[index] = sc.nextLine();

        System.out.print("tuoi: ");
        tuoi[index] = sc.nextInt();
        sc.nextLine();

        System.out.print("gioi tinh: ");
        gioiTinh[index] = sc.nextLine();

        System.out.print("luong co ban: ");
        luongCoBan[index] = sc.nextDouble();

        System.out.print("diem trung binh: ");
        diemTB[index] = sc.nextDouble();
    }

    public static void xuatNhanVien(String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB, int index) {
        System.out.println("----- nhan vien " + (index + 1) + " -----");
        System.out.println("ten: " + hoTen[index]);
        System.out.println("tuoi: " + tuoi[index]);
        System.out.println("gioi tinh: " + gioiTinh[index]);
        System.out.println("luong co ban: " + luongCoBan[index]);
        System.out.println("diem trung binh: " + diemTB[index]);
    }

    public static void sapXepTheoTuoi(String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (tuoi[i] > tuoi[j]) {
                    int tempTuoi = tuoi[i];
                    tuoi[i] = tuoi[j];
                    tuoi[j] = tempTuoi;

                    String tempTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempTen;

                    String tempGT = gioiTinh[i];
                    gioiTinh[i] = gioiTinh[j];
                    gioiTinh[j] = tempGT;

                    double tempLuong = luongCoBan[i];
                    luongCoBan[i] = luongCoBan[j];
                    luongCoBan[j] = tempLuong;

                    double tempDTB = diemTB[i];
                    diemTB[i] = diemTB[j];
                    diemTB[j] = tempDTB;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so luong nhan vien: ");
        int n = sc.nextInt();

        String[] hoTen = new String[n];
        int[] tuoi = new int[n];
        String[] gioiTinh = new String[n];
        double[] luongCoBan = new double[n];
        double[] diemTB = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n=== nhan vien " + (i + 1) + " ===");
            nhapNhanVien(hoTen, tuoi, gioiTinh, luongCoBan, diemTB, i, sc);
        }

        System.out.println("\n===== DS nhan vien =====");
        for (int i = 0; i < n; i++) {
            xuatNhanVien(hoTen, tuoi, gioiTinh, luongCoBan, diemTB, i);
        }

        sapXepTheoTuoi(hoTen, tuoi, gioiTinh, luongCoBan, diemTB, n);
        System.out.println("\n===== DS nhan vien sau khi sap xep theo tuoi =====");
        for (int i = 0; i < n; i++) {
            xuatNhanVien(hoTen, tuoi, gioiTinh, luongCoBan, diemTB, i);
        }
    }
}
