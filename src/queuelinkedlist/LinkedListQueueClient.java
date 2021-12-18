package queuelinkedlist;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.enQueue(10);
        myLinkedListQueue.enQueue(20);
        myLinkedListQueue.enQueue(30);
        myLinkedListQueue.enQueue(40);
        myLinkedListQueue.deQueue();
        myLinkedListQueue.deQueue();

        myLinkedListQueue.enQueue(50);
        System.out.println("Dequeue item is: " + myLinkedListQueue.deQueue().key);

    }
}
