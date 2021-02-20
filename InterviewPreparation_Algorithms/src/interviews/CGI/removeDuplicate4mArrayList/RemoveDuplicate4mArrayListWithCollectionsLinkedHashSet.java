package interviews.CGI.removeDuplicate4mArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class RemoveDuplicate4mArrayListWithCollectionsLinkedHashSet {

    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("a");
        al.add("java");
        al.add("2");
        al.add("cabba");
        al.add("abba");
        al.add("a");
        al.add("c");
        al.add("jabba");
        al.add("jabba");
        al.add("a");
        al.add("d");
        al.add("d");

        System.out.println("ArrayList with duplicates: "+al);

        Set<Object> s = new LinkedHashSet<>();

        s.addAll(al);

        al.clear();
        al.addAll(s);
        s.clear();
        System.out.println("ArrayList without duplicates: "+al);
    }

}
