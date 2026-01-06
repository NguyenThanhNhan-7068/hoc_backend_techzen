package java_oop.bai_11_ngay_5_1_1026.bai_tap.util;

import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteFileUtil {

    private static final Logger logger =
            Logger.getLogger(WriteFileUtil.class.getName());

    public static void writeError(String path, List<String> errors) {

        File file = new File(path);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String e : errors) {
                bw.write(e);
                bw.newLine();
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Loi khi ghi error.txt", e);
        }
    }
}
