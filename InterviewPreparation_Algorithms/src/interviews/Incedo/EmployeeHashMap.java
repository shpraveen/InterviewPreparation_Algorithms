package interviews.Incedo;

import java.util.HashMap;
import java.util.Map;


public class EmployeeHashMap {


	public static void main(String[] args) {
		
		Emp e1 = new Emp(1,"Sam","IT");
		Emp e2 = new Emp(2,"Daniel","Ops");
		Emp e3 = new Emp(3,"Victor","Trade");
		
		System.out.println("e1: "+e1+" e2: "+e2+" e3: "+e3);
		
		HashMap<Emp, Integer> hm = new HashMap<>();
		
		hm.put(e1, 1);
//		hm.put(e2, 2);
//		hm.put(e3, 3);
		hm.put(e2, 2);
		hm.put(e3, 3);
		hm.put(e3, 4);
		System.out.println(hm);
		
		//{interviews.Incedo.Emp@1=1, interviews.Incedo.Emp@1=2, interviews.Incedo.Emp@1=3}
		//{interviews.Incedo.Emp@bc516067=3, interviews.Incedo.Emp@2422a8=1, interviews.Incedo.Emp@7e22586e=2}
		
	}
	

}


class Emp{
	
	private int emp_id;
	private String name;
	private String Dept;
	public Emp(int emp_id, String name, String dept) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		Dept = dept;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((Dept == null) ? 0 : Dept.hashCode());
//		System.out.println("1: "+result);
//		result = prime * result + emp_id;
//		System.out.println("2: "+result);
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		System.out.println("3: "+result);
//		return result;
//		
//		//return 1;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Emp other = (Emp) obj;
//		if (Dept == null) {
//			if (other.Dept != null)
//				return false;
//		} else if (!Dept.equals(other.Dept))
//			return false;
//		if (emp_id != other.emp_id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	
}