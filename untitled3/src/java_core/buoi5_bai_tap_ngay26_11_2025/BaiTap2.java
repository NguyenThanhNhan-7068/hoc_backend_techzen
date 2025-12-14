package java_core.buoi5_bai_tap_ngay26_11_2025;

public class BaiTap2 {
    public static int reversedNumber(int a){
        return -a;
    }
    public static boolean isSymmetricalNumber(int a){
        int soBanDau = a;
        int soDao =0;
        if(a < 0) return false;
        while (a != 0){
            int chuSoCuoiCung = a % 10;
            soDao =soDao *10 +chuSoCuoiCung;
            a/= 10;
        }
        return soBanDau == soDao;
    }
    public static boolean isSquareNumber(int a){
        if(a <0) return false;
        int can = (int)Math.sqrt(a);
        return can * can == a;
    }
    public static boolean isPrimeNumber(int a){
        int dem =0;
        for(int i =1; i<=a;i++) if(a%i == 0) dem++;
        return dem == 2;
    }
    public static int calculateTotalOddDigits(int a){
        int tong=0;
        for(int i=1;i<=a;i++){
            if(i%2 !=0) tong +=i;
        }
        return tong;
    }
    public static int calculateTotalPrimeDigits(int a){
        int tong =0;
        int dem = 0;
        for(int i = 1; i<= a;i++) {
            if(a % i == 0) dem++;
        }
        if(dem == 2) tong= a+1;
        return tong;
    }
    public static int calculateTotalSquareDigits(int a){
        int tong =0;
        if(a <0) return tong;

        for(int i=1;i<=a;i++){
            int can = (int)Math.sqrt(i);
            if(can * can == i){
                tong = tong +i;
            }
        }
        return tong;
    }

    public static void main(String[] args) {
        System.out.println("so nghich dao la"+ reversedNumber(12));
        System.out.println("kiem tra so doi xung: " + isSymmetricalNumber(213));
        System.out.println("kiem tra so chinh phuong: "+ isSquareNumber(24));
        System.out.println("kiem tra so nguyen to: " + isPrimeNumber(6));
        System.out.println("tinh tong cac so le: "+ calculateTotalOddDigits(10));
        System.out.println("tinh tong cac so nguyen to: "+ calculateTotalPrimeDigits(11));
        System.out.println("tong cac so chinh phuong: "+ calculateTotalSquareDigits(15));
    }




}
