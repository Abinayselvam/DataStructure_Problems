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
    // Pop first element
    public void pop() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Deleted Node: " + head.data);

        // Move head to next node
        head = head.next;
    }

    // Delete last node
    public void popLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            System.out.println("Deleted Node: " + head.data);
            head = null;
            return;
        }

        Node<T> temp = head;

        // Move till second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        System.out.println("Deleted Node: " + temp.next.data);

        // Remove last node
        temp.next = null;
    }
    // Search node
    public boolean search(T key) {

        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(key)) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }
    // Search node and return node reference
    public Node<T> searchNode(T key) {

        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(key)) {
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    // Insert after specific node
    public void insertAfter(Node<T> previousNode, T data) {

        if (previousNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node<T> newNode = new Node<>(data);

        newNode.next = previousNode.next;

        previousNode.next = newNode;
    }

}