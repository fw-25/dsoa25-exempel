public class Queuey {

    Node front, rear;

    private static class Node {
        String value;
        Node next;

        Node(String value) {
            this.value = value;
        }
    }

    public void enqueue(String value) {
        Node n = new Node(value);
        if (front == null) {
            front = n;
        } else {
            rear.next = n;
        }
        rear = n;
    }

    public String dequeue() {
        String ret;
        ret = front.value;
        front = front.next;
        return ret;
    }

    public String peek() {
        return front.value;
    }

    public String toString() {
        String ret = "Queuey: [ (front)";
        Node current = front;
        while (current != null) {
            ret += " " + current.value;
            current = current.next;
        }
        return ret + " (rear) ]";
    }


}
