package intermediate.arrays.linkedlist;

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
        next = null;
    }
}


public class CreateLinkedList {
    static Node head = null;
    public static void insert_node(int position, int value) {
        Node n = new Node(value);
        if(position == 0) {
            n.next = head;
            head = n;
        }
        Node t = head;
        for(int i = 1; i < position; i++) {
            t = t.next;
        }
        n.next = t.next;
        t.next = n;
    }
    static int size = 5;
    public static void delete_node(int position) {
        Node t = head;
        if(position < size) {
            for(int i = 0; i < position - 1; i++) {
                t = t.next;
            }
            if(position == size - 1) {
                t.next = null;
            }
            t.next = t.next.next;
        }
    }

    public static void print_ll() {
        while(head != null) {
            System.out.print(head.value + " ");
        }
    }

    public static void main(String[] args) {

    }
}
