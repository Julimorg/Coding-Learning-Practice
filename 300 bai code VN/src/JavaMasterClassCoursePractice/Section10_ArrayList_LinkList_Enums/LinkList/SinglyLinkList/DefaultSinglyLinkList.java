package JavaMasterClassCoursePractice.Section10_ArrayList_LinkList_Enums.LinkList.SinglyLinkList;

public class DefaultSinglyLinkList<T> {
    private Node<T> head;
    private int size;

    public DefaultSinglyLinkList() {
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(T value){
         Node<T> newNode = new Node<>(value);
        newNode.setNext(head);
        head = newNode;
        size++;
    }


}
