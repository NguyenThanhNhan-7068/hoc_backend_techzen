package buoi6_bai_hoc_ngay_28_11_2025;

public class CompareEquals {
    public static void main(String[] args) {
        String str1 = "NguyenVanA";
        String str2 = "NguyenVanA";
        String str3 = new String("Nguyen Van A");

        System.out.println(str1 == str2); // so sanh gia tri chuoi(gia tri chuoi la dia chi chuoi).
        System.out.println(str1.equals(str2));

        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

    }
}
