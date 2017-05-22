# DataStructure

public class LinkedList {
    Node head;
    
    //creating "NODE Structure" make it static so main() can access it
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    //Method to print list
    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    //main() to test linklist
    public static void main(String args[]){
        LinkedList l=new LinkedList();
        
        l.head= new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        l.head.next=second;
        second.next=third;
        
        l.printList();
    }
    
}
