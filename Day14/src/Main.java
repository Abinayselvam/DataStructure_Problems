public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Java Data Structure Problems");
        LinkedList<Integer> list = new LinkedList<>();
        //UC2
        // First create 70
        list.addFirst(70);

        // Add 30 before 70
        list.addFirst(30);

        // Add 56 before 30
        list.addFirst(56);

        System.out.println("Linked List Sequence:");
                //UC1
                //        list.add(56);
                //        list.add(30);
                //        list.add(70);
                //        System.out.println("Simple Linked List:");

        list.display();

        // Create and append
        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Linked List Sequence:");

        list.display();
    }
}