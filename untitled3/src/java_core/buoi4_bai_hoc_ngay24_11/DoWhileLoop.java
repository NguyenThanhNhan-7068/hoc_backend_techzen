package java_core.buoi4_bai_hoc_ngay24_11;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int i= 1;
        do{
            System.out.println("nhap so nguyen duong: ");
            n = sc.nextInt();
            if(n <= 0){
                System.out.println("nhap sai, nhap lai: ");
            }
            else{
                System.out.println("n = "+n);
            }
        }
        while (n <= 0);
        //neu nhap so be hon = 0 vi du -1 thi no chay mai khong dung. nhap so lon hon 0 thi chay 1 lan
    }
}
