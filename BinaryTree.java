public class BinaryTree{
  Node root = null;

  public BinaryTree(){
    root = null;
  }

  public static Node getNode(BinaryTree aTree){
    return aTree.root;
  }

  public void traverse(){
    this.root.visit();
  }

  public void addValue(int val){
    Node aNode = new Node(val);
    if(this.root == null){
      this.root = aNode;
    }else{
      this.root.addNode(aNode);
    }
  }

  public static void main(String... args){
    BinaryTree bTree = new BinaryTree();
    BinaryTree secondTree = new BinaryTree();


    bTree.addValue(2);
    bTree.addValue(3);
    bTree.addValue(8);
    bTree.addValue(7);

    bTree.traverse();

  }

}
