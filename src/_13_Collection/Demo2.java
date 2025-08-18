package _13_Collection;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add("k");

        System.out.println(list);

        ArrayList list2 = new ArrayList();
        list2.addAll(list);
        list2.add("Rahul");
        System.out.println(list2);
    }
}
