package java_oop.bai_11_ngay_5_1_1026.bai_hoc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFileStudy {
    private static final Logger logger = Logger.getLogger(ReadFileStudy.class.getName());

    public static void main(String[] args) {
        File file = new File("hoc_code_techzen/src/java_oop/bai_11_ngay_5_1_1026/bai_hoc/data/output.txt");


        /// Có thể sử dụng try-with-resources để java tự tự động gọi close() cho tất cả tài nguyên khai báo trong (...)
        /// -> không cần viết finally { bufferedReader.close(); } thủ công
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            try {//
                System.out.println(bufferedReader.readLine());
                System.out.println(bufferedReader.readLine());
                System.out.println(bufferedReader.readLine());
                System.out.println(bufferedReader.readLine()); // -> Kết quả???

//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }

            } catch (IOException e) {
                logger.log(Level.SEVERE, ">>>>> Lỗi đọc file", e);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, ">>>>> Lỗi khi đóng BufferedReader", e);
        }
        //            catch (NullPointerException e){
//                logger.log(Level.SEVERE, "loi null", e);
//            } // neu bufferedReader.close(); dong 37 nam ngoai if thi moi can cai catch nay
    }
}
