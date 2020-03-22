package manipulations;

public class End 
{
	public String endsLy(String str) 
	{
	  
	    int a=str.length()-2;
	    String s1=str.substring(a);
	    return s1;
	   
	  
	}

	public static void main(String[] args)
	{
		  End ref=new End();
		   System.out.println(ref.endsLy("oddly"));
	

	}
	
	
	
	}


