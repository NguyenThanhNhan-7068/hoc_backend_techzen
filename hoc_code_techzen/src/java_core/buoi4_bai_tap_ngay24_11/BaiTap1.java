package java_core.buoi4_bai_tap_ngay24_11;

import java.util.Scanner;

public class BaiTap1 {
    public static void inSoLeC1(){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("nhap so nguyen duong: ");
            n = sc.nextInt();
            if(n <= 0) System.out.println("nhap sai, nhap lai !");
            for(int i = 1; i <= n; i++){
                if((i % 2) != 0) System.out.print(i + " ");
            }

        }
        while (n <= 0);
    }
    public static void inSoLeC2(){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("nhap so nguyen duong: ");
            n = sc.nextInt();
            if(n <= 0) System.out.println("nhap sai, nhap lai !");
            for(int i = 1; i <= n; i +=2){
                 System.out.print(i + " ");
            }

        }
        while (n <= 0);
    }


    public static void main(String[] args) {
        inSoLeC1();
        System.out.println();
        System.out.println("=====================");
        inSoLeC2();

    }
}
