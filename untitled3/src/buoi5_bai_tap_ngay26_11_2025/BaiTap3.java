package buoi5_bai_tap_ngay26_11_2025;

public class BaiTap3 {
    public static int sumN(int n) {
        int tong = 0;
        for (int i = 1; i<= n;i++) {
            tong += i;
        }
        return tong;
    }

    public static int sumSquare(int n) {
        int tong = 0;
        for (int i = 1; i <= n;i++) {
            tong += i * i;
        }
        return tong;
    }

    public static double sumInverse(int n) {
        double tong = 0;
        for (int i=1; i<=n;i++) {
            tong += 1.0 / i;
        }
        return tong;
    }

    public static long productN(int n) {
        long kq = 1;
        for (int i =1; i <= n; i++) {
            kq *= i;
        }
        return kq;
    }

    public static long sumFactorial(int n) {
        long tong = 0;
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
            tong += giaiThua;
        }
        return tong;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Tong 1..n = " + sumN(n));
        System.out.println("tong binh phuong= " + sumSquare(n));
        System.out.println("tong nghich dao = " + sumInverse(n));
        System.out.println("Tích 1->n = " + productN(n));
        System.out.println("tong giai thua = " + sumFactorial(n));
    }
}
