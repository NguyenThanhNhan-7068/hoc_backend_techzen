package java_oop.bai_10_ngay_2_1_2026.bai_tap.validation;

import java_oop.bai_10_ngay_2_1_2026.bai_tap.exception.EmptyFieldException;
import java_oop.bai_10_ngay_2_1_2026.bai_tap.exception.NegativeNumberException;

public class CommonValidation {

    public static void checkEmpty(String value, String fieldName)
            throws EmptyFieldException {
        if (value == null || value.trim().isEmpty()) {
            throw new EmptyFieldException(fieldName + " khong duoc de trong");
        }
    }

    public static double parsePositiveDouble(String value, String fieldName)
            throws NumberFormatException, NegativeNumberException {
        double number = Double.parseDouble(value);
        if (number < 0) {
            throw new NegativeNumberException(fieldName + " khong duoc la so am");
        }
        return number;
    }

    public static int parsePositiveInt(String value, String fieldName)
            throws NumberFormatException, NegativeNumberException {
        int number = Integer.parseInt(value);
        if (number < 0) {
            throw new NegativeNumberException(fieldName + " khong duoc la so am");
        }
        return number;
    }
}
