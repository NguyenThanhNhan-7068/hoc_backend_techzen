package java_oop.bai_3_ngay_17_12_2025.bai_tap.Bai_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {

    private static final DateTimeFormatter DD_MM_YYYY = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static final DateTimeFormatter YYYY_MM_DD = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static LocalDate fromString_ddMMyyyy(String date) {
        return LocalDate.parse(date, DD_MM_YYYY);
    }

    public static LocalDate fromString_yyyyMMdd(String date) {
        return LocalDate.parse(date, YYYY_MM_DD);
    }

    public static String toString_ddMMyyyy(LocalDate date) {
        return date.format(DD_MM_YYYY);
    }

    public static String toString_yyyyMMdd(LocalDate date) {
        return date.format(YYYY_MM_DD);
    }
}

