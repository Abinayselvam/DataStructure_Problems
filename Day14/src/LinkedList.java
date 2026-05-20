public class LinkedList<T> {

    Node<T> head;

    // Append at end
    public void append(T data) {

        Node<T> newNode = new Node<>(data);

        // If list empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse till last node
        Node<T> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Link last node to new node
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
}