class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
  }
}


public class delete_duplicate {
  static void delete_dupl(Node head){
      Node temp = head;
      while(temp!=null && temp.next!= null){
        if(temp.data == temp.next.data){
          temp.next = temp.next.next;
        }
        else{
          temp = temp.next;
        }
        System.out.println(temp.data + " ");
        temp = temp.next;
      }
      
    }
  
    // static void display(Node head){
    //    Node temp = head;
    //   while(temp!=null){
    //     System.out.println(temp.data + " ");
    //     temp = temp.next;
    //   }
    // }
    public static void main(String[] args) {
  
      
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(6);
  
        delete_dupl(head);
        // display(head);
  }
}
