package bai_tap_ngay_19_11;

import java.util.Scanner;

public class BienSoXe {
    public static void bienSoXe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bien so xe: ");
        int bienSo = sc.nextInt();
        int tong = 0;
        int n = bienSo;

        while (n > 0) {
            tong += n % 10;
            n = n / 10;
        }
        int soNut = tong % 10;
        System.out.println("Bien so: " + bienSo);
        System.out.println("So nut: " + soNut);
    }

    public static void main(String[] args) {
        bienSoXe();
    }
}
