package buoi6_bai_hoc_ngay_28_11_2025;

public class Casting {
    public static void main(String[] args) {
        /// ep kieu ngam dinh: java tu lam. ep tu nho den lon
        byte b =10;//mien gia tri[-128;127]
        short s = b;// java tu ep kieu
        System.out.println(s);

        ///  ep tuong minh: dev lam.
        int i = 100;
        //       byte b2 = i; // bao loi do ngam dinh khong doi tu lon ve nho duoc
        byte b2 = (byte)i;
        System.out.println(b2);
    }
}
