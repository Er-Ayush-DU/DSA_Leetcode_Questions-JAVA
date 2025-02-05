public class find_nth_node_last {

  public static class Node{
    int data;
    Node next;

  Node(int data){
         this.data= data;
    }
  }

  public static class LinkedList{
    Node head = null;

    Node nthNode(Node head , int idx){
      int size=0;
      Node temp = head;
      while(temp!=null){
        size++;
        temp=temp.next;
        // System.out.println("size of the ll is "+ size);
      }
      int m = size-idx+1;
      temp = head;
      for(int i=1; i<=m-1;i++){
            temp=temp.next;
      }
      return temp;
    }
  }


  
  
  public static void main(String[] args) {
    LinkedList ll= new LinkedList();

    Node a= new Node(1);
    Node b= new Node(2);
    Node c= new Node(3);
    Node d= new Node(4);
    Node e= new Node(5);

    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;

    Node q = ll.nthNode(a,3);
    System.out.println("given index value from last Node is: " + q.data);


  }
  
}
