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
    //Display
    public void display()
    {
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
