package java_core.buoi2_bai_tap_ngay_19_11;

import java.util.Scanner;

public class HinhTron {
    public static void hinhTron(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        float r = sc.nextFloat();
        float chuVi = 2 * 3.14f * r;
        float dienTich = 3.14f * r * r;

        System.out.println("Ban kinh: " + r);
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
    }

    public static void main(String[] args) {
        hinhTron();
    }
}
