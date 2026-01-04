package java_oop.bai_10_ngay_2_1_2026.bai_hoc;

import java_oop.bai_10_ngay_2_1_2026.bai_hoc.exception.InvalidAgeFormatException;
import java_oop.bai_10_ngay_2_1_2026.bai_hoc.exception.Under18YearsOldException;

import java.text.NumberFormat;
import java.util.Scanner;

public class CustomException {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /// Kiểm tra tuổi hợp lệ (trên 18 tuổi)
        int age = 0;
        try {
            age = inputAgeOver18();
        } catch (InvalidAgeFormatException | Under18YearsOldException e) {
            System.out.println(e.getMessage());
        }

        /// Cần kiểm tra biến age có trường hợp nào không được khởi tạo không!!
        /// Vậy có giải pháp gì để đảm bảo age luôn được khởi tạo???
//        System.out.println("Tuổi đã nhập: " + age);
    }

    public static int inputAgeOver18() throws Under18YearsOldException, InvalidAgeFormatException {
        System.out.print("Nhập vào tuổi: ");

        int age;

        try {
            age = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException e) {
            throw new InvalidAgeFormatException("tuoi la so nguyen!");
        }

        if (age < 18) {
            throw new Under18YearsOldException("Bạn chưa đủ tuổi!");
        }

        return age;
    }
}

