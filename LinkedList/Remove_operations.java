import java.security.PublicKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}




public class Remove_operations{

    public static Node head = null;
    public static Node tail = null;

    //for ADD
    public static void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    //FOR PRINT

    public static void Print(Node node){
        if(node == null){
            return;
        }
        Node temp = node;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    //Remove the first element

    public static int RemoveFirst(){
        if(head == null) return Integer.MAX_VALUE;
        int temp = head.data;
        if(head == tail){
            head = null;
            tail = null;
        }else{
        head = head.next;
        }
        return temp;
    }

    //REMOVE FROM THE LAST

    public static int RemoveLast(){
        if(head == null) return Integer.MIN_VALUE;
        Node temp = head;

        if(temp.next == null){
            int y = temp.data;
            head = null; 
            tail = null;
            return y;
        }

        while(temp.next.next != null){
            temp = temp.next;
        }
        int x = temp.next.data;
        temp.next = null;
        tail = temp;
        return x;
    }


    //Remove from the middle

    // 2-> 3-> 1-> 4-> 5-> 6
    public static int RemoveMiddle(int data1){

        Node temp = head;

        if(head == null) return Integer.MIN_VALUE ;
 
        if(temp.data == data1){
            int s = RemoveFirst();
            return s;
        }
        
            
        while(temp.next != null && temp.next.data != data1){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("element not found");
            return-1;
        }

        Node x = temp.next;
        int r = x.data;

        if(x == tail){
            tail =temp;
        }

        temp.next = x.next;
        return r;


    }

    public static void main(String[] args){

        Remove_operations r = new Remove_operations();
        System.out.println("the elment of linked list are :");
        r.addFirst(60);
        r.addFirst(50);
        r.addFirst(40);
        r.addFirst(30);
        r.addFirst(20);
        r.addFirst(10);
        

        Print(head);


        System.out.println();
        System.out.println("Removing the first element: 10");
        RemoveFirst();
        Print(head);

        System.out.println();
        System.out.println("removing the last element : 60");
        RemoveLast();
        Print(head);

        System.out.println();
        System.out.println("Removing the middle element : 40 ");
        RemoveMiddle(40);
        Print(head);



    }
}


//OUTPUT

// the elment of linked list are :
// 10->20->30->40->50->60->
// Removing the first element: 10
// 20->30->40->50->60->
// removing the last element : 60
// 20->30->40->50->
// Removing the middle element : 40 
// 20->30->50->