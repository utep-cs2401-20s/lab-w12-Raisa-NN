# Week 12

In this weeks lab, the goal is to get more comfortable creating and travering binary search trees. 

### Your task
Given an array of `int`s we want to create a new binary search tree by repeatedly inserting the elements of the array in the order in which they are given. 
We will also provide functions to recursively find the height of the while tree, and the depth of a specific element. 

The basic structure of your new `myBinarySearchTreeNode` class will be as follows:
```
class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue){
    // created a new node with empty child pointers
  }
  
  myBinarySearchTreeNode(int[] A){
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.
  }
  
  public void insert(int inValue){
    // This method takes a new integer as input and decides 
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken. 
  }
  
  public int height(){
     // This method recursively calculates the height of the entire (sub)tree.
     // This method will take O(n) time
  }
  
  public int depth(int search){
     // This method recursively calculates the depth of a given search value. 
     // If the given value is not in the tree, this method returns -1. 
     // Note that if the tree is a proper BST, this method should complete in O(n*log n) time.
  }
  
} 
```

### What do you have to do
1. Fill in the methods described above in the file `myBinarySearchTreeTester.java` using the comments to guide the construction of the methods. 
1. Test your class by creating at least *5 test cases using `JUnit`. For this you will create a new file called `myBinarySearchTreeTester.java`. You are expected to describe and justify each test case in a comment right before in the code. 

### What you should submit on Git
1. `myBinarySearchTreeNode.java`, and 
1. `myBinarySearchTreeTester.java`

### When
Due *Friday, 17 April 2020 @11:59pm*. <br />
Lateness rule: -10 pts for 1 day of lateness / - 20 pts for 2 days of lateness / 0 after that, but you still have to turn in your work. 


### Grading: 

70 pts	Method `myBinarySearchTreeNode.java` <br />
50 pts	JUnit tests for method your binary tree in `myBinarySearchTreeTester.java `(10 pts per test case / of which, 5 pts for the justification and 5 pts for the implementation)

### Subggested Schedule
Monday -- Create the test cases & the constructor
Wednesday -- Create the search, and height methods & test. 
