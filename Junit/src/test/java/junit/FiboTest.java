package junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FiboTest {

	@BeforeClass
	public static void beforeAll(){
		System.out.println("avant tous");
	}
	
	@AfterClass
	public static void afterAll(){
		System.out.println("aprés tous");
	}
	
	@Before
	public void beforeEach(){
		System.out.println("avant");
	}
	
	@After
	public void afterEach(){
		System.out.println("aprés");
	}

	@Test
	public void fiboN() {
		assertEquals("0=>0",0,Fibo.fib(0));
		assertEquals("1=>1",1,Fibo.fib(1));
		assertEquals("2=>1",1,Fibo.fib(2));
		assertEquals("3=>2",2,Fibo.fib(3));
		assertEquals("4=>3",3,Fibo.fib(4));
		assertEquals("14=>377",377,Fibo.fib(14));
		assertEquals("24=>46368",46368,Fibo.fib(24));
		assertEquals("46=>1836311903",1836311903,Fibo.fib(46));
	}
	
	//nb négatif ?
	@Test(expected=IllegalArgumentException.class)
	public void fiboNegatif(){
		Fibo.fib(-1);
	}
	//fib(n) > Interger.MAX_VALUE
	@Test(expected=IllegalArgumentException.class)
	public void fiboTooBigN(){
		Fibo.fib(47);
	}
	// Fibo.fib((Integer)null);
}


