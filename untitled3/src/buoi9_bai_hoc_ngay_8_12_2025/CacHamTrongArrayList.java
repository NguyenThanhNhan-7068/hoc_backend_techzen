package buoi9_bai_hoc_ngay_8_12_2025;
import java.util.ArrayList;
import java.util.Collections;
public class CacHamTrongArrayList {



        public static void main(String[] args) {

            // =============================================
            // 1. TẠO ARRAYLIST
            // =============================================
            ArrayList<Integer> list = new ArrayList<>();


            // =============================================
            // 2. add() – Thêm phần tử vào cuối
            // =============================================
            list.add(10);
            list.add(20);
            list.add(30);
            System.out.println("List sau khi add: " + list);


            // =============================================
            // 3. add(index, value) – Chèn vào vị trí index
            // =============================================
            list.add(1, 15);
            System.out.println("Sau khi chèn 15 ở index 1: " + list);


            // =============================================
            // 4. get(index) – Lấy phần tử
            // =============================================
            int value = list.get(2);
            System.out.println("Phần tử ở index 2: " + value);


            // =============================================
            // 5. set(index, value) – Thay giá trị
            // =============================================
            list.set(2, 99);
            System.out.println("Sau khi set index 2 = 99: " + list);


            // =============================================
            // 6. remove(index) – Xóa theo vị trí
            // =============================================
            list.remove(1);
            System.out.println("Sau khi remove index 1: " + list);


            // =============================================
            // 7. remove(Object) – Xóa theo giá trị
            // (Lưu ý: phải dùng Integer.valueOf khi xóa value)
            // =============================================
            list.remove(Integer.valueOf(99));
            System.out.println("Sau khi remove giá trị 99: " + list);


            // =============================================
            // 8. size() – Số phần tử hiện tại
            // =============================================
            System.out.println("Kích thước list: " + list.size());


            // =============================================
            // 9. contains(value) – Kiểm tra tồn tại
            // =============================================
            System.out.println("List có chứa 30 không? " + list.contains(30));


            // =============================================
            // 10. indexOf(value) – Vị trí xuất hiện đầu tiên
            // =============================================
            System.out.println("Vị trí của 30: " + list.indexOf(30));


            // =============================================
            // 11. lastIndexOf(value) – Vị trí cuối
            // =============================================
            list.add(30); // thêm 30 lần 2
            System.out.println("List hiện tại: " + list);
            System.out.println("Vị trí cuối của 30: " + list.lastIndexOf(30));


            // =============================================
            // 12. isEmpty() – Kiểm tra rỗng
            // =============================================
            System.out.println("List rỗng chưa? " + list.isEmpty());


            // =============================================
            // 13. toArray() – Chuyển thành mảng Object
            // =============================================
            Object[] array = list.toArray();
            System.out.print("Array từ list: ");
            for (Object o : array) {
                System.out.print(o + " ");
            }
            System.out.println();


            // =============================================
            // 14. Sort – Sắp xếp tăng dần
            // =============================================
            Collections.sort(list);
            System.out.println("List sau khi sort tăng dần: " + list);


            // =============================================
            // 15. Sort giảm dần
            // =============================================
            list.sort(Collections.reverseOrder());
            System.out.println("List sau khi sort giảm dần: " + list);


            // =============================================
            // 16. Duyệt for thường
            // =============================================
            System.out.print("Duyệt bằng for: ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();


            // =============================================
            // 17. Duyệt for-each
            // =============================================
            System.out.print("Duyệt bằng for-each: ");
            for (int x : list) {
                System.out.print(x + " ");
            }
            System.out.println();


            // =============================================
            // 18. clear() – Xóa toàn bộ
            // =============================================
            list.clear();
            System.out.println("List sau khi clear: " + list);
            System.out.println("List rỗng? " + list.isEmpty());


            // =============================================
            // 19. addAll() – Thêm nhiều phần tử từ list khác
            // =============================================
            ArrayList<Integer> a = new ArrayList<>();
            a.add(1);
            a.add(2);
            a.add(3);

            ArrayList<Integer> b = new ArrayList<>();
            b.add(10);
            b.add(20);

            a.addAll(b);
            System.out.println("List a sau addAll(b): " + a);


            // =============================================
            // 20. removeAll() – Xóa những phần tử có trong list khác
            // =============================================
            ArrayList<Integer> c = new ArrayList<>();
            c.add(2);
            c.add(10);

            a.removeAll(c);
            System.out.println("List a sau removeAll(c): " + a);


            // =============================================
            // 21. retainAll() – Giữ lại phần tử giao nhau
            // =============================================
            ArrayList<Integer> d = new ArrayList<>();
            d.add(1);
            d.add(20);
            d.add(3);

            a.retainAll(d);
            System.out.println("List a sau retainAll(d): " + a);
        }
    }


