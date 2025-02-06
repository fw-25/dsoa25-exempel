public class Linky {
    private Node first;
    private Node last;

    // Inre klass (inner class)
    private static class Node {
        Person person;
        Node next;

        Node(Person person, Node next) {
            this.person = person;
            this.next = next;
        }

        public String getName() {
            return this.person.getName();
        }

    }

    public void add(Person person) {
        Node n = new Node(person, null);

        if (first == null) first = n; // Om listan är tom
        if (last != null) last.next = n; // Gamla lasts next blir nya noden
        last = n; // nya noden blir last

    }

    public int size() {
        int index = 0;
        Node current = first;
        while (current != null) {
            index++;
            current = current.next;
        }
        return index;
    }

    @Override
    public String toString() {
        String ret = "Linky: [ ";
        Node current = first;
        while (current != null) {
            ret += " " + current.getName();
            current = current.next;
        }
        return ret + " ]";
    }

}
