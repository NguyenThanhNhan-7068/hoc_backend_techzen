package java_core.buoi4_bai_tap_ngay24_11;

import java.util.Scanner;

public class BaiTap9 {
    public static void baiTap9(){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("nhap so duong n: ");
            n = sc.nextInt();
            if(n<0) System.out.println("n phai lon hon 0, nhap lai: ");

        }
        while (n<0);
        double sum = 0.0;
        for(int i = 1; i<=n ; i++){
            sum = sum + 1.0/i;

        }
        System.out.println("ket qua: "+sum);
    }

    public static void main(String[] args) {
        baiTap9();
    }

}
