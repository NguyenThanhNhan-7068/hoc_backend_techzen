package java_oop.bai_6_ngay_25_12_2025.bai_hoc;

public class MyArrayList {
    private int capacity;
    private int[] arr;
    private final int[] emptyArray= {};
    private int size;

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public MyArrayList(){
        this.arr = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        arr = new int[this.capacity];
    }

    public MyArrayList(int[] arr) {
        this.arr = emptyArray;
    }

    public void add(int emplement){
        if(arr == emptyArray){
            this.capacity = 10;
            arr = new int[this.capacity];
        }

        if(this.capacity == this.size){
            this.capacity *= 1.5;
            if(this.capacity == this.size){//tranh truong hop dang la 0;1
                capacity++ ;
            }
        }

        int[] brr = new int[this.capacity];

        for(int i = 0 ; i < size; i++){
            brr[i] = arr[i];
        }

        arr = brr;
        arr[size] = emplement;
        size ++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0 ; i < size ; i++){
            stringBuilder.append(arr[i]).append(" ");
        }

        return  stringBuilder.toString();

    }

    public void add(int index , int element){
        if(index < 0 || index > size){
            System.out.println("nhap sai index!");
            return;
        }

        if(arr == emptyArray){
            this.capacity = 10;
            arr = new int[this.capacity];
        }

        if(this.capacity == size){
            this.capacity *= 1.5;
            if(this.capacity == size){
                this.capacity++;
            }
        }

        int[] brr = new int[this.capacity];

        for(int i = 0; i < index; i++){
            brr[i] = arr[i];
        }

        brr[index] = element;

        for(int i = index; i < size; i++){
            brr[i + 1] = arr[i];
        }

        arr = brr;
        size++;
    }

    public void set(int index , int element){
        if(index < 0 || index >= size){
            System.out.println("nhap sai index!");
            return;
        }
        arr[index] = element;
    }

    public int get(int index){
        if(index < 0 || index >= size){
            System.out.println("nhap sai index!");
            return -1;
        }
        return arr[index];
    }

    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index khong hop le!");
            return;
        }

        for(int i = index; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void removeElement(int element) {
        int[] brr = new int[capacity];
        int newSize = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] != element) {
                brr[newSize] = arr[i];
                newSize++;
            }
        }

        arr = brr;
        size = newSize;
    }

}
