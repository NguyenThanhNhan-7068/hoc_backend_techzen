package java_oop.bai_11_ngay_5_1_1026.bai_tap.bai_1;

import java_oop.bai_11_ngay_5_1_1026.bai_tap.bai_1.util.FileUtil;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "hoc_code_techzen/src/java_oop/bai_11_ngay_5_1_1026/bai_tap/data/phone.csv";

        try {
            // a
            System.out.println("a. Tat ca tren 1 dong:");
            System.out.println(FileUtil.readAllToOneLine(filePath));

            // b
            System.out.println("\nb. 3 dong dau:");
            List<String> first3 = FileUtil.readFirst3Lines(filePath);
            for (String line : first3) {
                System.out.println(line);
            }

            // c
            System.out.println("\nc. Dem tu 'Apple':");
            System.out.println(FileUtil.countWord(filePath, "Apple"));

            // d
            System.out.println("\nd. Kiem tra duong dan:");
            System.out.println(FileUtil.checkPathType(filePath));

            // e
            // System.out.println("\ne. Xoa file:");
            // System.out.println(FileUtil.deletePath(filePath));


            // System.out.println("\nf. Doi ten file:");
            // System.out.println(FileUtil.renamePath(
            //        filePath, "ss11_file/data/phone_new.csv"));

        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
