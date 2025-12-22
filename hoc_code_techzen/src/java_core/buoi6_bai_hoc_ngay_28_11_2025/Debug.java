package java_core.buoi6_bai_hoc_ngay_28_11_2025;

import java.lang.String;

public class Debug {
    public static int method1(int a, int b){
        System.out.println("di vao thuong thuc method1()");
        return a + b;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
//        thuc hien nhieu chuc nang... => lam thay doi gia tri a, b
//        cach 1: kiem tra a,b truoc khi truyen vao method1()=>bat tien
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c= method1(a,b);// chon method1(a,b) -> chuot phai -> Evaluate Expression -> thay doi tham so truc tiep roi an enter de test

        for(int i=1;i<=100;i++){
            System.out.println("vong lap thu: "+ i);
        }
    }

}
