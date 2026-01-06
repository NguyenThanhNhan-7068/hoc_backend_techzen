package java_oop.bai_11_ngay_5_1_1026.bai_hoc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteFileStudy {
    private static final Logger logger = Logger.getLogger(WriteFileStudy.class.getName());

    public static void main(String[] args) {
        File file = new File("hoc_code_techzen/src/java_oop/bai_11_ngay_5_1_1026/bai_hoc/data/output.txt");

        /// Đối với FileWriter, nếu chưa có file output.txt
        /// -> tự động tạo mới file theo đường dẫn đó

//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
//            try {
//                /// Ghi đè toàn bộ dữ liệu trong file
//
//                bufferedWriter.write("Trần Văn A\n");
//                bufferedWriter.write("Trần Văn B");
//                bufferedWriter.newLine(); // bang voi \n de xuong hang.
//                bufferedWriter.write("Trần Văn C");
//                bufferedWriter.newLine();
//            } catch (IOException e) {
//                logger.log(Level.SEVERE, ">>>>> Lỗi ghi file", e);
//            }
//        } catch (IOException e) {
//            logger.log(Level.SEVERE, ">>>>> Lỗi khi đóng BufferedReader", e);
//        }

/// cach viet khac cua khoi try catch tren
        BufferedWriter bufferedWriter = null;
        try {
            /// Ghi đè toàn bộ dữ liệu trong file
            bufferedWriter = new BufferedWriter(new FileWriter(file));

            bufferedWriter.write("Trần Văn A\n");
            bufferedWriter.write("Trần Văn B");
            bufferedWriter.newLine(); // bang voi \n de xuong hang.
            bufferedWriter.write("Trần Văn C");
            bufferedWriter.newLine();
        } catch (IOException e) {
            logger.log(Level.SEVERE, ">>>>> Lỗi ghi file", e);
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                logger.log(Level.SEVERE, ">>>>> Lỗi khi đóng BufferedReader", e);
            }
        }
    }
}
