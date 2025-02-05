// Given a singly linked list, check if the linked list has a loop (cycle) or not. A loop means that the last node of the linked list is connected back to a node in the same list.

class Node{
  int data;
  Node next;

   Node(int data){
      this.data = data;
  }
}

public class detect_cycle {
  static boolean cycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(slow!=null && fast!=null && fast.next!=null){
          slow = slow.next;
          fast = fast.next.next;
          if(slow==fast){
            return true;
          }
        }
  return false;
 }


  public static void main(String[] args) {

    ListNode head = new ListNode(1);
    head.next = new ListNode(3);
    head.next.next = new ListNode(4);

    //   create a loop
    head.next.next.next = head.next;

    System.out.println(cycle(head));

  }
}
