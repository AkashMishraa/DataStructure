/*

author: Akash Mishra

 */

class DeleteLinkedList
{
  Node head;

// Structure of node

//  Node->data
  class Node{
    int data;
    Node next;
    Node(int data)
   {
      this.data = data;
      next = null;
   }
  }

// Method to delete data from Link List

  void deleteNode(int val){
    Node temp = head, prev = null;

    if(temp != null && temp.data == val){
      head = temp.next;
      return;
    }
    while(temp != null && temp.data != val){
      prev = temp;
      temp = temp.next;
    }
    if(temp == null)
      return;

    prev.next = temp.next;
  }

// Method to push data in Link List

  public void push(int newData){
    Node newNode = new Node(newData);
    newNode.next = head;
    head = newNode;
  }

// Method to print Linked List
  public void printList(){
    Node tempNode = head;
    while(tempNode != null){
      System.out.print(tempNode.data + " ");
      tempNode = tempNode.next;
    }
    System.out.println();
  }

   public static void main(String[] args) {
     DeleteLinkedList dl = new DeleteLinkedList();
     dl.push(7);
     dl.push(8);
     dl.push(9);
     dl.push(10);
     dl.push(120);

     System.out.println("Created Link List is: ");
     dl.printList();

     dl.deleteNode(120);

     System.out.println("List After deletion of node 120");
     dl.printList();
  }
}
