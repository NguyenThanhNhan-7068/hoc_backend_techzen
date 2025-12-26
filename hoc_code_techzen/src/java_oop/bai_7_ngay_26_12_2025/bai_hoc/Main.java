package java_oop.bai_7_ngay_26_12_2025.bai_hoc;

public class Main {

    private static MyLinkedList testList() {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(140);
        list.addLast(15);
        list.addIndex(2, 77);
        return list;
    }

    public static void main(String[] args) {

        MyLinkedList list1 = testList();
        System.out.println("\ndanh sach ban dau: " + list1);

        MyLinkedList list2 = testList();
        System.out.println("\nxoa phan tu dau: " + list2.removeFirst());
        System.out.println(list2);

        MyLinkedList list3 = testList();
        System.out.println("\nxoa phan tu cuoi: " + list3.removeLast());
        System.out.println(list3);

        MyLinkedList list4 = testList();
        System.out.println("\nxoa tai index 2: " + list4.removeIndex(2));
        System.out.println(list4);

        MyLinkedList list5 = testList();
        System.out.println("\nphan tu dau: " + list5.getFirst());
        System.out.println("\nphan tu cuoi: " + list5.getLast());

        MyLinkedList list6 = testList();
        System.out.println("\nphan tu tai index 3: " + list6.get(3));

        MyLinkedList list7 = testList();
        list7.set(1, 999);
        System.out.println("\nsau khi set: " + list7);

        MyLinkedList list8 = testList();
        System.out.println("\nindex dau tien cua 140: " + list8.indexOf(140));

        MyLinkedList list9 = testList();
        list9.addLast(15);
        System.out.println("\nindex cuoi cung cua 15: " + list9.lastIndexOf(15));
    }
}
