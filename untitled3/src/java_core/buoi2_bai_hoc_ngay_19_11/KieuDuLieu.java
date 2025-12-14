package java_core.buoi2_bai_hoc_ngay_19_11;

public class KieuDuLieu {
    public static void kieudulieu(){
        byte b = 127;
        // 1 byte = 8 bit = 2^8(256) chay tu -128 -> 127

        short s = 500;
        // 2 byte = 16 bit = 2^16

        int i=50;
        // 4 byte =32 bit = 2^32

        long l = 2000000000000000l;
        // 8 byte = 64 bit = 2^64

        // trong java nhac den so nguyen la int, nhac den so thuc la double(mac dinh)

        float f = 5.0f;
        //4 byte

        double d = 5.0;
        //8 byte

        double d1=3.0;
        int d2=2;
        System.out.println("3.0/2: " + d1/d2); // ->1.5
        System.out.println("3/2: " + (int)d1/d2); // ->1. ep kieu d1 thanh int



        String name = "hello";
        System.out.println("do dai chuoi la: " + name.length());


    }
    public static void main(String[] args) {
        kieudulieu();

    }

}
