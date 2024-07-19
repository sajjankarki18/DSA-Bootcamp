package Linked_list;

public class doubly_linked_list {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(56);
        list.insertFirst(78);
        list.insertLast(89);
        list.insertLast(90);

        list.insertAtSpecificIndex(100, 4);
        list.removeAtSpecificIndex(1);

        list.display();
    }
}

class DLL{
    Node head;
    Node tail;
    int size = 0;

    public DLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = node;
        }else {
            node.next = head;
            head.prev = node;
        }

        head = node;
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);

        if(tail == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.prev = tail;

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

        Node node = new Node(value, temp.next, temp.prev);
        temp.next = node;
        node.prev = temp;

        size++;
    }

    public int removeFirst(){
        int value = head.value;

        head = head.next;
        head.prev = null;

        size--;
        return value;

    }

    public int removeLast(){
        Node curr = head;
        Node prev = null;

        if(curr.next == null){
            int value = head.value;
            head = null;
            tail = null;

            size--;
            return value;
        }

        while (curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        int value = curr.value;
        prev.next = null;
        tail = prev;

        size--;
        return value;
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }

        System.out.print("END");
    }

    public int removeAtSpecificIndex(int index){
        Node curr = head;
        Node prev = null;

        if(index == 0){
            removeFirst();
        }

        if(index == size){
            removeLast();
        }

        for(int i = 0;i<index;i++){
            prev = curr;
            curr = curr.next;
        }
        int value = curr.value;
        prev.next = curr.next;

        size--;
        return value;
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
             this.value = value;
        }

        Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
