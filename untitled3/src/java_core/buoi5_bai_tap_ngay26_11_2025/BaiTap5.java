package java_core.buoi5_bai_tap_ngay26_11_2025;

import java.util.Scanner;

public class BaiTap5 {
    public static void Fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        int f1 = 0, f2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(f1 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }

    public static void main(String[] args) {
        Fibonacci();
    }
}
