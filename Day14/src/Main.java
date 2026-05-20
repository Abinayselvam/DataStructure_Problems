public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Java Data Structure Problems");
        LinkedList<Integer> list = new LinkedList<>();

        // Create initial list
        list.append(56);
        list.append(70);

        // Insert 30 between 56 and 70
        list.insertAfter(56, 30);

        System.out.println("Linked List Sequence:");

        list.display();

        System.out.println("Before Pop:");

        list.display();

        // Delete first element
        list.pop();
        // Delete last node
        list.popLast();
        System.out.println("After popLast:");
        System.out.println("After Pop:");
        boolean found = list.search(30);
        // Search node with value 30
        Node<Integer> node = list.searchNode(30);


        System.out.println("Is 30 Present? " + found);
        // Insert 40 after 30
        list.insertAfter(node, 40);

        System.out.println("After Insertion:");
        // Delete 40
        list.delete(40);

        System.out.println("After Deletion:");

        list.display();

        System.out.println("Size of Linked List: "
                + list.size());

    }
}