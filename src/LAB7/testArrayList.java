package LAB7;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class testArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(10);

        arr.add(1);
        arr.add(2);
        arr.add(1, 3);
        arr.add(1);

        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addFirst(11);
        list.addFirst(12);

        arr.addAll(list);
        System.out.println(arr);

        System.out.println(arr.get(1));
        System.out.println(arr.indexOf(1));
        System.out.println(arr.lastIndexOf(1));

        arr.remove(0);
        System.out.println(arr);

        arr.set(3, 99);
        System.out.println(arr);

        System.out.println(arr.subList(0, 3));

    }
}
