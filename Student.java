import java.util.*;

class StudentInfo
{
	int rno;
	char div;
	String course;
	String name;
	String clgname;
	
	StudentInfo(int rno,char div,String name,String course,String clgname)
	{
		this.rno=rno;
		this.div=div;
		this.name=name;
		this.course=course;
		this.clgname=clgname;
	}

	public void display()
	{
			System.out.println("Roll no is: " +rno);
			System.out.println("Division is: " +div);
			System.out.println("name is: " +name);
			System.out.println("course name is: " +course);
			System.out.println("College name is: " +clgname);
			System.out.println();
	}
}


class Student
{
	public static void main(String args[])
	{	
		StudentInfo[] obj = new StudentInfo[5];
		
		obj[0] = new StudentInfo(1,'A',"RAM","CS","RCPIT");
		obj[1] = new StudentInfo(2,'A',"SHYAM","MECH","PCCOE");
		obj[2] = new StudentInfo(3,'B',"BHARAT","CIVIL","COEP");
		obj[3] = new StudentInfo(4,'C',"KRISHNA","E&TC","VITA");
		obj[4] = new StudentInfo(5,'A',"VASUDEV","ELECT","VIT");
		
		System.out.println("--------------Student Detail-----------------");
		obj[0].display();
		
		System.out.println("--------------Student Detail-----------------");
		obj[1].display();
		
		System.out.println("--------------Student Detail-----------------");
		obj[2].display();
		
		System.out.println("--------------Student Detail-----------------");
		obj[3].display();
		
		System.out.println("--------------Student Detail-----------------");
		obj[4].display();
	}
}