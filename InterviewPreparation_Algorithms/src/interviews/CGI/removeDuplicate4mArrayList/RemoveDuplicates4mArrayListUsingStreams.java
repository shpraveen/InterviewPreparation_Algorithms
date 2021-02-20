package interviews.CGI.removeDuplicate4mArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates4mArrayListUsingStreams {

    public static void main(String[] args) {
        List<Object> al = new ArrayList<>(
                Arrays.asList(1,2,3,3,"java","java1",45,45)
        );
        System.out.println("ArrayList with Duplicate: "+al);
        //Map<Integer,String> m = new HashMap<>();

        List<Object> newList = al.stream()
                                    .distinct()
                                    .collect(Collectors.toList());
        System.out.println("ArrayList without Duplicate: "+newList);

    }
}
