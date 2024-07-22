package linked_list;

public class doubly_linked_list {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(45);
        list.insertFirst(21);
        list.insertFirst(67);

        list.insertLast(100);
        list.insertLast(90);

        list.insertAtSpecificIndex(55, 4);

        list.removeAtSpecificIndex(2);
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
            node.prev = tail;
            head = node;
        }
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

        for(int i = 0;i<index - 1;i++){
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

        while (curr.next == null){
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

    public int removeAtSpecificIndex_valid(int index){
        Node curr = head;
        Node prev = null;

        if(index == 0){
            removeFirst();
        }

        if(index == size){
            removeLast();
        }

        while (curr.next == null){
            int value = head.value;
            head = null;
            tail = null;
            size--;

            return value;
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

    public int removeAtSpecificIndex(int index){
        Node curr = head;
        Node prev = null;

        if(index == 0){
            removeFirst();
        }

        if(index == size){
            removeLast();
        }

        while (curr.next == null){
            int value = head.value;
            head = null;
            tail = null;
            size--;

            return value;
        }

        for(int i = 0;i<index;i++){
            prev = curr;
            curr = curr.next;
        }

        int value = curr.value;
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

        size--;
        return value;
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }

        System.out.println("end of the list");
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
