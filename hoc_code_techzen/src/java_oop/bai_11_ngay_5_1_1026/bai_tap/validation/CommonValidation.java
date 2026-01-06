package java_oop.bai_11_ngay_5_1_1026.bai_tap.validation;

import java_oop.bai_11_ngay_5_1_1026.bai_tap.exception.EmptyFieldException;
import java_oop.bai_11_ngay_5_1_1026.bai_tap.exception.NegativeNumberException;

public class CommonValidation {

    public static void checkEmpty(String value, String fieldName)
            throws EmptyFieldException {
        if (value == null || value.trim().isEmpty()) {
            throw new EmptyFieldException(fieldName + " khong duoc de trong");
        }
    }

    public static double parsePositiveDouble(String value, String fieldName)
            throws NumberFormatException, NegativeNumberException {
        double number;
        try {
            number = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(fieldName + " phai la so thuc");
        }
        if (number < 0) {
            throw new NegativeNumberException(fieldName + " khong duoc la so am");
        }
        return number;
    }

    public static int parsePositiveInt(String value, String fieldName)
            throws NumberFormatException, NegativeNumberException {
        int number;
        try {
            number = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(fieldName + " phai la so nguyen");
        }
        if (number < 0) {
            throw new NegativeNumberException(fieldName + " khong duoc la so am");
        }
        return number;
    }
}
