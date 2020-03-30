/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
  MyBinarySearchTree tree = new MyBinarySearchTree();
        //taking hard-coded inputs
        tree.add(12);
        tree.add(20);
        tree.add(25);
        tree.add(30);
        tree.add(34);
        tree.add(40);
        tree.add(45);
        tree.add(50);
        tree.add(57);
        tree.add(72);
        tree.add(78);
        tree.add(90);
        tree.add(81);
        tree.add(3);
        tree.add(66);
        MyQueue queue = new MyQueue();
        //Enqueing from the tree pre order succesors of each node
        queue.enqueue(tree.root);
        //Printing the Queue
        queue.printQueue();
    }
}
}
