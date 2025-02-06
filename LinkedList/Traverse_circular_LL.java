class Node{
  int data;
  Node next;

  Node(int data){
   this.data = data;
  }
}

public class Traverse_circular_LL {
   static void Traverse(Node curr , Node head){
    if(head == null){
      return;
    }  
    // curr = head;       /* can not assign here because of local variable can not  access in outside the function.*/

    System.out.println(curr.data);
    if(curr.next == head){
      return;
    }
    Traverse(curr.next , head);


   }





  public static void main(String[] args) {
    Node head = new Node(1);
    head.next  = new Node(2);
    head.next.next  = new Node(3);
    head.next.next.next  = new Node(4);
    head.next.next.next.next  = new Node(5);

    head.next.next.next.next.next = head;

    Traverse(head , head);

  }
}
