
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
			 
			 for(int i=0; i < a.length-1; i++)
		        {
				 
				 char[] charArray = a[i].toCharArray();
			        
			        for(int j=0; j < charArray.length; j++)
			        {
			            
			            if( !Character.isUpperCase( charArray[i] ))
			            {
					      
			            	 if (i == 0) 
			          		  {
			          	          temp = temp + a[i];
			          		  }
			   				 else
			   				 {
			   					 temp = temp +", " + a[i];
			   				 }
			            }
			            
			            else
			            {
			              
			            	temp1 = temp1 +  charArray[i];
			            	
			            
			            }
			           

			        }
				
         
		 
			    }
			 
			    temp = temp +" and "+ a[a.length-1] + " are amazing";

				return temp + ". " + temp1 + " ALSO!.";

			}
		 
		 
		return "You are amazing";
	}
}