package bai_tap_ngay_19_11;

import java.util.Scanner;

public class PhepToanSoHoc {
    public static void lam_toan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = sc.nextInt();
        System.out.println("nhap b: ");
        int b = sc.nextInt();

        System.out.println("tong: "+(a+b));
        System.out.println("hieu: "+ (a-b));
        System.out.println("tich: "+(a*b));

        if(b == 0){
            System.out.println("b phai khac 0. chay lai de nhap lai.");
        }
        else{
            System.out.println("thuong: "+ (a/b));
        }

    }

    public static void main(String[] args) {
        lam_toan();
    }
}
