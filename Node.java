public class Node{
  Node left;
  Node right;
  int value;

  public Node(int val){
    this.value = val;
  }

  public void search(int value){
    if(this.value == value){
      System.out.println("found " + value);
    } else if(value < this.value && this.left != null){
      this.left.search(value);
    } else if(value > this.value && this.right != null){
      this.right.search(value);
    }
  }

  public void visit(){
    if(this.left != null){
      this.left.visit();
    }

    System.out.println(this.value); // This is if you want to have it from smallest to biggest number

    if(this.right != null){
      this.right.visit();
    }
    //System.out.println(this.value); // This is if you want to have it from biggest to smallest number
  }

// As it is, a node with the same value as another one will be ignored
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
