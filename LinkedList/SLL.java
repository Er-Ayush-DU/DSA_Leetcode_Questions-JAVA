class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;

  }
}

class LinkedList {
  Node head = null;
  Node tail = null;
  int size;

  void insert_beggining(int val) {
    Node newNode = new Node(val);
    if (tail == null) {
      tail = newNode;
      // head = newNode;
    } else {
      newNode.next = head;
      // head = newNode;
    }
    head = newNode;
    size++;
  }

  void insert_ending(int val1) {
    Node newNode2 = new Node(val1);
    if (tail == null) {
      head = newNode2;
      // tail = newNode2;
    } else {
      tail.next = newNode2;
      // tail = newNode2;
    }
    tail = newNode2;
    size++;
  }

  // void insert_after(int after, int val2) {
  // Node newNode3 = new Node(val2);
  // Node temp = head;
  // while (temp.next != null) {
  // if(temp.data == after){
  // newNode3.next = temp.next;
  // temp.next = newNode3;
  // break;
  // }
  //
  // temp = temp.next;
  // size++;
  // }
  //
  // }

  void insert_after_index(int index, int val2) {
    if (index < 0 || index > size) {
      System.out.println("index out of bound");
    }
    Node newNode = new Node(val2);
    Node temp = head;
    for (int i = 1; i <= index - 1; i++) {
      temp = temp.next;
    }
    if (index == size) {
      insert_ending(val2);
      return;
    } else if (index == 0) {
      newNode.next = head;
      head = newNode;
      // insert_beggining(val2);
    } 
    newNode.next = temp.next;
    temp.next = newNode;
    size++;
  }

  void DeleteAtBeggining() {
    head = head.next;
    size--;
  }

  void dltAt(int index) {
    if(index >size  || index<0);{
      System.out.println("Index out of bound");
    }
    Node temp = head;
    for (int i = 1; i <= index - 1; i++) {
      temp = temp.next;
    }
    temp.next = temp.next.next;
    if(index==0){
      head = head.next;
      size --;
      return;
    }
    if(index==size-1){
      tail = temp;
    } 
    size--;
  }

   int getAt(int index){
      Node temp = head;
      for(int i=1; i<=index;i++){
        temp = temp.next;
      }
      return temp.data;
   }

  void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public char[] nthNode(find_nth_node_last.Node a, int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'nthNode'");
  }

  // void size(){
  // int count = 0;
  // while(head!=null){
  // count++;
  // head = head.next;
  // }
  // System.out.println("The Length of the Linked List is: " + count);
  //
  // }

}

public class SLL {
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();

    // ll.insert_beggining(5);
    // ll.insert_beggining(10);
    // ll.insert_beggining(15);
    // ll.insert_beggining(20);

    ll.insert_ending(25);
    ll.insert_ending(30);
    ll.insert_ending(32);
    ll.insert_ending(33);

    // ll.insert_after(20,35);
    // ll.insert_after(30,40);
    // ll.insert_after_index(4, 50);
    // ll.insert_after_index(0, 55);

    // ll.insert_after_index(20,80);
    // ll.insert_after_index(-2,90);

    // ll.DeleteAtBeggining();
    // ll.dltAt(12);
    // ll.dltAt(2);

    ll.display();

    System.out.println("The value of given index is: " + ll.getAt(2));

    System.out.println("First Node is: " + ll.head.data);
    System.out.println("last node is " + ll.tail.data);
    System.out.println("Size of the Linked List is " + ll.size);

    // ll.size();
  }
}
