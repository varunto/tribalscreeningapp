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

			String[] arr = {"Peter","Jigisha"};

			String result = obj.PassArray(arr);

			assertEquals("Peter and Jigisha are amazing",result);

		}
	
}
