
class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }

public class Linkedlist_operations {

    public static Node head = null;
    public static Node tail = null;

    //PRINTING THE LINKEDLIST

    public static void Print(Node head){
        if (head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println();
    }


    //ADDING THE NEW NODE

    public static void addfirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head =  newnode;
            tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;


    }


    //ADDING THE NEW NODE AT LAST

    public static void addlast(int data){
        Node newnode = new Node(data);
        if(head == null) {
             head = newnode;
             tail = newnode;
             return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    //MIDDLE OF LINKEDLIST

    public static void addmiddle(int idx,int data){
        Node newnode = new Node(data);
        if(idx == 0){
            addfirst(data);
            return;
        }
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }
        int i = 0;
        Node temp = head;

        while(i < idx-1 && temp.next != null){
            temp = temp.next;
            i++;
        }
        if(i < idx-1){
            tail.next = newnode;
            tail = newnode;
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;

        if(newnode.next == null){
            tail = newnode;
        }

    }


    public static void size(Node head){

        Node temp = head;
        int i = 0;
        while(temp != null){
            temp = temp.next;
            i++;
        }
        System.out.println("the size is : " + i);
    }

    public static void main(String [] args){
    
        addfirst(10);
        addlast(20);
        addmiddle(3, 30);
        addlast(40);
        addlast(50);

        Print(head);

        size(head);



    }
}


//output

// 10-> 20-> 30-> 40-> 50-> 
// the size is : 5