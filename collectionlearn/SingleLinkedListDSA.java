package collectionlearn;

public class SingleLinkedListDSA {
    public static int getMiddle(Node head) {
        int data = 0;
        Node curr = head;
        Node curr2 = head;
        int counter = 0;
        while(curr.next != null) {
            counter++;
            curr = curr.next;
        }
        int mid = 0 ;
        if(counter%2 ==0) {
            mid = counter/2;
        } else mid = (counter/2)+1;
        System.err.println("middle ele is "+mid);
        counter = 0;
        while(curr2.next!=null) {
            System.err.println("counter in the final stage"+counter);
             if(counter == mid) return curr2.data;
            counter++;
            curr2= curr2.next;
        }
        System.err.println("total count "+counter);
        return data;
    }
    public static Node getMiddleList(Node head) {
        int data = 0;
        Node curr = head;
        Node curr2 = head;
        int counter = 0;
        if(head == null || head.next == null) {
            return  head;
        }
        
        while(curr.next != null) {
            counter++;
            curr = curr.next;
        }
        int mid = 0 ;
        if(counter%2 ==0) {
            mid = counter/2;
        } else mid = (counter/2)+1;
        System.err.println("middle ele is "+mid);
        counter = 0;
        while(curr2.next!=null) {
            System.err.println("counter in the final stage"+counter);
             if(counter == mid){
              head = curr2;
                 return head;
             } 
            counter++;
            curr2= curr2.next;
        }
        System.err.println("total count "+counter);
        return head;
    }


    private static Node addArray(int arr []) {
    Node tail;
    Node head = new Node(arr[0]);
    tail = head;
    for(int i = 1; i<arr.length;i++) {
        Node temp = new Node(arr[i]);
        tail.next = temp;
        tail = temp;
    }
    return head;
}
 public static void display(Node head) {
      Node curr = head;
      while(curr != null) {
        System.err.print(" ["+ curr.data +"]"+" ->");
        curr = curr.next;
      }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,3,5};
    Node head = addArray(arr);
    System.err.println("Middle ele is "+getMiddle(head));
    System.err.println(" middle ll list ");
            display(getMiddleList(head));
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
