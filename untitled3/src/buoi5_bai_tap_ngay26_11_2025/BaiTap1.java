package buoi5_bai_tap_ngay26_11_2025;

import java.util.Scanner;

public class BaiTap1 {
    public static char toLowerCase(char c){

        if(c >= 'A' && c <= 'Z'){
            return (char)(c += 32);
        }
        return c;

    }
    public static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("pt co vo so nghiem.");
            } else {
                System.out.println("pt vo nghiem.");
            }
        }
        else {
            double x = (-b / a);
            System.out.println("nghiem cua cong thuc la : " + x);
        }
    }
    public static void levelTwo(double a, double b, double c){
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

        else{
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
    public static int min(int a, int b, int c, int d){
        int minNumber = a;
        if (b <minNumber) minNumber = b;
        if (c <minNumber) minNumber = c;
        if (d < minNumber) minNumber = d;
        return minNumber;

    }

    public static void main(String[] args) {
        System.out.println("ky tu sau khi chuyen: " + toLowerCase('H'));
        levelOne(1,0);
        levelTwo(1,2,3);
        System.out.println("so be nhat la: " + min(22,88,44,66));
    }

}
