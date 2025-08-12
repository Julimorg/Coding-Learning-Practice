package JavaMasterClassCoursePractice.Section10_ArrayList_LinkList_Enums.LinkList;

import java.util.LinkedList;

public class Practice1_LinkList {
    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "USA");

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);
    }

    public static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Germany");

        // queue methods
        list.offer("Melbourne");
        list.offerFirst("france");
        list.offerLast("United States");
    }


    public static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("france");

    }


}
