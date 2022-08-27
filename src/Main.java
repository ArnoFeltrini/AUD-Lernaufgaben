import linkedLists.ListItem;
import linkedLists.ListOps;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Integer[] ints = {1,2,3,4,3,5,6};
        ListItem<Integer> list = new ListItem<>();
        ListOps.fill(list, ints);
        ListOps.insert(list, 7, Comparator.comparingInt(e -> e));
        ListOps.removeAll(list, 3);
        System.out.println(list);
        //linkedLists.ListOps.overwriteAt(list, 42, 3);
        //System.out.println(list);
        //System.out.println(linkedLists.ListOps.find(list, 4));
    }
}
