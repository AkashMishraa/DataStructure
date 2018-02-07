/*
author: Akash Mishra

 */
// Creating Structure of node
class LinkedList{
  Node head;

  class Node{
    int data;
    Node next;
    Node(int d){
      data = d;
      next = null;
    }
  }

  /** Insertion operation on link List **/

  
// Method to push Data in Node

  public void push(int newData){

    Node newNode = new Node(newData);
    newNode.next = head;
    head = newNode;
  }

  // insert data After given node

  public void insertAfter(Node prevNode, int newData){
    if(prevNode == null){
      System.out.println("Previous node in null");
      return;
    }
    Node newNode = new Node(newData);
    newNode.next = prevNode.next;
    prevNode.next = newNode;
  }

// Append node at last

  public void append(int newData){
    Node newNode = new Node(newData);
    if(head == null){
      head = new Node(newData);
      return;
    }
    newNode.next = null;
    Node lastNode = head;
    while(lastNode.next != null)
      lastNode = lastNode.next;
    lastNode.next = newNode;
    return;

  }

// Method to print the link List

  public void printList(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args){
    LinkedList ls = new LinkedList();
    ls.append(10);
    ls.push(12);
    ls.push(15);
    ls.append(20);
    ls.insertAfter(ls.head.next, 25);

    System.out.println("Data in Linked List is: ");
    ls.printList();

  }

}
