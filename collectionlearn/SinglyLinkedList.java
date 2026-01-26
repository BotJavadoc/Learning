package collectionlearn;

class Node {
    int data;
    Node next;

     Node(int data) {
        this.data = data;
        this.next = null;
    }
    
}
public class SinglyLinkedList {
    
    public static Node addArray(int arr[]) {
        Node head = new Node(arr[0]);
        Node tail = head;
        for(int i =1; i<arr.length;i++) {
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

    public static void delete(int k, Node head) {
        Node curr = head;
        while (curr.next != null) { 
            if(curr.next.data == k) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }
        }

        public static void delByPos(int pos, Node head) {
            Node curr = head;
            int count = 0;
            while(curr.next != null) {
                count++;
                System.err.println(" debug count"+count);
                if (count == pos) {
                    curr.next = curr.next.next; 
                    break;
                }
                curr = curr.next; 
            }
       }   

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,3,5};
       display(addArray(arr));
       Node check =  addArray(arr);
       delete(5,check);
       System.err.println("");
       System.out.println("delete by element "+3);
       display(check);
       delByPos(2, check);
       System.err.println("");
       System.err.println("delete by position ="+3);
       display(check);
    }

}