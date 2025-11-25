package buoi4_bai_tap_ngay24_11;

import java.util.Scanner;

public class BaiTap4 {
    public static void inSoChan() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 2; i <= 2 * n; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        inSoChan();
    }

}
