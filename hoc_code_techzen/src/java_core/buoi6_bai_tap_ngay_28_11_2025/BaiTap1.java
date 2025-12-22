package java_core.buoi6_bai_tap_ngay_28_11_2025;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String chuoi = "Hello World";
        String tuWorld = chuoi.substring(6);
        System.out.println("a. lay chu sau = " + tuWorld);
        System.out.println("b. Thay o thanh f = " + chuoi.replace("o", "f"));
        int demL = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == 'l') demL++;
        }
        System.out.println("c. so chu l = " + demL);

        System.out.println("d. Vi tri đau = " + chuoi.indexOf('l'));
        System.out.println("   Vi tri cuoi = " + chuoi.lastIndexOf('l'));

        System.out.println("e. xoa khoang trang = " + chuoi.replace(" ", ""));
        System.out.println("f. Trim = " + chuoi.trim());

        StringBuilder daoChuoi = new StringBuilder(chuoi);
        System.out.println("g. dao chuoi = " + daoChuoi.reverse().toString());

        String tenTruong = "SQC";
        System.out.println("h. Ghep chuoi = " + tenTruong + " " + chuoi);

        System.out.println("i. in hoa = " + tenTruong.toUpperCase());
        System.out.println("k. in chu thuong = " + tenTruong.toLowerCase());

        System.out.print("Nhap n: ");
        int n = nhap.nextInt();
        System.out.print("Nhap m: ");
        int m = nhap.nextInt();
        System.out.println("l. Chuoi con = " + tenTruong.substring(n, m));
    }
}
