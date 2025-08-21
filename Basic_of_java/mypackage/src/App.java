import java.util.ArrayList;
import java.util.List;

class Queue {
    private List<Integer> list = new ArrayList<>();

    // Enqueue - Add element to the end
    public void enqueue(int data) {
        list.add(data);
        System.out.println("Enqueued: " + data);
    }

    // Dequeue - Remove element from the front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = list.remove(0); // remove first element
        System.out.println("Dequeued: " + removed);
        return removed;
    }

    // Peek - View front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return list.get(0);
    }

    // Check if empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Display Queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}

// Main class to test Queue
public class App {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Front element: " + queue.peek());

        queue.dequeue();
        queue.display();
    }
}
