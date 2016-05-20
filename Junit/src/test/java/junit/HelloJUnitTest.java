package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Junit.HelloJUnit;

public class HelloJUnitTest {

	@Test
	public void helloShouldReturnHello(){
		//Given
		HelloJUnit helloJUnit = new HelloJUnit();
		//When
		String result = helloJUnit.hello();
		//Then
		// je dois garantir que "hello".equals(result):
		assertEquals("helloJUnit.hello() should equals hello", "hello",result);
		assertTrue("helloJUnit.hello() should equals hello", "hello".equals(result));
		//fail("not implemented yet");
	}
}
