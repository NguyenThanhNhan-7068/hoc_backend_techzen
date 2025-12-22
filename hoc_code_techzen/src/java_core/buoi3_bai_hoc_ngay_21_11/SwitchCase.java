package java_core.buoi3_bai_hoc_ngay_21_11;

import java.util.Scanner;

public class SwitchCase {
//    YEU CAU: nhap so tu 2 -> 8 va xuat ra thu cua tuan


    public static void dungIf(){
        //        cach 1: dung if
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngay");
        int day = sc.nextInt();
        if(day == 2){
            System.out.println("thu 2");
        }
        else if(day == 3){
            System.out.println("thu 3");
        }
        else if(day == 3){
            System.out.println("thu 3");
        }
        else if(day == 4){
            System.out.println("thu 4");
        }
        else if(day == 5){
            System.out.println("thu 5");
        }
        else if(day == 6){
            System.out.println("thu 6");
        }
        else if(day == 7){
            System.out.println("thu 7");
        }
        else if(day == 8){
            System.out.println("chu nhat");
        }
        else{
            System.out.println("nhap ngay khong hop le");
        }
    }
    public static void main(String[] args) {
        dungIf();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngay");
        int day = sc.nextInt();
        switch (day){
            case 2:
                System.out.println("thu 2");
            case 3:
                System.out.println("thu 3");
            case 4:
                System.out.println("thu 4");
            case 5:
                System.out.println("thu 5");
            case 6:
                System.out.println("thu 6");
            case 7:
                System.out.println("thu 7");
        }
    }
}
