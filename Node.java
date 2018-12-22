public class Node{
  Node left;
  Node right;
  int value;

  public Node(int val){
    this.value = val;
  }

  public void setNode(int aValue){
    this.value = aValue;
  }

  public int getNode(){
    return this.value;
  }

  public void addNode(Node aNode){
    if(this.value > aNode.value){
      if(this.left == null){
        this.left = aNode;
      }else{
        this.left.addNode(aNode);
      }
    }else{
      if(this.value < aNode.value){
        if(this.right == null){
          this.right = aNode;
        }else{
          this.right.addNode(aNode);
        }
      }
    }
  }

  @Override // To check if a method is actually overwritten
  public String toString(){
    return this.value + "\n" + "left: " + this.left + "\nright:" + this.right;
  }

}
