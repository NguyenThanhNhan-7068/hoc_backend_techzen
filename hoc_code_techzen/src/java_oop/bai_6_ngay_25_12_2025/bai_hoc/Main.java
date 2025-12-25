package java_oop.bai_6_ngay_25_12_2025.bai_hoc;

public class Main {
    public static void main(String[] args) {
//        anh thien cho lam main don gian de test thoi vi sang mai ban thi nen toi khong co nhieu thoi gian lam
//        vay nen tui khong "new moi ra tranh ghi de len myArrayList" vi phai danh thoi gian on bai
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);

        System.out.println("them phan tu: " + myArrayList);

        myArrayList.add(2,1000);
        System.out.println("them phan tu qua index: " + myArrayList);

        myArrayList.set(0,10000);
        System.out.println("chen phan tu: " + myArrayList);

        System.out.println("get index: "+ myArrayList.get(1));
        System.out.println("check indexOf: " + myArrayList.indexOf(20));
        System.out.println("check lastIndexOf(10): " + myArrayList.lastIndexOf(10));

        myArrayList.remove(3);
        System.out.println("remove index: " + myArrayList);

        myArrayList.removeElement(10);
        System.out.println("remove so 10: " + myArrayList);

    }
}