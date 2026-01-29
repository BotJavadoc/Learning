package collectionlearn;

public class DoublyLinkedList {

private static Node addArray(int arr []) {
    Node tail;
    Node head = new Node(arr[0]);
    tail = head;
    for(int i = 1; i<arr.length;i++) {
        Node temp = new Node(arr[i]);
        tail.next = temp;
        temp.prev =tail;
        tail = temp;
    }
    return head;
}
private static void displayDoubly(Node head) {
    Node curr = head;   
    while(curr != null) {
        System.err.print(" <--> "+curr.data);
        curr = curr.next;
    }
}

private static void addingInbtwPos(Node head,int pos, int k) {
    Node curr = head;
    Node temp = new Node(k);
    int counter =0;
       while(curr.next != null) {
        if(pos == counter){
            temp.next = curr.next;
            curr.next.prev = temp;
            curr.next = temp;
            temp.prev = curr;
            break;
        }
        curr = curr.next;
         counter++;
        }
}
public static void delByPos(Node head, int pos) {
    Node curr = head;
    int counter =0;
   while(curr.next != null) {
    if(pos == counter) {
        curr.next = curr.next.next;
        curr.next.next.prev = curr;
    }
    curr = curr.next;
     counter ++;   
    }
}

    public static void main(String[] args) {
        int arr[]= {1,5,3,6,4,7};
        int pos = 2;
        int k = 100;
     //   addArray(arr);
        displayDoubly(addArray(arr));
        Node head = addArray(arr);
        addingInbtwPos(head, pos, k);
         System.err.println("");
        System.err.println("After Inseritng an data by pos : "+pos);
        displayDoubly(head);
        delByPos(head, pos);
        System.err.println("");
        System.err.println("Aftr deleting an data by pos : "+pos);
        displayDoubly(head);
    }
}

class Node {
    int data;
    Node next;
    Node prev;

      Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
}