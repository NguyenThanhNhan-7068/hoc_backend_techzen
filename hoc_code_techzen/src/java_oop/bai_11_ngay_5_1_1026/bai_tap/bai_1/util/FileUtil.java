package java_oop.bai_11_ngay_5_1_1026.bai_tap.bai_1.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileUtil {

    public static String readAllToOneLine(String path) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(path));
        return String.join(" | ", lines);
    }

    public static List<String> readFirst3Lines(String path) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(path));
        return lines.subList(0, Math.min(3, lines.size()));
    }

    public static int countWord(String path, String word) throws IOException {
        int count = 0;
        List<String> lines = Files.readAllLines(Path.of(path));
        for (String line : lines) {
            if (line.trim().equals(word.trim())) {
                count++;
            }
        }
        return count;
    }

    public static String checkPathType(String path) {
        File file = new File(path);
        if (!file.exists()) return "Khong ton tai";
        if (file.isFile()) return "La FILE";
        return "La THU MUC";
    }

    public static boolean deletePath(String path) {
        File file = new File(path);
        return file.exists() && file.delete();
    }

    public static boolean renamePath(String oldPath, String newPath) {
        File oldFile = new File(oldPath);
        File newFile = new File(newPath);
        return oldFile.exists() && oldFile.renameTo(newFile);
    }
}
