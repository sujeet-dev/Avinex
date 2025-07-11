package Calender_Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calender_Test1 {

	public static void main(String[] args) throws Exception
	{
		 String targetDate= "40-Aug-2024";
		  SimpleDateFormat targetDateFormate=new SimpleDateFormat("dd-MMM-yyyy");
		  Date formattedTargetdate;
		try {
			targetDateFormate.setLenient(false);
			  formattedTargetdate = targetDateFormate.parse(targetDate);
			  System.out.println(formattedTargetdate);
		} catch (ParseException e) {
			throw new Exception("Invalid Date Formate, Please provide the valid input");
		}

	}

}
