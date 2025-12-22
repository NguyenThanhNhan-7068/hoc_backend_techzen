package java_core.buoi2_bai_hoc_ngay_19_11;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
    public static void giaiPTB2(){
        Scanner sc = new Scanner((System.in));
        System.out.println("nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("nhap so b: ");
        double b = sc.nextDouble();
        System.out.println("nhap so c: ");
        double c = sc.nextDouble();
// kiem tra neu a=0 thi no thanh pt bac mot.
        if(a==0){
            a=b;
            b=c;
            if (a == 0) {
                if (b == 0) {
                    System.out.println("pt co vo so nghiem.");
                } else {
                    System.out.println("pt vo nghiem.");
                }
            } else {
                double x = (-b / a);
                System.out.println("nghiem cua cong thuc la : " + x);
            }
        }
        // a khac 0. tinh theo cong thuc bac 2
        else{
            // kiem tra nghiem pt bac 2
            double delta = b*b - (4*a*c);
            if(delta <0){
                System.out.println("phuong trinh vo nghiem");
            }
            else if(delta == 0){
                System.out.println("phuong trinh co nghiem kep: "+ (-b/2*a));
            }
            else{
                System.out.println("phuong trinh co 2 nghiem phan biet x1 = : "+((-b + Math.sqrt(delta)))/(2*a)+" va x2 = "+ ((-b - Math.sqrt(delta)))/(2*a));
            }
        }
    }

    public static void main(String[] args) {
        giaiPTB2();
    }
}
