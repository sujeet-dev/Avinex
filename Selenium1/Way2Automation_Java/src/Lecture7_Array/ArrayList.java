package Lecture7_Array;

public class ArrayList {

	public static void main(String[] args) 
	{
	  java.util.ArrayList<Integer> list=new java.util.ArrayList<>();
	  list.add(20);
	  list.add(21);
	  list.add(22);
	  list.add(20);
	  
	  System.out.println(list);
	  
	  list.add(1, 10);
	  System.out.println(list);
	  
	  list.remove(1);
	  System.out.println(list);
	  
	  java.util.ArrayList<Integer> abc=new java.util.ArrayList<>();
	  abc.add(25);
	  abc.add(56);
	  abc.add(85);
	  
	  System.out.println(abc);
	  
	  list.addAll(abc);
	  System.out.println(list);
	  
	  System.out.println(list.isEmpty());
	  

	}

}
