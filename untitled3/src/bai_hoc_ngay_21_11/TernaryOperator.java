package bai_hoc_ngay_21_11;

public class TernaryOperator {
//    toan tu 3 ngoi cung cap mot cach ngan gon de viet lenh if else

//    bien = <dieu kien> ? <bieu thuc 1> : <bieu thuc 2>

//    tim max cua 2 so a,b
    public static void timMax(){
        int a=5;
        int b=3;
        int max=a < b ? b : a;
        System.out.println("ma la: "+ max);
    }

    public static void main(String[] args) {
        timMax();
    }
}
