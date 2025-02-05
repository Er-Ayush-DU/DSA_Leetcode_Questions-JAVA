class Node{
  int data;
  Node next;

  public Node(int data){
     this.data = data;
  }
}
class LinkedList{
    Node head = null;
    Node tail = null;
    
  

  public void displayr(Node head){
      if(head == null){
        return;
      }
      displayr(head.next);
      System.out.print(head.data + "->");
  }
}


public class Reverse_LL {
  public static void main(String[] args) {
    LinkedList ll= new LinkedList();
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);

    a.next=b;
    b.next=c;
    c.next=d;

    ll.displayr(a);
    

  }
  
}
