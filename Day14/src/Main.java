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

        System.out.println("After Pop:");
    }
}