public class AddLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    //add first in linked list
    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last in linkedlist
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //add element in the given index
    public void add(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    //remove first
    public int removeFirst(){
        if(sizeLL()==0){
            System.out.println("LL is empty");
            return -1;
        }
        Node temp = head;
        int data = temp.data;

        head = temp.next;
        return data;
    }

    //remove last
    public int removeLast(){
        if(sizeLL()==0){
            System.out.println("LL is empty");
            return -1;
        }
        Node temp = head;
        int data = temp.data;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return data;
    }

    public int sizeLL(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    public boolean isFound(int key){
        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    //print a linked list
    public void printLL(){
        Node temp = head;
        System.out.print("head->");
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AddLinkedList ll = new AddLinkedList();
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLL();
        ll.removeFirst();
        ll.printLL();
        ll.removeLast();
        ll.printLL();
        System.out.println(ll.isFound(10));
        System.out.println();
    }
}
