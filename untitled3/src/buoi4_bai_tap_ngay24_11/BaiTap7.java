package buoi4_bai_tap_ngay24_11;


import java.util.Scanner;

public class BaiTap7 {
    public static void baiTap7(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("nhap n: ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("n phai lon hon 0,nhap lai!");
            }
        }
        while (n < 1);
        int a = 1;
        System.out.print("ket qua: ");
        while (a <= n) {
            System.out.print(a + " ");
            a = a * 2 + 1;
        }

    }
    public static void main(String[] args) {
        baiTap7();

    }
}
