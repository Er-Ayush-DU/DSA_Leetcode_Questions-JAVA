class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
  }
}


public class Count_Length_of_loop {
  static int Count(Node node){
   Node curr = node;
   int count = 1;
   while(curr.next != node){
     count++;
     curr = curr.next;
   }
    return count;
  }
  static int Find_length(Node head){
      Node slow = head;
      Node fast = head;
      while(slow!=null && fast!=null && fast.next!= null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
          return Count(slow);
        }
      
      }
    return 0;
      }

    public static void main(String[] args) {
      // Count_Length_of_loop res = new Count_Length_of_loop();
  
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);
      head.next.next.next = new Node(4);
      head.next.next.next.next = new Node(5);
      head.next.next.next.next.next = new Node(6);
  
      head.next.next.next.next.next.next = head.next.next;
  
      System.out.println("length of the Nodes in loop is " + Find_length(head));
     
      // Find_length(head);


  }
}
