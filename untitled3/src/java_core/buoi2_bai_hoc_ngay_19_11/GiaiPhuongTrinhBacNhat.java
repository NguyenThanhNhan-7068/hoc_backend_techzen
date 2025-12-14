package java_core.buoi2_bai_hoc_ngay_19_11;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void giaiPTB1() {
        Scanner sc = new Scanner((System.in));
        System.out.println("nhap so a: ");
        int a = sc.nextInt();
        System.out.println("nhap so b: ");
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("pt co vo so nghiem.");
            } else {
                System.out.println("pt vo nghiem.");
            }
        } else {
            double x = (-b / a);
            System.out.println("nghiem cua cong thuc la : " + x);
        }
    }

    public static void main(String[] args) {
        giaiPTB1();
    }
}
