package java_core.buoi6_bai_tap_ngay_28_11_2025;

public class BaiTap2 {
    public static void main(String[] args) {

        String chuoi = "123";
        int soNguyen = Integer.parseInt(chuoi);
        System.out.println("a. String → int = " + soNguyen);

        String chuoiInt = String.valueOf(soNguyen);
        System.out.println("b. int →String = " + chuoiInt);

        long soLong = Long.parseLong(chuoi);
        System.out.println("c. String→ long = " + soLong);
        System.out.println("d. long → String = " + String.valueOf(soLong));

        float soFloat = Float.parseFloat("12.5");
        System.out.println("e. String → float = " + soFloat);
        System.out.println("f. float → String = " + String.valueOf(soFloat));

        double soDouble = Double.parseDouble("99.99");
        System.out.println("g. String → double = " + soDouble);
        System.out.println("h. double → String = " + String.valueOf(soDouble));

        short soShort = Short.parseShort("55");
        System.out.println("i. String → short = " + soShort);
        System.out.println("k. short → String = " + String.valueOf(soShort));

//        System.out.println("thay bien de test: " 5+soNguyen);
    }
}
