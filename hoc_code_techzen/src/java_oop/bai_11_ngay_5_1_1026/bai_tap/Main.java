package java_oop.bai_11_ngay_5_1_1026.bai_tap;

import java_oop.bai_11_ngay_5_1_1026.bai_tap.util.ReadFileUtil;
import java_oop.bai_11_ngay_5_1_1026.bai_tap.util.WriteFileUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String PHONE_FILE =
            "hoc_code_techzen/src/java_oop/bai_11_ngay_5_1_1026/bai_tap/data/phone.csv";

    private static final String ERROR_FILE =
            "hoc_code_techzen/src/java_oop/bai_11_ngay_5_1_1026/bai_tap/data/error.txt";

    public static void main(String[] args) {
        showList();
    }

    private static void showList() {
        List<String> errors = new ArrayList<>();

        List<Phone> phones = ReadFileUtil.readFile(PHONE_FILE, errors);

        WriteFileUtil.writeError(ERROR_FILE, errors);

        System.out.println("=== DANH SACH DIEN THOAI HOP LE ===");
        for (Phone p : phones) {
            p.output();
        }
    }
}
