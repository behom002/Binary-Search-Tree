public class BinaryTree{
  Node root = null;

  public BinaryTree(){
    root = null;
  }

  public static Node getNode(BinaryTree aTree){
    return aTree.root;
  }

  public static void addTreeValue(BinaryTree aTree, int val){
    Node aNode = new Node(val);
    if(aTree.root == null){
      aTree.root = aNode;
    }else{
      aTree.root.addNode(aNode);
    }
  }


  public static void main(String... args){
    BinaryTree bTree = new BinaryTree();

    addTreeValue(bTree, 2);
    addTreeValue(bTree, 3);
    System.out.println(bTree.root);

  }

}
