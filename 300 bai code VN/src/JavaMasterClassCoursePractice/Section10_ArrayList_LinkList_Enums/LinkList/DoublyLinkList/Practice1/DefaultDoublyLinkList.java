package JavaMasterClassCoursePractice.Section10_ArrayList_LinkList_Enums.LinkList.DoublyLinkList.Practice1;

import java.util.Iterator;

public class DefaultDoublyLinkList<T> implements DoublyLinkedList{

    //? Số lượng Node tồn tại trong LinkList
    private int size;

    private Node<T> head = null;

    private Node<T> tail = null;


    @Override
    public void clear() {
        Node<T> currentNode = head;
        while(currentNode != null){
            Node<T> nextNode = currentNode.getNext();
            currentNode.setNext(null);
            currentNode.setPrev(null);
            currentNode.setData(null);
            currentNode = nextNode;
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(Object element) {

    }

    @Override
    public void addFirst(Object element) {

    }

    @Override
    public void addLast(Object element) {

    }

    @Override
    public Object peekFirst() {
        return null;
    }

    @Override
    public Object peekLast() {
        return null;
    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object removeLast() {
        return null;
    }

    @Override
    public Object remove(Node node) {
        return null;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public Object removeAt(int index) {
        return null;
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
