// Java program to count occurrences in
// a linked list by recursion
class Node {
  int data;
  Node next;

  Node(int data) {
      this.data = data;
      this.next = null;
  }
}

public class count_occurance {
  static int count(Node head, int key) {
   int count=0;
   Node temp = head;
   while(temp!= null){
    if(temp.data==key){
      count++;
      // System.out.println(head.data + "  " + count);
    }
    temp=temp.next;
   }
    return count;
  }

  public static void main(String[] args) {
    
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(1);
      head.next.next.next = new Node(2);
      head.next.next.next.next = new Node(1);
      head.next.next.next.next.next = new Node(6);

      int key = 1;

      System.out.println(count(head, key));
  }
}