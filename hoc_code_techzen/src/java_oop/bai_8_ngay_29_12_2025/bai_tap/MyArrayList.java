package java_oop.bai_8_ngay_29_12_2025.bai_tap;

public class MyArrayList {
    private int[] arr;
    private int size;
    private int capacity;

    public MyArrayList() {
        capacity = 10;
        arr = new int[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    private void checkCapacity() {
        if (size == capacity) {
            capacity = (int)(capacity * 1.5);

            // tránh trường hợp capacity không tăng (0, 1)
            if (capacity == size) {
                capacity++;
            }

            int[] newArr = new int[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }


    public void add(int value) {
        checkCapacity();
        arr[size++] = value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index khong hop le!");
            return -1;
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index khong hop le!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }
}
