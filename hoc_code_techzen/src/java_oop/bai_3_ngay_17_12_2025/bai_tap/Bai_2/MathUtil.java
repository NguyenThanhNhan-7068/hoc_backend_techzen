package java_oop.bai_3_ngay_17_12_2025.bai_tap.Bai_2;

public class MathUtil {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Khong the chia cho 0");
            return 0;
        }
        return a / b;
    }
}

