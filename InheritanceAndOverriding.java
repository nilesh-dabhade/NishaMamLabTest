
public class InheritanceAndOverriding {
	
	class Student 
	 { 
		  private int rollno; 
	      private String name; 
	      private int age ;
	      
	      Student(String n,int Age,int rno) 
	      { 
	    	rollno = rno;
	        name = n; 
	        age=Age; 
	      } 
	      
	      public String toString() 
	      { 
	         return("Roll No :"+ rno+"\n" +"Name : "+ name+"\n"+  "Age  : "+age+"\n"); 
	      } 
	 } 
	   class Marks extends Student 
	 { 
	    
	     
	 } 

	
	 class OverridingMethods 
	 { 
	     public static void main(String[] args) 
	    { 
	        Student s=new Student(1,"Nilesh",23); 
	        System.out.println(s.toString()); 
	    } 
	 } 
}
