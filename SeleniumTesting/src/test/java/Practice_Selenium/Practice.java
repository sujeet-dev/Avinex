package Practice_Selenium;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String val="Sujeet";

//		String rev="";

//		for(int i=0; i<val.length(); i++)
//		{
//		  rev=val.charAt(i) + rev;
//		}
//		System.out.println(rev);

//		StringBuffer bf=new StringBuffer(val);
//		System.out.println(bf.reverse());
		
		
		
		
        String reversed = new StringBuilder(val)
        		.reverse().toString();
        
        System.out.println(reversed);
        
	}

}
