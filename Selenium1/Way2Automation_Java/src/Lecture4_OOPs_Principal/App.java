package Lecture4_OOPs_Principal;

public class App {

	public static void main(String[] args) 
	{
	   Students s=new Students();
	   s.giveExams();
	   s.doExercise();
	   
	   Teachers t=new Teachers();
	   t.provideLectures();
	   t.doExercise();
	   
	   t.sum(2, 5);
	   t.sum(2, 3, 4);

	}

}
