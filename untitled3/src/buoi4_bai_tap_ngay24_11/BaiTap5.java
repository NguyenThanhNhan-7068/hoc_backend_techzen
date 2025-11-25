package buoi4_bai_tap_ngay24_11;

import java.util.Scanner;

public class BaiTap5 {
    public static void inDaySoTheoLuat() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        while (n <= 0);

        int dem = 0;
        int khoangCach = 1;
        for (int i = 2; i <= n; i += 2) {
            if (dem == khoangCach) {
                System.out.print(-i + " ");
                dem = 0;
                khoangCach++;
            }
            else {

                System.out.print(i + " ");
                dem++;
            }
        }
    }

    public static void main(String[] args) {
        inDaySoTheoLuat();
    }
}
