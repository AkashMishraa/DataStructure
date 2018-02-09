class DleteNode{
  class Node {
    int key;
    Node left, right;

    Node(int data){
       key = data;
       left = right = null;
    }
  }
  Node root;
  DeleteNode(){
    root = null;
  }

  void deleteKey(int key){
    root = deleteNode(root,key);
  }

  Node deleteNode(Node root, int key){

    if (root == null) return root;

    if (key < root.key)
      root.left = deleteNode(root.left, key);
    else if (key > root.key)
      root.right = deleteNode(root.right, key);

    else{
      if(root.left == null)
        return root.right;
      else if (root.right == null) {
        return root.left;
      }

      root.key = minValue(root.right);

      root.right = deleteNode(root.right, root.key);
    }
    return root;
  }
  int minValue(Node root)
  {
    int minv = root.key;
    while(root.left != null){
      minv = root.left.key;
      root = root.left;
    }
    return minv;
  }

    void insert(int key)
      root.insertNode(root, key);

    Node insertNode(Node root, int key){
      if (root == null){
        root = new Node(key);
        return root;
      }
      if(key < root.key)
        root.left = insertNode(root.left, key);
      else if (key > root.key)
        root.right = insertNode(root.right, key);

        return root;
    }
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
      DeleteNode dn = new DeleteNode();
      dn.insert(10);
      dn.insert(20);
      dn.insert(30);
      dn.insert(40);
      dn.insert(50);
      dn.insert(60);

      dn.printNode();

      dn.deleteKey(20);
      dn.deleteKey(60);

      dn.printNode();
    }
}
