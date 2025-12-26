package java_oop.bai_7_ngay_26_12_2025.bai_hoc;

public class MyLinkedList {
    private static class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    public  void addFirst(int value){
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next =head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int value){
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        Node temp = head;
//        for (int i = 0; i < size; i++){
//            stringBuilder.append(temp.value).append(" ");
//            temp = temp.next;
//        }
//        return stringBuilder.toString();
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.value).append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }

    public void addIndex(int index, int value){
        Node newNode = new Node(value);

        Node temp = head;

        if(index < 0 || index >size){
            System.out.println("nhap sai index.");
            return;
        }

        else if(index == 0){
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            for(int i = 0;i < index -1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;

        }
    }

    public Integer removeFirst(){
        if(head == null){
            return null;
        }

        int valueReturn = head.value;

        if(size == 1){
            head = null;
            tail = null;
            size--;
        }
        else {
            head = head.next;
            size--;
        }

        return  valueReturn;
    }

    public Integer removeLast(){
        Node temp = head;
        if(head == null){
            return null;
        }

        int valueReturn = tail.value;

        if(size == 1){
            head = null;
            tail = null;
            size--;
        }
        else {
            for (int i = 1; i < size - 1; i++){
                temp = temp.next;
            }
            temp.next =  null;
            tail = temp;
            size--;
        }

        return  valueReturn;
    }

    public Integer removeIndex(int index) {
        if (head == null) {
            return null;
        }

        if (index < 0 || index >= size) {
            System.out.println("nhap sai index.");
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == size - 1) {
            return removeLast();
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        int valueReturn = temp.next.value;
        temp.next = temp.next.next;
        size--;

        return valueReturn;
    }

    public Integer getFirst() {
        if (head == null) return null;
        return head.value;
    }

    public Integer getLast() {
        if (tail == null) return null;
        return tail.value;
    }

    public Integer get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("nhap sai index");
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("nhap sai index");
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    public int indexOf(int element) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == element) return i;
            temp = temp.next;
        }
        return -1;
    }

    public int lastIndexOf(int element) {
        Node temp = head;
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (temp.value == element) index = i;
            temp = temp.next;
        }
        return index;
    }


}
