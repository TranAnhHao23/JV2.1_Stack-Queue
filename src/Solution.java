public class Solution {
    private Queue queue = new Queue();

    public void enQueue(int data) {
        Node node = new Node(data);
        if (queue.front == null) {
            queue.front = node;
//            queue.rear = node;
//            queue.front.link = queue.rear;

        } else {
            queue.rear.link = node;
        }
        queue.rear = node;
        queue.rear.link = queue.front;
    }

    public Node deQueue() {
        Node node = null;
        if (queue.front != null) {
            node = queue.front;
            if (queue.front == queue.rear) {
                queue.front = null;
                queue.rear = null;
            } else {
                queue.front = queue.front.link;
                queue.rear.link = queue.front;
            }
        }
        return node;
    }

    public void displayQueue() {
        Node temp = queue.front;
        do {
            System.out.println(temp.data);
            temp = temp.link;
        } while (temp.link != queue.front.link);
//        System.out.println(queue.rear.data);
    }

}




