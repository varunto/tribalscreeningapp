
public class PersonTest {

	public String PassArray(String[] a)
	{
		
		 if(a.length == 1) 
		 {
			 
			 char[] charArray = a[0].toCharArray();
		        
		        for(int i=0; i < charArray.length; i++)
		        {
		            
		            if( !Character.isUpperCase( charArray[i] ))
		            {
				        return a[0] + " is amazing";

		            }
		           

			    }
		        return a[0] + " IS AMAZING";
		}
		 
		 
		return "You are amazing";
	}
}