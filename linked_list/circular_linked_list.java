package linked_list;

public class circular_linked_list {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(56);
        list.insert(32);
        list.insert(89);
        list.insert(21);

        list.remove(3);
        list.display();
    }
}

class CLL{

    Node head;
    Node tail;

    int size = 0;

    public CLL(){
        this.size = 0;
    }

    public void insert(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = node;
        }

        tail.next = node;
        node.next = head;

        head = node;
        size++;
    }

    public int remove(int index){
        Node temp = head;

        if(index == 0){
            int value = head.value;
            head = head.next;
            tail.next = head;

            size--;
            return value;
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

        if(head != null){
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            while (temp != head);
        }

        System.out.print("Head starts again");
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