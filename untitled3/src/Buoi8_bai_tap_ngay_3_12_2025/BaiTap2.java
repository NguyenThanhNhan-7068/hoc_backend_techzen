package Buoi8_bai_tap_ngay_3_12_2025;

import java.util.Scanner;

public class BaiTap2 {
    static Scanner sc = new Scanner(System.in);
    public static void inputArray(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.printf("nhap gia tri cho a[%d]: ",i);
            a[i] = sc.nextInt();
        }
    }
    public static void outputArray(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(" " + a[i]);
        }
    }
    public static int[] primeNumberCorrection(int[] a){
        for (int i = 0; i <a.length;i++){
            if(isPrime(a[i])) a[i] = 0;
        }
        return a;
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        int count =0;
        for (int i = 1;i <= n;i++){
            if(n%i == 0) count++;
        }
        if(count !=2) return false;
        return true;
    }
//em khong chac lam. de yeu cau xoa theo gia tri k nhung huong dan lai bao xoa theo index. em hieu la viet 2 ham nhu nay
    public static int[] remove(int[] a,int index){
        int[] b = new  int[a.length - 1];
        for(int i = 0; i<b.length; i++){
            if(i < index) b[i] = a[i];
            else b[i] = a[i+1];
        }
        return b;
    }
    public static int[] removeByValue(int[] a,int k){
        for(int i=0; i<a.length;i++){
            if(k == a[i]){
                a=remove(a,i);
                i--;
            }
        }
        return a;

    }

//    khong lam theo cac buoc cua anh vi em khong hieu. em lam cai nay theo cach em hieu de.
    public static int[] insert_0_AfterPrimeNumber(int[] a){
        int count = 0;
        int index =0;
        for(int i =0; i<a.length;i++){
            if(isPrime(a[i])) count++;
        }
        int[] b = new int[a.length + count];
        for(int i =0; i<a.length;i++){
            b[index++] = a[i];
            if(isPrime(a[i])) b[index++] =0;
        }
        return b;

    }
    public static int[] removeIsPrime(int[] a){
        for (int i = 0; i<a.length;i++){
            if(isPrime(a[i])){
                a= remove(a,i);
                i--;                  // tranh sot do khi xoa 1 lan index no lui di 1
            }
        }
        return a;
    }
    public static int[] insert(int[] a, int index,int value){
        int[] b = new int[a.length+1];
        for (int i = 0; i<index; i++){
            b[i] =a[i];
        }
        b[index] = value;
        for (int i =a.length-1; i>index;i--){
            b[b.length -1] = a[a.length-1];
        }
        return b;
    }

    public static void main(String[] args) {
        int n,index,k;
        do{
            System.out.println("nhap so phan tu mang: ");
            n= sc.nextInt();
            if(n<1) System.out.println("so phan tu mang phai lon hon 0, nhap lai: ");
        }
        while (n<1);

        int[] a= new int[n];
        int[] test = {1,2,3,4,5,6,7,8,9};
        inputArray(a);

//        2a: Sửa các số nguyên tố trong mảng thành số 0
        primeNumberCorrection(a);
        System.out.print("\n2a. Sua cac so nguyen to trong mang thanh 0: ");
        outputArray(a);
        System.out.print("\n=============================================");


//        2b:Chèn số 0 đằng sau các số nguyên tố trong mảng
        int[] b = insert_0_AfterPrimeNumber(test);
        System.out.println("\n2b. chen 0 sau cac so nguyen to: ");
        outputArray(b);
        System.out.print("\n=============================================");


//        2c. Xóa các phần tử trong mảng có giá trị index
        System.out.println("\nnhap gia tri phan tu muon xoa: ");
        k= sc.nextInt();
        int[] c = removeByValue(test,k);
        System.out.println("\nxoa phan tu theo gia tri k: ");
        outputArray(c);
        System.out.print("\n=============================================");

//        2d. Xóa tất cả số nguyên tố có trong mảng
        int[] d = removeIsPrime(test);
        System.out.println("\nxoa so nguyen to trong mang: ");
        outputArray(d);
        System.out.print("\n=============================================");

//        2e. Chèn 1 phần tử vào vị trí k bất kỳ
        System.out.println("\nnhap vi tri can chen: ");
        int l = sc.nextInt(); //k khai roi nen gio khai l
        int[] e = insert(test,l,13);
        System.out.println("\nchen phan tu moi vao vi tri l: ");
        outputArray(e);



    }
}
