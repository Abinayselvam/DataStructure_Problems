class SortedLinkedList<T extends Comparable<T>> {

    Node<T> head;

    // Add in sorted order
    public void add(T data) {

        Node<T> newNode = new Node<>(data);

        // Case 1:
        // Empty list OR insert at beginning
        if (head == null ||
                data.compareTo(head.data) < 0) {

            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> temp = head;

        // Find correct position
        while (temp.next != null &&
                data.compareTo(temp.next.data) > 0) {

            temp = temp.next;
        }

        // Insert node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display list
    public void display() {

        Node<T> temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    // Size method
    public int size() {

        int count = 0;

        Node<T> temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}