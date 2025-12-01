package Buoi7_bai_hoc_ngay_1_12_2025;

import java.util.Scanner;

public class OneDirectionArray {
    static Scanner sc = new Scanner(System.in);
    public static void inputArray(int[] arr){
        for(int i =0; i< arr.length; i++){
            System.out.printf("nhap phan tu array[%d]: ",i); // %d -> in ra i. phai la prinf moi duoc
            arr[i]= sc.nextInt();
        }

    }
    public static void outputArray(int[] arr){
//        for(int i =0; i< arr.length; i++){
//            System.out.printf(arr[i] + " ");
//        }
        //2 for nay bang nhau
        for (int phanTu : arr) {
            System.out.printf(phanTu + " ");
        }

    }

//    ham bai 2: kiem tra xem co phai mang toan chan khong
    public static boolean isAllEven(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0) return false;
        }
        return true;
    }

//    ham bai 3: tong so le
    public static int tongSoLe(int[] arr){
        int sum=0;
        for( int i=0;i<arr.length;i++) {
            if(arr[i] % 2 != 0) sum += arr[i];
        }
        return sum;
    }

//    bai4: tim vi tri dau cua x trong mang
    public static int firstIndexX(int[] arr, int x){

        for (int i = 0; i< arr.length;i++){
            if(arr[i] == x) return i;
        }
        return -1;
    }
//    bai 5: tim vi tri cuoi cua x trong mang
    public static int lastIndexX(int[] arr, int x){
        for (int i = arr.length-1;i >= 0;i--){
            if(arr[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
///  thao tac nhap xuat mang
//        buoc 1: nhap vao so luong phan tu n cua n
//        Scanner sc = new Scanner(System.in); // dua ra ngoai dung chung khoi tao lai.
        int n;
        do{
            System.out.print("nhap so luong phan tu mang: ");
            n = sc.nextInt();
            if(n<1) System.out.println("n phai lon hon 0, nhap lai: ");
        }
        while (n<1);
//        buoc 2: tao mang co n phan tu kieu int
        int[] arr =new int[n];

//        buoc 3: xay dung phuong thuc nhap mang
        inputArray(arr);
//        buoc 4: xuat mang
        System.out.println(" mang da nhap: ");
        outputArray(arr);

//bai tap 2: kiem tra mang toan chan
        System.out.println();
        System.out.println("kiem tra toan chan: "+ isAllEven(arr));

//        bai tap 3: tong so le
        System.out.println("tong so le: "+tongSoLe(arr));


//        bai tap 4 ; vi tri dau tien cua x trong mang
        System.out.println("nhap gia tri phan tu muon tim(index dau): ");
        int x = sc.nextInt();

        if(firstIndexX(arr,x) == -1) System.out.println("x khong co trong mang");
        else {
            System.out.println("vi tri cua x trong mang la: index = "+ firstIndexX(arr,x));
        }

//        bai tap 5: vi tri cuoi cua x trong mang
        if(lastIndexX(arr,x) == -1) System.out.println("last index x khong co trong mang");
        else {
            System.out.println("vi tri cua x trong mang la: index = "+ lastIndexX(arr,x));
        }
    }


}
