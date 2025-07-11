package Lecture2;

public class Students 
{
	int StudentID;
	String StudentName;
	int Age;
	static String SchoolName;
	String BloodGroup;
	
	
	public void Attendlecture()
	{
		System.out.println("Students are attending the lecture");
	}
	
	public void DoExercise() {
		System.out.println("Weeken Exercise");
	}
	public void MarkAttandance() {
		System.out.println("Students are marking the lecture");
	}
	public void DoHomework() {
		System.out.println("Students need to do homework daily");
	}
	
	public static void ShowSchoolName() 
	{
		System.out.println("Print the School Name");
		
		
	}

}
