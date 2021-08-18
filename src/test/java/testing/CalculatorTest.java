package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calculator ;
	@BeforeEach
	void init() {
		calculator = new Calculator();
		System.out.println("hello");
	}
	@Test
	void testAdd() {
		int result = calculator.add(2, 3);
		assertEquals(5,result);
	}
	@Test 
	void TestAddFloat() {
		float result = calculator.add(2.1F, 3.1F);
		assertEquals(5.2,result,0.1999999);
	}
	@Test
	void testAddnegativeandnegativenumbers() {
		int result = calculator.add(-2, -3);
		assertEquals(-5,result);
	}
	@Test
	void testAddfloatnegativeandnegativenumbers() {
		float result = calculator.add(2.1F, -3.0F);
		assertEquals(-0.9,result,0.9999);
	}
	@Test
	void testdivide() {
		double result = calculator.divide(4, 2);
		assertEquals(2,result);
	}
	@Test
	void testWhendenominatorIsZero() {
		try {
			calculator.divide(4, 0);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class,e.getClass());
			e.printStackTrace();
		}
	}
	@Test
	void testNumnertorLessThanDenominator() {
		double result = calculator.divide(2, 4);
		assertEquals(0.5,result,0.5);
	}
}
