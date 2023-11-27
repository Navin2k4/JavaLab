
// Define an interface “QueueOperations” which declares methods for a static queue. 
// Define a class “MyQueue” which contains an array and front and rear as data members 
// and implements the above interface. Initialize the queue using a constructor. 
// Write the code to perform operations on a queue object.

import java.util.Scanner;

interface QueueOperations{
    void enqueue(int value);
    int dequeue();
}

class MYQueue{
    private static final int maxsize = 10;
    private int queue[];
    private int front;
    private int rear;
    MYQueue(){
        queue = new int[maxsize];
        front = -1;
        rear = -1;
    }
    public void enqueue(int value){
        if(front == -1){
            front = 0 ;
        }
        queue[++rear] = value;
    }
    public int dequeue(){
        return queue[front++];
    }
    public void display(){
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
    }
}

public class QueueMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MYQueue queue = new MYQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        queue.dequeue();
        queue.display();

        queue.enqueue(40);
        queue.display();
        scan.close();
    }
}
