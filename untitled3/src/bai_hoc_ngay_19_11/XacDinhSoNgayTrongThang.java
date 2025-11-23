package bai_hoc_ngay_19_11;

import java.util.Scanner;

public class XacDinhSoNgayTrongThang {
    public static void baiLam() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap thang: ");
        int thang = sc.nextInt();
        System.out.println("nhap nam: ");
        int nam = sc.nextInt();

        if (thang == 0) System.out.println("nhap sai. thang tu 1 ->12");
        else if (thang == 4 || thang == 6 || thang == 9 || thang == 11)
            System.out.println("thang" + thang + " nam " + nam + " co: " + 30 + " ngay");
        else if (thang == 2) {
            if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                System.out.println("thang 2 nay trong nam " + nam + " nhuan co 29 ngay");
            } else {
                System.out.println("thang 2 nam " + nam + " co 28 ngay");
            }
        } else {
            System.out.println("thang " + thang + " nam " + nam + " co 31 ngay");
        }

    }

    public static void main(String[] args) {
        baiLam();
    }
}
