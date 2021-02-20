package interviews.CGI.removeDuplicate4mArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Student{
    String name ="";
    String id="";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

public class DuplicateInArrayList_RemoveIt_CountDuplicates {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
         s1.setName("Ravi");
         s1.setId("S123");

        s2.setName("Ravi");
        s2.setId("S123");

        s1.setName("Suraj");
        s1.setId("S124");
       // System.out.println(" Student data: "+toString());
        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.println(" Student data: "+al);
        countFrequenciesList(al);
    }

    public static void countFrequenciesList(ArrayList<Student> list){

        Map<Student,Integer> hm = new HashMap<>();
        for (Student i: list) {
            Integer j = hm.get(i);
            hm.put(i,(j==null ? 1 : j+1));
        }

        for(Map.Entry<Student,Integer> val : hm.entrySet()){
            System.out.println("Student: "+val.getKey() + " Count:  "+val.getValue() + " times");
        }

    }
}
