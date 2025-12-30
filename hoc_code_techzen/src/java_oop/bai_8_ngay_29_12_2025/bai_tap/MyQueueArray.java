package java_oop.bai_8_ngay_29_12_2025.bai_tap;

public class MyQueueArray {
    private MyArrayList list;

    public MyQueueArray() {
        list = new MyArrayList();
    }

    public void add(int value) {
        list.add(value);
    }

    public Integer peek() {
        if (isEmpty()) return null;
        return list.get(0);
    }

    public Integer poll() {
        if (isEmpty()) return null;

        int value = list.get(0);
        list.remove(0);
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
