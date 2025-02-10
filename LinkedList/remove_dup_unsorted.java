class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
  }
}

public class remove_dup_unsorted {
  public static Node remove_dup(Node head){
    Node curr1 = head;
    while(curr1!=null){
     Node curr2 = curr1;
     while(curr2.next!=null){
       if(curr2.next.data==curr1.data){
        curr2.next = curr2.next.next;
       }
      else{
        curr2= curr2.next;
      }
     }
     curr1 = curr1.next;
    }
    return head;
  }
public static void dispaly(Node head){
  Node temp = head;
  while(temp!=null){
    System.out.print(temp.data + " -> ");
    temp = temp.next;
  }

}


  public static void main(String[] args) {

        Node head = new Node(12);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(41);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(21);

        remove_dup(head);
        dispaly(head);
  
  }
}
