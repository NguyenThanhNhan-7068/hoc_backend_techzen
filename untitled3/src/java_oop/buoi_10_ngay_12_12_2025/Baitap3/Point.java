package java_oop.buoi_10_ngay_12_12_2025.Baitap3;

import java.util.Scanner;
public class Point {
    double x;
    double y;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap x: ");
        x = sc.nextDouble();
        System.out.print("nhap y: ");
        y = sc.nextDouble();
    }

    public double distanceTo(Point diemKhac) {
        return Math.sqrt(Math.pow(diemKhac.x - this.x, 2) + Math.pow(diemKhac.y - this.y, 2));
    }
}

