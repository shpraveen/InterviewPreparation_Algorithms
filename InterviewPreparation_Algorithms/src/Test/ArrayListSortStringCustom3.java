package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ArrayListSortStringCustom3{
	
	List<Student_a> listofcountries = null;
	
	public static void main(String[] args) {
		ArrayListSortStringCustom3 s = new ArrayListSortStringCustom3();
		s.listofcountries= new ArrayList<Student_a>();
		s.listofcountries.add(new Student_a(15,"Ravi"));
		s.listofcountries.add(new Student_a(42,"Burma"));
		s.listofcountries.add(new Student_a(28,"Bhutan"));
		s.listofcountries.add(new Student_a(45,"Malaysia"));
		s.listofcountries.add(new Student_a(23,"Japan"));
		
		System.out.println("Before Sorting by Name");
		for(Student_a counter:s.listofcountries) {
			System.out.println(counter);
		}
		
		Collections.sort(s.listofcountries, new SortByName());
		

		System.out.println("\nAfter Sorting by Name: ");
		for(Student_a counter:s.listofcountries) {
			System.out.println(counter);
		}
		
		Collections.sort(s.listofcountries, new SortByRollNo());
		System.out.println("\nAfter Sorting by Roll No: ");
		for(Student_a sorting:s.listofcountries) {
			System.out.println(sorting);
		}
		
		
		
	}

}
 class Student_a{
	 private String name;
	 private int rollNo;
	 
	public Student_a(int rollNo, String name) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student_a other = (Student_a) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	 
 }
 
 class SortByName implements Comparator<Student_a>{

	@Override
	public int compare(Student_a s1, Student_a s2) {
		// TODO Auto-generated method stub
		return s1.getName().compareTo(s2.getName());
	}
 }
class SortByRollNo implements Comparator<Student_a>{

	@Override
	public int compare(Student_a o1, Student_a o2) {
		
		return o1.getRollNo() - o2.getRollNo();
	}
} 
	
