package java_oop.bai_8_ngay_29_12_2025.bai_tap;

public class MyStack<E> {
    public class Node {
        private final E value;
        private Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node tail;
    private Node head;
    private int size;

    public int Size() {
        return size;
    }

    public void push(E value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }


    public E pop() {
        if (head == null) {
            return null;
        }

        E valueReturn = head.value;

        if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            head = head.next;
            size--;
        }
        return valueReturn;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.value).append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }

    public E peek() {
        if (head == null) return null;
        return head.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }




}
