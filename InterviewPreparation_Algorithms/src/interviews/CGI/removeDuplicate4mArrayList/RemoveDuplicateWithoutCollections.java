package interviews.CGI.removeDuplicate4mArrayList;

import java.util.ArrayList;

public class RemoveDuplicateWithoutCollections {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("12");
        al.add("java");
        al.add("java");
        al.add("a");
        al.add("d");
        al.add("d");
        al.add("12");
        al.add("13");
        al.add("c");
        al.add("e");
        al.add("e");

        System.out.println("ArrayList with duplicates: "+al);

        for (int i = 0; i < al.size(); i++) {
            for (int j = i+1; j < al.size(); j++) {
                    if(al.get(i).equals(al.get(j))){
                        al.remove(j);
                        j--;
                    }
            }

        }

        System.out.println("ArrayList after remove: "+al);
    }
}
