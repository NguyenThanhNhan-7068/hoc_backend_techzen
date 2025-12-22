package java_oop.bai_1_ngay_12_12_2025.BaiTap1;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten hs: ");
        name = sc.nextLine();
        System.out.print("nhap diem toan: ");
        mathScore = sc.nextDouble();
        System.out.print("nhap diem van: ");
        literatureScore = sc.nextDouble();
    }
    public double calculateAverageScore() {
        return (mathScore + literatureScore) / 2;
    }
    public void output() {
        System.out.println("ten hoc sinh: " + name);
        System.out.println("diem toan: " + mathScore);
        System.out.println("diem van: " + literatureScore);
        System.out.println("diem tb: " + calculateAverageScore());
    }
}
