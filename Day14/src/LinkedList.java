class LinkedList<T> {

    Node<T> head;

    // Append method
    public void append(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert after a specific node
    public void insertAfter(T previousData, T newData) {

        Node<T> temp = head;

        // Search for previous node
        while (temp != null && !temp.data.equals(previousData)) {
            temp = temp.next;
        }

        // If node not found
        if (temp == null) {
            System.out.println("Previous node not found");
            return;
        }

        Node<T> newNode = new Node<>(newData);

        // Link new node
        newNode.next = temp.next;

        // Link previous node
        temp.next = newNode;
    }

    // Display linked list
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
}