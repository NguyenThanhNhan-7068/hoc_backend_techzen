package java_core.buoi4_bai_tap_ngay24_11;

import java.util.Scanner;

public class BaiTap2 {
    public static void inDaySo() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so nguyen duong n: ");
            n = sc.nextInt();
        }
        while (n <= 0);
        for (int i = 2; i <= n; i += 2) {
            if (i % 4 == 0) {
                System.out.print(-i + " ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        inDaySo();
    }
}
