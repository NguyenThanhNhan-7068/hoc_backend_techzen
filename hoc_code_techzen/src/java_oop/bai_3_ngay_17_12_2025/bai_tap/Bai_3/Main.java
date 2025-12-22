package java_oop.bai_3_ngay_17_12_2025.bai_tap.Bai_3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDateUtil.fromString_ddMMyyyy("13/01/2025");
        System.out.println("fromString_ddMMyyyy: " + date1);

        LocalDate date2 = LocalDateUtil.fromString_yyyyMMdd("2025/09/10");
        System.out.println("fromString_yyyyMMdd: " + date2);

        String str1 = LocalDateUtil.toString_ddMMyyyy(date2);
        System.out.println("toString_ddMMyyyy: " + str1);

        String str2 = LocalDateUtil.toString_yyyyMMdd(date1);
        System.out.println("toString_yyyyMMdd: " + str2);

    }
}

