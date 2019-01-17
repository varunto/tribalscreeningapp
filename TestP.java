import static org.junit.Assert.*;
import org.junit.Test;
public class TestP {

	
	
	@Test

	public void testtwoStringArray() {

		      PersonTest obj = new PersonTest();

			String[] arr = {"Peter","Jigisha","Varun"};

			String result = obj.PassArray(arr);

			assertEquals("Peter, Jigisha and Varun are amazing",result);

		}
	
}
