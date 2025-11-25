package buoi2_bai_hoc_ngay_19_11;

import java.util.Scanner;

public class BaiTapIfElseVaSwitchCase {
    public static void baiTapIf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tu 1 den 10: ");
        int so = sc.nextInt();
        if(so == 1){
            System.out.println("One");
        }
        else if(so == 2){
            System.out.println("Two");
        }
        else if(so == 2){
            System.out.println("Two");
        }
        else if(so == 3){
            System.out.println("thee");
        }
        else if(so == 4){
            System.out.println("four");
        }
        else if(so == 5){
            System.out.println("five");
        }
        else if(so == 6){
            System.out.println("six");
        }
        else if(so == 7){
            System.out.println("seven");
        }
        else if(so == 8){
            System.out.println("eight");
        }
        else if(so == 9){
            System.out.println("nine");
        }
        else if(so == 10){
            System.out.println("Ten");
        }


    }
    public static void baiTapSwitchCase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tu 1 den 10: ");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("nhap sai");
                break;
        }


    }

    public static void main(String[] args) {

    }
}
