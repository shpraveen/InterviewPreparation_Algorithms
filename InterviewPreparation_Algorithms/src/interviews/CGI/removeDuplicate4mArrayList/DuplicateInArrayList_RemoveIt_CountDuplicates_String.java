package interviews.CGI.removeDuplicate4mArrayList;

import java.util.*;

public class DuplicateInArrayList_RemoveIt_CountDuplicates_String {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Student1");
        al.add("Student1");
        al.add("Student1");
        al.add("Student2");
        al.add("Student3");
        al.add("Student4");
        al.add("Student5");
        al.add("Student5");
        System.out.println(" Student data: "+al);
        countFrequenciesList_HashMap(al);
        countFrequenciesList_HashSet(al);
        countFrequenciesList_TreeMap(al);
    }

    public static void countFrequenciesList_HashMap(ArrayList<String> list){

        Map<String,Integer> hm = new HashMap<>();
        for (String i: list) {
            Integer j = hm.get(i);
            hm.put(i,(j==null ? 1 : j+1));
        }

        for(Map.Entry<String,Integer> val : hm.entrySet()){
            System.out.println("HashMap Student: "+val.getKey() + " Count:  "+val.getValue() + " times");
        }

    }

    public static void countFrequenciesList_HashSet(ArrayList<String> list){

        Set<String> set = new HashSet<>(list);
        for (String i: set) {
            System.out.println("HashSet Student: "+i + " Count:  "+Collections.frequency(list,i)+ " times");
        }
    }
    public static void countFrequenciesList_TreeMap(ArrayList<String> list){

        Map<String,Integer> treemap = new TreeMap<>();
        for (String i: list) {
            Integer j = treemap.get(i);
            treemap.put(i,(j==null?1:j+1));
        }

        for(Map.Entry m : treemap.entrySet()){
            System.out.println("TreeMap Student: "+m.getKey() + " Count:  "+m.getValue()+ " times");
        }
    }

}
