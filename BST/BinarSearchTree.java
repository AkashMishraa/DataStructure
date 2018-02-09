/*
Java program for insertion operation in BST

author: Akash Mishra

 */

class BinarySearchTree
{
  class Node{
    int val
    Node left, right;

    public Node(int item){
      val = item;
      left = right = null;
    }
  }

  Node root;

  BinarySearchTree(){
    root = null;
  }

  void insert(Node root, int key){
    root = insertNode(root, key);
  }

  Node insertNode(Node root, int key){

    if(root == null){
      root = new Node(key);
      return root;
    }

    if(key < root.key)
      root.left = insertNode(root.left, key);
    else if (key > root.key)
      root.right = insertNode(root.right, key);

      return root;
  }
// inorder traversal on tree
  void printNode(Node root){
    inorderRec(root);
  }

  void inorder(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();

    bst.insert(10);
    bst.insert(20);
    bst.insert(30);
    bst.insert(40);
    bst.insert(50);
    bst.insert(60);

    bst.printNode();

  }
}
