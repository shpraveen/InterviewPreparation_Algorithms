package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ArrayListSortStringCustom2{
	
	List<Student> listofcountries = null;
	
	public static void main(String[] args) {
		ArrayListSortStringCustom2 s = new ArrayListSortStringCustom2();
		s.listofcountries= new ArrayList<Student>();
		s.listofcountries.add(new Student(15,"Ravi"));
		s.listofcountries.add(new Student(42,"Burma"));
		s.listofcountries.add(new Student(28,"Bhutan"));
		s.listofcountries.add(new Student(45,"Malaysia"));
		s.listofcountries.add(new Student(23,"Japan"));
		
		System.out.println("Before Sorting");
		for(Student counter:s.listofcountries) {
			System.out.println(counter);
		}
		
		Collections.sort(s.listofcountries);
		

		System.out.println("\nAfter Sorting");
		for(Student counter:s.listofcountries) {
			System.out.println(counter);
		}
		
	}

}
 class Student implements Comparable<Student>{
	 private String name;
	 private int rollNo;
	 
	public Student(int rollNo, String name) {
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
		Student other = (Student) obj;
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
	public int compareTo(Student rollNo) {
		
		int compareRollNo=((Student)rollNo).getRollNo();
		return this.getRollNo()-compareRollNo;
	}
	 
	 
 }