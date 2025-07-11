package Lecture6;

import java.sql.Date;

public class Time_Stamp {

	public static void main(String[] args) 
	{
		java.util.Date d=new java.util.Date();
		System.out.println(d.toString().replace(":", "_").replace(" ", "_"));

	}

}
