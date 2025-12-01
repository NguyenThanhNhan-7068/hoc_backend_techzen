package buoi4_bai_tap_ngay24_11;

import java.util.Scanner;

public class BaiTap10 {
    public static void c1(){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("nhap so duong n: ");
            n = sc.nextInt();
            if(n<0) System.out.println("n phai lon hon 0, nhap lai: ");

        }
        while (n<0);
        double sum = 0.0;
        for(int i=1;i <= n;i++){
            int fact =1;
            for(int j=1;j<= (2*i-1);j++){
                fact *=j;
            }
            sum += 1.0/fact;
        }
        System.out.println("tong: "+ sum);

    }
    public static void c2(){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("nhap so duong n: ");
            n = sc.nextInt();
            if(n<0) System.out.println("n phai lon hon 0, nhap lai: ");

        }
        while (n<0);
        double sum = 0.0;
        int fact= 1;
        for(int i =1;i<=n;i++){
            sum += 1.0/fact;
            fact *= (2 * i) * (2 * i + 1);
        }
        System.out.println("tong: "+ sum);

    }

    public static void main(String[] args) {
        c1();
        c2();

    }
}
