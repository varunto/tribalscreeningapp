import static org.junit.Assert.*;
import org.junit.Test;
public class TestP {

	@Test

	public void testStringArray() {

			PersonTest obj = new PersonTest();

			String[] arr = {"PETER"};

			String result = obj.PassArray(arr);

			assertEquals("PETER IS AMAZING",result);

		}
	
	
	@Test

	public void testtwoStringArray() {

		      PersonTest obj = new PersonTest();

			String[] arr = {"Peter","Varun"};

			String result = obj.PassArray(arr);

			assertEquals("Peter and Varun are amazing",result);

		}
	
	
	
	
	@Test

	public void testMultipleStringArray() {

		      PersonTest obj = new PersonTest();

			String[] arr = {"Peter","Jigisha","Varun","VARUN"};

			String result = obj.PassArray(arr);

			assertEquals("Peter, Jigisha and Varun are amazing. VARUN ALSO!",result);

		}
	
}
