package Lecture2;

public class App 
{
	public static void main(String[] args) 
	{
		Students s1=new Students();
		s1.StudentName="Sujeet";
		s1.Age=29;
		s1.SchoolName="W2A";
		
	s1.Attendlecture();
	
	System.out.println(s1.StudentName);
	System.out.println(s1.Age);
	System.out.println(s1.SchoolName);
	
	Students s2=new Students();
	s2.StudentName="Hemant";
	s2.Age=26;
	s2.SchoolName="W2A";
	
	System.out.println(s2.StudentName);
	System.out.println(s2.Age);
	System.out.println(Students.SchoolName);
	
	
	System.out.println("-------------------------------------");
	
	System.out.println(Students.SchoolName);
		
	}

}
