package java_core.buoi6_bai_tap_ngay_28_11_2025;

public class BaiTap4 {
    public static void main(String[] args) {

        StringBuffer sBF = new StringBuffer("Hello World");
        StringBuilder sBD = new StringBuilder("Hello World");
        System.out.println("a. Buffer = " + sBF.substring(6));
        System.out.println("   Builder = " + sBD.substring(6));
        System.out.println("b. Buffer = " + new StringBuffer("Hello World").toString().replace("o", "f"));
        System.out.println("   Builder = " + new StringBuilder("Hello World").toString().replace("o", "f"));
        String chuoi1 = "Hello";
        String chuoi2 = "World";
        System.out.println("c. String = " + chuoi1 + chuoi2);
        System.out.println("   StringBuffer = " + new StringBuffer(chuoi1).append(chuoi2));
        System.out.println("   StringBuilder = " + new StringBuilder(chuoi1).append(chuoi2));
    }
}
