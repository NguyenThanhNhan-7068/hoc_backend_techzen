package buoi4_bai_tap_ngay24_11;
import java.util.Scanner;
public class BaiTap6 {
    public static void inFibonacci() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        } while (n <= 0);

        int a = 1, b = 2;
        System.out.print(a + " " + b + " ");

        while (true) {
            int c = a + b;
            if (c > n) break;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        inFibonacci();
    }
}
