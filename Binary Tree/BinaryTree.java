/*
author: Akash Mishra

 */
// Creating Structure of tree
class Node{
  int root;
  Node left, right;

  public Node(int val){
    root = val;
    left = right = null;
  }
}

// Creating binary tree

public class BinaryTree{

  Node Root;

  BinaryTree (int root){
    Root = new Node(root);
  }
  BinaryTree(){
    Root = null;
  }

  public static void main(String[] args){
    BinaryTree bt = new BinaryTree();
    bt.Root = new Node(1); //create root
    bt.Root.left = new Node(2); //left child of root
    bt.Root.right = new Node(3); //right child of root
    bt.Root.left.left = new Node(4);
  }

}
