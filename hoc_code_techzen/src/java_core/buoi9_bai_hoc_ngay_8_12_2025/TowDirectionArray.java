package java_core.buoi9_bai_hoc_ngay_8_12_2025;

import java.util.Arrays;
import java.util.Scanner;

public class TowDirectionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {{10,20,30},{40,50},{60,70}};
        System.out.println(Arrays.toString(arr[0])); //[10, 20, 30]
        System.out.println(arr[1][1]);  //50
        System.out.println(arr.length); //3
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i].length);
        }
        for (int i = 0; i< arr.length;i++){
         System.out.println(Arrays.toString(arr[i]));  // cach in nhanh(1 vong for). cach con lai ben duoi(2vong for).
//            for (int j = 0;j < arr[i].length;i++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
        }

///      nhap  mang 2 chieu.
//        buoc 1: nhap vao m hang
        int m = inputPositive(sc, "m hang");
//        buoc 2: nhap vap n cot
        int n = inputPositive(sc,"n cot");
//        buoc 3: new ramang moi m hang n cot
        int[][] a = new int[m][n];
//        buoc 4: tao phuong thuc nhap mang
        inputArray(sc,a);
//        buoc 5: xuat mang:
        outputArray(a);


///        cac thao tac kiem tra
//        1. co phai mang toan chan khong
        System.out.println("kiem tra mang toan chan: " + isAllEven(a));
//        2. tao mang 1 chieu X voi X[i] la cac gia tri lon nhat tren tung dong i cua ma tran A, in X ra
        System.out.println("gia tri cao nhat tren tung dong mang: " + Arrays.toString(maxValuePerRow(a)));

//        3. hoan doi 2 dong ma tran
        System.out.println("nhap dong 1 muon swap: ");
        int dong1= sc.nextInt();
        System.out.println("nhap dong 2 muon swap: ");
        int dong2 = sc.nextInt();
        swap(a,dong1,dong2);
    }
    public static void swap(int[][] a,int dong1,int dong2){
        int[] temp = a[dong1];
        a[dong1] = a[dong2];
        a[dong2] = temp;
        System.out.println("hoan doi 2 dong trong ma tran: ");
        outputArray(a);
    }
    public static int[] maxValuePerRow(int[][] a){
        int[] X = new int[a.length];
        for (int i = 0; i<a.length;i++){
            int max = a[i][0];
            for (int j = 0; j <a[i].length;j++){
                if(max < a[i][j]) max = a[i][j];
            }
            X[i] = max;
        }
        return X;
    }
    public static boolean isAllEven(int[][] a){
        for(int i = 0; i<a.length;i++){
            for (int j = 0; j <a[i].length;j++){
                if(a[i][j]% 2 != 0) return false;
            }
        }
        return true;
    }
    public static void outputArray(int[][] a){
        for(int i = 0; i<a.length;i++){
            for (int j =0; j < a[i].length;j++){
                System.out.printf(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void inputArray(Scanner sc, int[][] a){
        for(int i = 0; i<a.length;i++){
            for (int j =0; j < a[i].length;j++){
                System.out.printf("nhap phan tu mang a[%d][%d]: ",i,j);
                a[i][j] =sc.nextInt();
            }
        }
    }
    //        nhap mang 2 chieu.
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
