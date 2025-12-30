package java_oop.bai_8_ngay_29_12_2025.bai_tap;

public class MyQueue<E> {
    public class Node{
        private final E value;
        private Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node tail;
    private Node head;
    private int size;

    public int getSize() {
        return size;
    }

    public void add(E value){
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public E poll(){
        if(head == null){
            return null;
        }
        Node temp = head;

        E valueReturn = tail.value;

        if(size == 1){
            tail =null;
             head = null;
             size--;
        }
        else {
            for (int i = 1; i < size -1; i++){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
        return  valueReturn;

    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        Node temp = head;

        while (temp != null){
            stringBuilder.append(temp.value).append(" ");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }

    public E peek() {
        if (head == null) return null;
        return tail.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
