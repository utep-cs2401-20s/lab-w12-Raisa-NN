import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class myBinarySearchTreeTester {

    @Test //1
    /*This test is used to determine the overall general functionality of the size() method.
    The test should return 3 since the length of the array is 3.
     * This test passed implying that both the test case and code is correct.*/
    public void sizeTest1() {
        int[] testArray = {7, 6, 5};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(testArray);
        int expected = 3;
        assertEquals(expected, tree.size());
    }

    @Test //2
    /*This test is used to determine the overall general functionality of the size() method.
    The test should return 3 since the code does not permit duplicates to be added to the tree.
     * This test passed implying that both the test case and code is correct.*/
    public void sizeTest2() {
        int[] testArray = {7, 6, 5, 7};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(testArray);
        int expected = 3;
        assertEquals(expected, tree.size());
    }

    @Test //3
    /*This test is used to determine the overall general functionality of the depth() method.
    The depth should be 1 because the distance from the search int (6) to the root (7) is 1.
     * This test passed implying that both the test case and code is correct.*/
    public void depthTest1() {
        int[] testArray = {7, 6, 5};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(testArray);
        int expected = 1;
        int search = 6;
        assertEquals(expected, tree.depth(search));
    }

    @Test //4
    /*This test is used to determine the overall general functionality of the height() method.
    The height should be 1 since the distance from the root the deepest leaf is 2.
     * This test passed implying that both the test case and code is correct.*/
    public void heightTest() {
        int[] testArray = {7, 6, 5, 8};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(testArray);
        int expected = 2;
        assertEquals(expected, tree.height());
    }

    @Test //5
    /*This test is used to determine the overall general functionality of the insert() method.
    8 is supposed to be inserted on the right side of the tree since it's greater than the root (7)
     * This test passed implying that both the test case and code is correct.*/
    public void insertTest1() {
        int[] testArray = {7, 6, 5};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(testArray);
        tree.insert(8);
        int expected = 8;
        assertEquals(8, tree.right.myValue);
    }

    @Test //6
    /*This test is used to determine the overall general functionality of the insert() method.
    9 is supposed to be inserted on the right side of the node, 8 (which is one the right of the root) since it's greater than 8.
     * This test passed implying that both the test case and code is correct.*/
    public void insertTest2() {
        int[] testArray = {7, 6, 5, 8, 9};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(testArray);
        tree.insert(8);
        int expected = 8;
        assertEquals(9, tree.right.right.myValue);
    }

    @Test //7
    /*This test is used to determine the overall general functionality of the depth() method.
    The depth should be -1 because the search int (9) is not present in the tree
     * This test passed implying that both the test case and code is correct.*/
    public void depthTest2() {
        int[] testArray = {7, 6, 5};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(testArray);
        int expected = -1;
        int search = 9;
        assertEquals(expected, tree.depth(search));
    }
}