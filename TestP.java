import static org.junit.Assert.*;
import org.junit.Test;
public class TestP {

	@Test

	public void testStringArray() {

			PersonTest obj = new PersonTest();

			String[] arr = {"Peter"};

			String result = obj.PassArray(arr);

			assertEquals("Peter is amazing",result);

		}
	
}
