/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        //Adding 5 Students by hard-coding
        //The Queue enqueues them according to ascending Roll Number as given for example in Problem Statement
        myPriorityQueue.enqueue(new Node(new Student(1,"abhi")));
        myPriorityQueue.enqueue(new Node(new Student(20,"vicky")));
        myPriorityQueue.enqueue(new Node(new Student(15,"shivam")));
        myPriorityQueue.enqueue(new Node(new Student(2,"bhaskar")));
        myPriorityQueue.enqueue(new Node(new Student(5,"ashutosh")));
        myPriorityQueue.printQueue();
    }
}
}
