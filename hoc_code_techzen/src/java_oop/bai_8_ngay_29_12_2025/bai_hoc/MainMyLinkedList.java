package java_oop.bai_8_ngay_29_12_2025.bai_hoc;

public class MainMyLinkedList {

    private static MyLinkedLisDocument<String> testList() {
        MyLinkedLisDocument<String> list = new MyLinkedLisDocument();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addLast("d");
        list.addLast("e");
        list.addIndex(2, "f");
        return list;
    }

    public static void main(String[] args) {

        MyLinkedLisDocument<String> list1 = testList();
        System.out.println("\ndanh sach ban dau: " + list1);

        MyLinkedLisDocument<String> list2 = testList();
        System.out.println("\nxoa phan tu dau: " + list2.removeFirst());
        System.out.println(list2);

        MyLinkedLisDocument<String> list3 = testList();
        System.out.println("\nxoa phan tu cuoi: " + list3.removeLast());
        System.out.println(list3);

        MyLinkedLisDocument<String> list4 = testList();
        System.out.println("\nxoa tai index 2: " + list4.removeIndex(2));
        System.out.println(list4);

        MyLinkedLisDocument<String> list5 = testList();
        System.out.println("\nphan tu dau: " + list5.getFirst());
        System.out.println("\nphan tu cuoi: " + list5.getLast());

        MyLinkedLisDocument<String> list6 = testList();
        System.out.println("\nphan tu tai index 3: " + list6.get(3));

        MyLinkedLisDocument<String> list7 = testList();
        list7.set(1, "999");
        System.out.println("\nsau khi set: " + list7);

        MyLinkedLisDocument<String> list8 = testList();
        System.out.println("\nindex dau tien cua 140: " + list8.indexOf("140"));

        MyLinkedLisDocument<String> list9 = testList();
        list9.addLast("15");
        System.out.println("\nindex cuoi cung cua 15: " + list9.lastIndexOf("15"));
    }
}

