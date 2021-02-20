package Java8.streamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_flatMap2 {
	
	public static void main(String[] args) {
		
		List<Student123> studentList1=new ArrayList<Student123>();
		studentList1.add(new Student123("Smith",101,'A'));
		studentList1.add(new Student123("John",102,'B'));
		studentList1.add(new Student123("Kenedy",103,'C'));
		
		List<Student123> studentList2=new ArrayList<Student123>();
		studentList1.add(new Student123("Scott",104,'A'));
		studentList1.add(new Student123("Mary",105,'B'));
		studentList1.add(new Student123("Kitty",106,'C'));
		
		List<List<Student123>>studentList=Arrays.asList(studentList1,studentList2);
		
		//before java8
		/*for(List<Student> s:studentList)
		{
			for(Student stu:s)
			{
				System.out.println(stu.sname);
			}
		}*/
		
		//using streams/ flatMap()
		List<String> namesList=studentList.stream().
				flatMap(stulist->stulist.stream())
				.map(s->s.sname)
				.collect(Collectors.toList()); 

		System.out.println(namesList);
	}

}

class Student123
{
	String sname;
	int sid;
	char grade;
	
	Student123(String sname,int sid,char grade)
	{
		this.sname=sname;
		this.sid=sid;
		this.grade=grade;
	}
	
}