class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue){
    // created a new node with empty child pointers
    myValue = inValue;
    left = null;
    right = null;

  }
  
  myBinarySearchTreeNode(int[] A){
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.
    myValue = A[0];
    for (int i = 1; i < A.length; i++) {
      insert(A[i]);
    }
  }
  
  public void insert(int inValue){
    // This method takes a new integer as input and decides 
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken.

    if (inValue > myValue) { //if this is true, insertion will be right of the tree
      if (right == null) { //if there's no node occupying the right child of the tree, a new node is created there
        right = new myBinarySearchTreeNode(inValue);
      }
      else { //if there's a node occupying the right child of the tree, a new node is created after it recursively
        right.insert(inValue);
      }
    }
    else if (inValue < myValue) { //if this is true, insertion will be left of the tree (preventing duplicate insertions as well)
      if (left == null) { //if there's no node occupying the left child of the tree, a new node is created there
        left = new myBinarySearchTreeNode(inValue);
      }
      else { //if there's a node occupying the left child of the tree, a new node is created after it recursively
        left.insert(inValue);
      }
    }
    else {//if inValue == myValue, message is printed
      System.out.println("No duplicates allowed.");
    }
  }
  
  public int height(){
     // This method recursively calculates the height of the entire (sub) tree.
     // This method will take O(n) time

    int leftHeight = 0; //Originally, the height from the root of the tree is 0
    int rightHeight = 0;
    if (left != null) { //if left side of tree exists, the left of the tree's height is incremented recursively
      leftHeight = 1 + left.height();
    }
    if (right != null) {
      rightHeight = 1 + right.height();
    }
     return Math.max(leftHeight, rightHeight); //Adding 1 to account for height of the root. The height is the distance from the root to deepest leaf, so Math.max() is used
  }
  
  public int depth(int search){
     // This method recursively calculates the depth of a given search value. 
     // If the given value is not in the tree, this method returns -1. 
     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
     // (i.e. the number of the recursive calls).

    if (search == myValue) { //the value was found in the tree, so its depth returned
      return 0;
    }
    if (search < myValue) { //if the node I'm searching for is in the left side of the tree
      if (left != null) { //if left side of the tree exists, tree can be traversed in that direction and depth incremented recursively
        return 1 + left.depth(search);
      }
    }
    if (search > myValue) {
      if (right != null) {
        return 1 + right.depth(search);
      }
    }
    return -1; //the value is not in the tree
  }
  
  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }

  public void print2() { //print2 method provided by Antoine to debug the code since the 1st print method had unexpected results
      System.out.println("==========");
      System.out.println("Root: " + myValue);

      if(left != null)
        System.out.println("Left: " + left.myValue);
      else
        System.out.println("Left: none");

      if(right != null)
        System.out.println("Right: " + right.myValue);
      else
        System.out.println("Right: none");


      if(left != null)
        left.print2();
      if(right != null)
        right.print2();
    }

  /*This method counts the number of nodes in the tree recursively*/
  public int size() {
    int sum = 1; //if this method is called, it implies that at least one node is of existence (ie the node calling the left and right branches).
    if (left != null) { //There is a node present on the left side of the tree
      sum += left.size(); //the sum (number of nodes) in left side of tree is incremented recursively
    }
    if (right != null) {
      sum += right.size(); //the sum (number of nodes) in right side of tree is incremented recursively
    }
    return sum; //base case
  }

}
