
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
		 
		 else if(a.length == 2) 
		 {

				return a[0] + " and " + a[1] + " are amazing";

			}
		 
		 else if(a.length > 2) 
		 {
			 String temp = "";
			 String temp1 = "";	
			 
		        for(int i=0; i < a.length; i++)
		        {
		        	

					 if (i == 0) 
	          		  {
	          	          temp = temp + a[i];
	          	          
	          		  }
					 
					 else if (i == a.length-1)
					 {
						 temp = temp + " and " + a[i];
						  
					 }
	   				 else 
	   				 {
	   					 
	   				temp = temp +", " + a[i];
	   						 
	   				 }
		        }
			
	
			    temp = temp + " are amazing";

				return temp;

			}
		 
		 
		return "You are amazing";
	}
}
