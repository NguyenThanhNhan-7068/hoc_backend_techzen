package KiemTra;

import java.util.Scanner;

public class BaiKiemTra {
    static Scanner sc = new Scanner(System.in);
    public static int input(){
        int x;
        do{
            System.out.println("nhap vao so nguyen duong: ");
            x = sc.nextInt();
            if(x<0) System.out.println("so nguyen duong la so lon hon hoac bang 0, nhap lai: ");
        }
        while (x<0);
        return x;
    }
    public static boolean kiemTraSoChinhPhuong(int x){
        double soSauCan = Math.sqrt(x);
        if(soSauCan * soSauCan == x) return true;
        return false;
    }
    public static void inFibonacci(int n){
        for (int i = 0; i<=n ; i++){
            if(i== 0) System.out.print(0+ " ");
            if(i==1) System.out.print(1);
            if(i >= 2) System.out.print(" "+((i-2) +(i-1)));
        }

    }
    public static int[] inFibonacci1(int n){
        int[] d =new int[n+1];
        for (int i = 0; i<=n ; i++){
            if(i== 0) d[0] =0;
            if(i==1) d[1] =1;
            if(i >=2) d[i] = d[i-2] + d[i-1];
        }
        return d;
    }
    public static void lowerCase(String str){
        String trim = str.trim();
        System.out.println("\nchuoi sau khi chuan hoa: "+trim.toLowerCase());
    }
    public static void subString(String str){
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        System.out.println("nhap m: ");
        int m =sc.nextInt();
        String chuoiMoi = str.substring(n,m);
        System.out.println("trich xuat chuoi tu n den m: "+ chuoiMoi);
    }
    public static boolean kiemTraSoNguyenTo(int n){
        if(n<2) return false;
        int dem =0;
        for(int i =1; i <=n; i++) if(n % i == 0) dem++;
        if(dem != 2) return false;
        return true;
    }
    public static int[] timSoNguyenToTrongMang(int[] a){
        int dem =0;
        for (int x : a){
            if(kiemTraSoNguyenTo(x)) dem++;
        }
        int[] b = new int[dem];

        int index =0;
        for (int x : a) {
            if (kiemTraSoNguyenTo(x)) b[index++] = x;
        }
        return b;
    }
    public static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) System.out.print(a[i]+ " ");
    }
    public static int[] interchangeSortDesc(int[] a){
        for(int i =0;i < a.length -1; i++){
            for (int j =i+1; j<a.length;j++){
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }


    public static void main(String[] args) {
//        bai 1: Kiểm tra số chính phương
        int x = input();
        System.out.println("\nkiem tra so chinh phuong: " + kiemTraSoChinhPhuong(x));
        System.out.println("=====================================");
//        bai 2: In dãy số Fibonacci đến n
        int n = input();
        int[] d = inFibonacci1(n);
        System.out.print("in day fibonacci: ");
        xuatMang(d);
        System.out.println("\n===================================");

//       bai 3: hinh chu nhat rong
        int hang = 5;
        int cot = 6;

        for (int i = 1; i <= hang; i++) {
            for (int j = 1; j <= cot; j++) {
                if (i == 1 || i == hang || j == 1 || j == cot) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print("\n===============================");

//      bai 4:Xử lý chuỗi
        String str = "TeChzen AcaDemy ";
        lowerCase(str);
        subString(str);
//        bai 5: Xử lý mảng
//        Đề bài: Cho mảng: [1, 5, 6, 23, 8, 47, 10, 3]
//        Hãy viết phương thức tìm các số nguyên tố với tham số truyền vào là mảng chứa các số nguyên
//        In ra kết quả: [3 5 23 47]
        int[] a = {1, 5, 6, 23, 8, 47, 10, 3};
        int[] b=timSoNguyenToTrongMang(a);
        System.out.print("mang so nguyen to: ");
        xuatMang(b);
        System.out.print("\n===============================");

//        bai 6:
//        Đề bài: Cho mảng: [12, 2, 8, 5, 1, 6, 4, 15]
//        Hãy viết phương thức interchangeSortDesc dùng thuật toán sắp xếp đổi chỗ trực tiếp để sort mảng tăng dần
//        In ra kết quả: [1 2 4 5 6 8 12 15]
        interchangeSortDesc(a);
        System.out.println("\n sap xep mang tang dan: ");
        xuatMang(a);








    }
}
