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

  public void visit(){
    if(this.left != null){
      this.left.visit();
    }else{
      System.out.println(this.value);
    }

    if(this.right != null){
      this.right.visit();
    }else{
      System.out.println(this.value);
    }


  }

// As it is, a node with the same value as the another one, nothing will happen
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
