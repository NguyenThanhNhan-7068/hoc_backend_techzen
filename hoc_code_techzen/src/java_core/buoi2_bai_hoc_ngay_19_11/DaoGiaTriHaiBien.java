package java_core.buoi2_bai_hoc_ngay_19_11;

import java.util.Scanner;

public class DaoGiaTriHaiBien {
    public static void daoGiaTriC1(){
//        dung tam
        Scanner sc = new Scanner((System.in));
        System.out.println("nhap so a: ");
        int a = sc.nextInt();
        System.out.println("nhap so b: ");
        int b = sc.nextInt();
        int tam;
        tam = a;
        a=b;
        b= tam;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }
    public static void daoGiaTriC2(){
        Scanner sc = new Scanner((System.in));
        System.out.println("nhap so a: ");
        int a = sc.nextInt();
        System.out.println("nhap so b: ");
        int b = sc.nextInt();

        a= a + b;// a=2+3=5
        b= a-b;//   b=5-2=3
        a= a-b;// a= 5-3=2
        System.out.println("a: "+a);
        System.out.println("b: "+ b);

    }

    public static void main(String[] args) {
        daoGiaTriC1();
        daoGiaTriC2();
    }
}
