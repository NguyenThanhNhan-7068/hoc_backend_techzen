package java_core.buoi4_bai_hoc_ngay24_11;

import java.util.Scanner;

public class WhileLoop {
    public static void vongLapWhile(){
//        while dung de lap khi khong biet so lan lap
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen duong n: ");
        int n = sc.nextInt();

        int i=0;
        while(i <= n){
            System.out.println(i);
            i++;
        }
// while(true): khong biet truoc so lan lap n
        System.out.println("=================================================");
//        int i=1; da khai bao tren roi
        while(true){
            i++;
            if(i %2 == 0) continue;
            if(i % 5 == 0) break;
            System.out.println(i);

        }
        System.out.println();
    }

    public static void main(String[] Args){
        vongLapWhile();

    }
}
