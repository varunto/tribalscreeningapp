import static org.junit.Assert.*;
import org.junit.Test;
public class TestP {

	@Test

	public void testStringArray() {

			PersonTest obj = new PersonTest();

			String[] arr = {};

			String result = obj.PassArray(arr);

			assertEquals("You are amazing",result);

		}
	
}
