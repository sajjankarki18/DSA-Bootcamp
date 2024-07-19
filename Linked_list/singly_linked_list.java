package Linked_list;

public class singly_linked_list {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(34);
        list.insertFirst(20);
        list.insertLast(45);
        list.insertLast(56);
        list.insertAtSpecificIndex(89, 2);

        list.removeFirst();
        list.removeLast();

        list.removeAtSpecificIndex(1);

        list.display();
    }
}

class SLL{
    Node head;
    Node tail;

    int size = 0;

    public SLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);

        if(tail == null){
            insertFirst(value);
            return;
        }

        tail.next = node;
        tail = node;

        size++;
    }

    public void insertAtSpecificIndex(int value, int index){
        Node temp = head;

        if(index == 0){
            insertFirst(value);
            return;
        }

        if(index == size){
            insertLast(value);
            return;
        }

        for(int i = 1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    public int removeFirst(){
        int value = head.value;
        head = head.next;

        size--;
        return value;
    }

    public int removeLast(){
        int value = tail.value;
        Node temp = head;

        for(int i = 0;i<size - 2;i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;

        return value;
    }

    public int removeAtSpecificIndex(int index){
        Node temp = head;

        if(index == 0){
            removeFirst();
        }

        if(index == size){
            removeLast();
        }

        for(int i = 0;i<index - 1;i++){
            temp = temp.next;
        }

        int value = temp.next.value;
        temp.next = temp.next.next;

        size--;
        return value;
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.print("END");
    }

    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
