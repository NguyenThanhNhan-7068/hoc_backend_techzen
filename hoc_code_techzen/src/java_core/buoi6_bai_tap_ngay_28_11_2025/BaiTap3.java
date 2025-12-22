package java_core.buoi6_bai_tap_ngay_28_11_2025;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap chuoi a: ");
        String a = nhap.nextLine();
        System.out.print("nhp chuoi b: ");
        String b = nhap.nextLine();
        int ketQua = a.compareTo(b);
        if (ketQua == 0)
            System.out.println("a = b");
        else if (ketQua < 0)
            System.out.println("a < b");
        else
            System.out.println("a > b");
    }
}
