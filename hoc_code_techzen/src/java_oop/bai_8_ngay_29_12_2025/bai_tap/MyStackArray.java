package java_oop.bai_8_ngay_29_12_2025.bai_tap;

public class MyStackArray {
    private MyArrayList list;

    public MyStackArray() {
        list = new MyArrayList();
    }

    public void push(int value) {
        list.add(value);
    }

    public Integer peek() {
        if (isEmpty()) return null;
        return list.get(list.size() - 1);
    }

    public Integer pop() {
        if (isEmpty()) return null;

        int value = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return value;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i)).append(" ");
        }
        return sb.toString();
    }

}
