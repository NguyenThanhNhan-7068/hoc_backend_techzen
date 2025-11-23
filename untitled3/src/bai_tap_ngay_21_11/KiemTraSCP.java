package bai_tap_ngay_21_11;
import java.util.Scanner;
public class KiemTraSCP {
    public static void bai1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        if (x < 0) {
            System.out.println("Khong hop le. x phai >= 0");
            return;
        }
        double squareRoot = Math.sqrt(x);

        if (squareRoot % 1 == 0) {
            System.out.println(x + " la so chinh phuong.");
        } else {
            System.out.println(x + " KHONG la so chinh phuong.");
        }
    }

    public static void main(String[] args) {
        bai1();
    }
}
