import java.util.*;

public class ArrayListEmployee {

	public static void main(String[] args) {
	
		Employee s1 = new Employee(101,"Nilesh",23);
		Employee s2 = new Employee(102,"Neels",24);
		Employee s3 = new Employee(103,"Dabhade",23);
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		System.out.println(a1);
		
	}	
}

class Employee
{
	public int eid;
	public String name;
	public int age;
	
	Employee()
	{
		
	}
	
	Employee(int eid, String name,int age)
	{
		this.eid = eid;
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		 return "[age=" + age + ", name=" + name + ", Employee ID=" + eid + "]";
		
	}
}