/*
  A queue is an abstract data type that maintains the order in which elements were added to it, allowing the oldest elements to be removed from the front and new elements to be added to the rear. This is called a First-In-First-Out (FIFO) data structure because the first element added to the queue (i.e., the one that has been waiting the longest) is always the first one to be removed.
  
  A basic queue has the following operations:
  
  Enqueue: add a new element to the end of the queue.
  Dequeue: remove the element from the front of the queue and return it.
  In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one of the following  types:
  
  1 x: Enqueue element  into the end of the queue.
  2: Dequeue the element at the front of the queue.
  3: Print the element at the front of the queue.
 */
package alogorithms;

import java.util.Scanner;
import java.util.Stack;

/**
 * The Class TwoStackQueueing.
 */
public class TwoStackQueueing {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

    /**
     * The Class MyQueue.
     *
     * @param <T>
     *            the generic type
     */
    public static class MyQueue<T> {

        /** The stack newest on top. */
        Stack<T> stackNewestOnTop = new Stack<T>();

        /** The stack oldest on top. */
        Stack<T> stackOldestOnTop = new Stack<T>();

        /**
         * Enqueue.
         *
         * @param value
         *            the value
         */
        public void enqueue(T value) { // Push onto newest stack
           
                stackNewestOnTop.push(value);
          //System.out.println(stackNewestOnTop);
        }

        /**
         * Peek.
         *
         * @return the t
         */
        public T peek() {
            if (stackOldestOnTop.isEmpty()) {

                while(stackNewestOnTop.size()!=0) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
              //System.out.println(stackOldestOnTop);
                T result= stackOldestOnTop.peek();
                while(stackOldestOnTop.size()!=0) {
                    stackNewestOnTop.push(stackOldestOnTop.pop());
                }
                return result;
            } else {
                while(stackOldestOnTop.size()!=0){
                    stackNewestOnTop.push(stackOldestOnTop.pop());
                }
              //System.out.println(stackNewestOnTop);
                T result= stackNewestOnTop.peek();
                while(stackNewestOnTop.size()!=0) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
                return result;
            }
        }

        /**
         * Dequeue.
         *
         * @return the t
         */
        public T dequeue() {
            if (stackOldestOnTop.isEmpty()) {

                while(stackNewestOnTop.size()!=0) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
             // System.out.println(stackOldestOnTop);
                T result= stackOldestOnTop.pop();
                while(stackOldestOnTop.size()!=0)  {
                    stackNewestOnTop.push(stackOldestOnTop.pop());
                }
                return result;
            } else {
                while(stackOldestOnTop.size()!=0)  {
                    stackNewestOnTop.push(stackOldestOnTop.pop());
                }
              //System.out.println(stackNewestOnTop);
                T result= stackNewestOnTop.pop();
                while(stackNewestOnTop.size()!=0) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                  //  stackOldestOnTop.removeElementAt(0);

                }
                return result;
            }

        }
    }

}
