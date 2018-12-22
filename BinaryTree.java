public class BinaryTree{
  Node root = null;

  public BinaryTree(){
    root = null;
  }

  public void traverse(){
    this.root.visit();
  }

  public void find(int value){
    this.root.search(value);
  }

  public void addValue(int val){
    Node aNode = new Node(val);
    if(this.root == null){
      this.root = aNode;
    } else{
      this.root.addNode(aNode);
    }
  }

  public static void main(String... args){
    BinaryTree bTree = new BinaryTree();
    BinaryTree secondTree = new BinaryTree();

    for(int i = 0; i < 10; i++){
      bTree.addValue(i);
    }

    bTree.traverse();
    bTree.find(4);
  }

}
