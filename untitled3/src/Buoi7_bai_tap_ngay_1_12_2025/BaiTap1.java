package Buoi7_bai_tap_ngay_1_12_2025;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap1 {
    static Scanner sc = new Scanner(System.in);// nho ky cos static moi chay khong laf loi vi may cai hamf kia deu khai static
    public static void InputArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.printf("nhap gia trij cua arr[%d]: ",i);
            arr[i] = sc.nextInt();
        }

    }
    public static void outputArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static boolean isAllEven(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0) return false;
        }
        return true;
    }
    public static boolean isAscending(int[] arr){
        for(int i=0 ;i<arr.length -1;i++){    // cái chỗ này không -1 nó tràn chỉ số do có ar[i+1] dưới.
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
//    hamf nay em viet de kiem tra tung so co phai so nguyen to khoong roi goi no trong kiem tra mang so nguyen to
    public static boolean isPrime(int n){
        if(n<2) return false;
        int dem =0;
        for(int i =1; i <=n; i++) if(n % i == 0) dem++;
        if(dem != 2) return false;
        return true;
    }
    public static boolean isAllPrime(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(!isPrime(arr[i])) return false;
        }
        return true;
    }
    public static int countOddElements(int[] arr){
        int count = 0;
        for (int i=0; i< arr.length;i++){
            if(arr[i] %2 != 0) count++;
        }
        return count;
    }
    public static int sumPositiveOdd(int[] arr){
        int sum =0;
        for (int i=0; i< arr.length;i++){
            if(arr[i] %2 != 0 && arr[i]>0) sum += arr[i];
        }
        return sum;
    }
    public static int countDivisibleBy4NotBy5(int[] arr){
        int count =0;
        for (int i=0; i< arr.length;i++){
            if(arr[i] %4 == 0 && arr[i]%5 != 0) count++;
        }
        return count;
    }
    public static int sumPrimes(int[] arr){
        int sum =0;
        for (int i=0; i< arr.length;i++){
            if(isPrime(arr[i])) sum += arr[i];
        }
        return sum;
    }
    public static int lastIndexOf(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static int firstPrimeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) return i;
        }
        return -1;
    }
    public static int findMinPositive(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x > 0 && x < min) min = x;
        }
        return min;
    }
    public static ArrayList<Integer> findElementInArray(int[] a, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) list.add(i);
        }
        return list;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }




    public static void main(String[] args) {
        int n;
        do{
            System.out.println("nhap so duong n: ");
            n = sc.nextInt();
            if(n <= 0) System.out.println("n phai lon hon 0, nhap lai: ");
        }
        while (n <= 0);
        int[] arr = new int[n];

//      BAI TAP 1: cau 1a: nhap mang
        InputArray(arr);

//        BAI TAP 1: cau 1b: xuat mang
        System.out.print("xuat mang: ");
        outputArray(arr);

//       BAI TAP 1: cau 2a: kiem tra mang toan chan
        System.out.println();
        System.out.print("kiem tra toan chan: "+ isAllEven(arr));

//        BAI TAP 1: cau 2b: kiem tra mang toan so nguyen to
        System.out.print("\nkiem tra mang toan so nguyen to: "+ isAllPrime(arr));

//        BAI TAP 1: cau 2c: kiem tra mang tang dan
        System.out.print("\nkiem tra mang tang dan: " + isAscending(arr));

//        BAI TAP 1: cau 3a:Đếm số lượng phần tử lẻ có trong mảng a
        System.out.print("\nmang co: "+ countOddElements(arr)+ " phan tu le.");

//       BAI TAP 1: cau 3b: Tính tổng số dương lẻ của mảng a
        System.out.print("\nTong so duong le cua mang la: "+sumPositiveOdd(arr));

//        BAI TAP 1: cau 3c: Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5
        System.out.print("\nCo: "+countDivisibleBy4NotBy5(arr)+" so chia het cho 4 nhung khong chia het cho 5");

//        BAI TAP 1: cau 3d:Tổng các số nguyên tố có trong mảng
        System.out.print("\nTong so nguyen to trong mang: "+ sumPrimes(arr));

//        BAI TAP 1: cau 4a:Vị trí cuối cùng của phần tử x trong mảng
        System.out.print("\nnhap gia tri x muon tim: ");
        int x= sc.nextInt();
        System.out.println("\nvi tri cuoi cung cua: "+x + " la: "+lastIndexOf(arr,x));

//        BAI TAP 1: cau 4b: Vị trí số nguyên tố đầu tiên trong mảng
        System.out.print("\nvi tri so nguyen to dau tien trong mang: "+ firstPrimeIndex(arr));

//        BAI TAP 1: cau 4c:Tìm số dương nhỏ nhất trong mảng
        System.out.print("\nso duong nho nhat trong mang la: "+ findMinPositive(arr));

//        BAI TAP 1: cau 4d: tim vi tri cua k trong mang
        System.out.print("\nnhap gia tri k muon tim: ");
        int k = sc.nextInt();
        System.out.print("\nvi tri cua k trong mang la: "+ findElementInArray(arr,k));

//        BAI TAP 1: cau 4e: Tìm giá trị lớn nhất và nhỏ nhất của mảng
        System.out.println("\ngia tri lon nhat mang: "+ findMax(arr));
        System.out.println("\ngia tri nho nhat mang: "+ findMin(arr));



    }
}
