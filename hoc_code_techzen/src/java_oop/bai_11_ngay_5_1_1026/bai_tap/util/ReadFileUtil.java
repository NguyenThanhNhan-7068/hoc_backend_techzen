package java_oop.bai_11_ngay_5_1_1026.bai_tap.util;

import java_oop.bai_11_ngay_5_1_1026.bai_tap.*;
import java_oop.bai_11_ngay_5_1_1026.bai_tap.exception.*;
import java_oop.bai_11_ngay_5_1_1026.bai_tap.validation.*;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFileUtil {

    private static final Logger logger =
            Logger.getLogger(ReadFileUtil.class.getName());

    public static List<Phone> readFile(String path, List<String> errors) {

        List<Phone> phones = new ArrayList<>();
        File file = new File(path);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            int lineNumber = 0;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                // Bỏ qua header
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                
                lineNumber++;
                String[] data = line.split(",");
                
                // trim de bo khoang trang
                for (int i = 0; i < data.length; i++) {
                    data[i] = data[i].trim();
                }
                
                List<String> errorLine = new ArrayList<>();
                

                if (data.length < 5) {
                    errorLine.add("Dòng không đủ thông tin (thiếu các trường bắt buộc)");
                    errors.add("Dòng " + lineNumber + ": " + String.join(", ", errorLine));
                    continue;
                }

                try {
                    CommonValidation.checkEmpty(data[0], "Mã điện thoại");
                } catch (Exception e) {
                    errorLine.add(e.getMessage());
                }

                try {
                    CommonValidation.checkEmpty(data[1], "Tên điện thoại");
                } catch (Exception e) {
                    errorLine.add(e.getMessage());
                }

                double price = 0;
                try {
                    price = CommonValidation.parsePositiveDouble(data[2], "Giá bán");
                } catch (Exception e) {
                    errorLine.add(e.getMessage());
                }

                int warranty = 0;
                try {
                    warranty = CommonValidation.parsePositiveInt(
                            data[3], "Thời gian bảo hành");
                } catch (Exception e) {
                    errorLine.add(e.getMessage());
                }

                try {
                    CommonValidation.checkEmpty(data[4], "Hãng sản xuất");
                } catch (Exception e) {
                    errorLine.add(e.getMessage());
                }

                if (data.length == 7) {

                    int battery = 0;
                    try {
                        battery = CommonValidation.parsePositiveInt(
                                data[5], "Tình trạng pin");
                        PhoneValidation.checkBatteryHealth(battery);
                    } catch (Exception e) {
                        errorLine.add(e.getMessage());
                    }

                    try {
                        PhoneValidation.checkDescription(data[6]);
                    } catch (Exception e) {
                        errorLine.add(e.getMessage());
                    }

                    if (errorLine.isEmpty()) {
                        phones.add(new OldPhone(
                                data[0], data[1], price, warranty,
                                data[4], battery, data[6]
                        ));
                    }
                }

                else if (data.length == 6) {

                    int quantity = 0;
                    try {
                        quantity = CommonValidation.parsePositiveInt(
                                data[5], "Số lượng");
                    } catch (Exception e) {
                        errorLine.add(e.getMessage());
                    }

                    if (errorLine.isEmpty()) {
                        phones.add(new NewPhone(
                                data[0], data[1], price, warranty,
                                data[4], quantity
                        ));
                    }
                } else {
                    errorLine.add("Sai định dạng dòng");
                }

                if (!errorLine.isEmpty()) {
                    errors.add("Dòng " + lineNumber + ": "
                            + String.join(", ", errorLine));
                }
            }

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Lỗi khi đọc phone.csv", e);
        }

        return phones;
    }
}
