package buoi9_bai_hoc_ngay_8_12_2025;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudy {
    ///  thuc hanh

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = inputPositive(sc, "n phan tu ");
        // a. tao Array List co ten a va nhap n phan tu kieu int
        ArrayList<Integer> a = new ArrayList<>(n);
        inputArray(sc,a,n);
        // b. in ra cac phan tu cua a.
        outputArray(a);
        // c. dem phan tu le
        System.out.println("\ndem le: "+ demLe(a));
        // d. tinh tong so duong le
        System.out.println("tong so duong le: "+ tongDuongLe(a));


    }
    public static int tongDuongLe(ArrayList<Integer> arrayList){
        int tong =0;
        for (Integer e : arrayList){
            if(e % 2 != 0 && e > 0) tong += e;
        }
        return tong;
    }
    public static int demLe(ArrayList<Integer> arrayList){
        int dem = 0;
        for (Integer e : arrayList){
            if(e % 2 != 0) dem++;

        }
        return dem;
    }
    public static void outputArray(ArrayList<Integer> arrayList){
        for (Integer e : arrayList){
            System.out.print(e +"\t");
        }
    }
    public static void inputArray(Scanner sc, ArrayList<Integer> arrayList,int n){
        for(int i =0; i<n;i++){
            System.out.printf("nhap vao phan tu thu %d: ",i);
            arrayList.add(sc.nextInt());
        }
    }
    public static int inputPositive(Scanner sc,String target){
        int n;
        do{
            System.out.printf("Nhap vao %s: ",target);
            n = sc.nextInt();
            if(n <= 1 ){
                System.out.println("so nhap vao phai lon hon 0, nhap lai: ");
            }
        }
        while (n <=1);
        return n;
    }
}
