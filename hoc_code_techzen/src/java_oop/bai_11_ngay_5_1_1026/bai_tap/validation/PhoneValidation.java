package java_oop.bai_11_ngay_5_1_1026.bai_tap.validation;

import java_oop.bai_11_ngay_5_1_1026.bai_tap.exception.EmptyFieldException;
import java_oop.bai_11_ngay_5_1_1026.bai_tap.exception.MinLengthException;
import java_oop.bai_11_ngay_5_1_1026.bai_tap.exception.NumberOutOfRangeException;

public class PhoneValidation {

    public static void checkBatteryHealth(int battery)
            throws NumberOutOfRangeException {
        if (battery < 0 || battery > 100) {
            throw new NumberOutOfRangeException("Tinh trang pin phai tu 0 den 100%");
        }
    }

    public static void checkDescription(String description)
            throws EmptyFieldException, MinLengthException {
        if (description == null || description.trim().isEmpty()) {
            throw new EmptyFieldException("Mo ta khong duoc de trong");
        }
        if (description.length() < 10) {
            throw new MinLengthException("Mo ta phai co it nhat 10 ky tu");
        }
    }
}
