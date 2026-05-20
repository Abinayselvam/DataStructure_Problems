public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Java Data Structure Problems");
        LinkedList<Integer> list = new LinkedList<>();

        // Create and append
        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Linked List Sequence:");

        list.display();
    }
}