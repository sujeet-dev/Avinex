package Lecture6_Encapsulation;

public class StringDemo {

	public static void main(String[] args) 
	{
	   String name ="sujeet";
	   System.out.println(name);
	   
	  name= name.concat("Singh");
	   System.out.println(name);
	   
	   
	   String s1=new String("Hello");
	   System.out.println(s1);
	   s1=s1.concat("World");
	   System.out.println(s1);
	   
	   
	   StringBuffer bf=new StringBuffer("Himanshu");
	   System.out.println(bf);
	   bf.append("Gangle");
	   System.out.println(bf);
	   
	   System.out.println(bf.length());
	   System.out.println(bf.reverse());

	}

}
