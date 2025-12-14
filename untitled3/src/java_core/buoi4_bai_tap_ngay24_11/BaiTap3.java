package java_core.buoi4_bai_tap_ngay24_11;

import java.util.Scanner;

public class BaiTap3 {
    public static void inDaySoC1() {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        while (n <= 0);

        for (int i = 2; i <= n; i += 2) {
            if (i % 6 == 0) {
                System.out.print(-i + " ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
    public static void inDaySoC2() {
        Scanner sc = new Scanner(System.in);
        int n, dem = 0;
        int distance = 3;
        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        while (n <= 0);

        for (int i = 2; i <= n; i += 2) {
            dem++;
            if (dem == distance) {
                System.out.print(-i + " ");
                dem = 0;
            }
            else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        inDaySoC1();
        System.out.print("=================================");
        inDaySoC2();
    }
}
