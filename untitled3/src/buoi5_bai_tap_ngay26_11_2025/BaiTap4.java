package buoi5_bai_tap_ngay26_11_2025;

public class BaiTap4 {
    public static int uscln(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max % min == 0) {
            return min;
        }
        for (int i = min / 2; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(" uoc chung lon nhat laf: "+ uscln(99,66));

    }
}
