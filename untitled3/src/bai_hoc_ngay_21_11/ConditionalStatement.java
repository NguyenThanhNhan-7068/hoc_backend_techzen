package bai_hoc_ngay_21_11;

import java.util.Scanner;

public class ConditionalStatement {
    // cau lenh dieu kien cho phep thuc thu mot khoi lenh
    /*
    xep loai hoc vien:
    diem <5: yeu
    diem >= 5: kha
     */

    public static void xepHangHocVien(){
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap diem: ");
        double score = sc.nextDouble();

//cach 1: cau dieu kien thieu
        if(score <5){
            System.out.println("yeu");
        }
        if(score >=5){
            System.out.println("kha");
        }
//cach 2: cau dieu kien du
        System.out.println("========================================");
        if(score <5){
            System.out.println("yeu");
        }
        else{
            System.out.println("kha");
        }
    /*
    xep loai hoc vien:
    diem <5: yeu
    diem >= 5 va <8: kha
    diem >8: kha
     */
        System.out.println("=============================");
        if(score <5){
            System.out.println("yeu");
        }
        else if(score < 8){
            System.out.println("kha");
        }
        else{
            System.out.println("gioi");
        }
    }

    public static void main(String[] Args){

        xepHangHocVien();

    }
}
