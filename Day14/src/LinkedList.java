public class LinkedList<T> {

    Node<T> head;

//Add Node at end
  public void add(T data)
  {
      Node<T> newNode=new Node<>(data);
      if(head == null)
      {
          head=newNode;
          return;
      }
      Node<T> temp=newNode;

      while (temp.next!=null)
      {
          temp=temp.next;
      }
      temp.next=newNode;
  }
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

    //Add first
    public void addFirst(T data)
    {
        Node<T> newNode=new Node<>(data);
        newNode.next=head;
        head=newNode;
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

}