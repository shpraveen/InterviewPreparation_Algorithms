package Java8.streamMethods;

import java.util.Arrays;
import java.util.List;

public class Stream_stream_parallelStream {

	public static void main(String[] args) {
		
		List<EmployeeTest> empList = Arrays.asList(
							new EmployeeTest(10000,"Victor", "Development"),
							new EmployeeTest(98987,"Crum", "Prod"),
							new EmployeeTest(879651,"Sam", "DBA"),
							new EmployeeTest(4556,"Lupin", "Quality"),
							new EmployeeTest(65489,"Snape", "Development"),
							new EmployeeTest(2155,"Carter", "Prod"),
							new EmployeeTest(4894,"John", "Operation"),
							new EmployeeTest(2116,"Bryan", "Admin"),
							new EmployeeTest(879616,"Angie", "Networking")
		);
		
							// Normal stream() which performs sequentially
							empList.stream()
									.filter(e1 -> e1.getSalary() > 10000)
									.limit(65) // it defines how much object you want
									.forEach(value -> System.out.println("Sequential stream() - Emp Name: "+value.getName()+" Salary: "+value.getSalary()));
							
							// Making Normal stream() as parallel by using parallel() which performs parallelly
							empList.stream()
									.parallel()
									.filter(e1 -> e1.getSalary() > 10000)
									.limit(3)
									.forEach(value -> System.out.println("Parallel stream().parallel() - Emp Name: "+value.getName()+" Salary: "+value.getSalary()));
							
							// Using parallelStream() which performs parallelly
							empList.parallelStream()
									.filter(e1 -> e1.getSalary() > 10000)
									.limit(3)
									.forEach(value -> System.out.println("Parallel parallelStream().parallel() - Emp Name: "+value.getName()+" Salary: "+value.getSalary()));

	}

}

class EmployeeTest{
	
	private int salary;
	private String name;
	private String dept;
	public EmployeeTest(int salary, String name, String dept) {
		super();
		this.salary = salary;
		this.name = name;
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}