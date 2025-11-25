package buoi4_bai_hoc_ngay24_11;

import java.util.Scanner;

public class ForLoop {
    public static void vongLapFor(){
//        for dung de lap khi biet so lan lap
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen duong n: ");
        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            System.out.println("day so nguyen duong: " + i);
        }

    }

    public static void main(String[] Args){
        vongLapFor();

    }
}
