package calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

		private App calculator;
	    
	    @Before
	    public void setUp() {
	        calculator = new App();
	    }

	@Test
	public void testroot1() {
		double a = 4.0;
		double expectedResult = 2;
		double result = calculator.root(a);
		Assert.assertEquals(expectedResult, result, 0);
	}
	@Test
	public void testroot2() {
		double a = -4.0;
		double expectedResult = Double.NaN;
		double result = calculator.root(a);
		Assert.assertEquals(expectedResult, result, 0);
	}

	@Test
	public void testfac1(){
	    double a = 5.0;
	    double expectedResult = 120.0;
	    double result = calculator.fac(a);
	    Assert.assertEquals(expectedResult, result,0);


	}
	@Test
	public void testfac2(){
		double a = 0.0;
		double expectedResult = 1.0;
		double result = calculator.fac(a);
		Assert.assertEquals(expectedResult, result,0);


	}
	@Test
	public void testfac3(){
		double a = -5.0;
		double expectedResult = Double.NaN;
		double result = calculator.fac(a);
		Assert.assertEquals(expectedResult, result,0);


	}

	@Test
	public void testlog1(){
		double a = 10.0;
		double expectedResult = 2.302585092994046;
		double result = calculator.log(a);
		Assert.assertEquals(expectedResult, result,0);


	}
	@Test
	public void testlog2(){
		double a = 1.0;
		double expectedResult = 0.0;
		double result = calculator.log(a);
		Assert.assertEquals(expectedResult, result,0);


	}
	@Test
	public void testlog3(){
		double a = 0.0;
		double expectedResult = Double.NEGATIVE_INFINITY;
		double result = calculator.log(a);
		Assert.assertEquals(expectedResult, result,0);


	}
	@Test
	public void testpow1(){
		double a = 0.0;
		double b = 50.0;
		double expectedResult = 0.0;
		double result = calculator.pow(a,b);
		Assert.assertEquals(expectedResult, result,0);


	}
	@Test
	public void testpow2(){
		double a = 2.0;
		double b = 5.0;
		double expectedResult = 32.0;
		double result = calculator.pow(a,b);
		Assert.assertEquals(expectedResult, result,0);


	}
	@Test
	public void testpow3(){
		double a = 5.0;
		double b = -5.0;
		double expectedResult = 0.00032;
		double result = calculator.pow(a,b);
		Assert.assertEquals(expectedResult, result,0);


	}


//		@Test
//	    public void testAdd() {
//	        double a = 15.0;
//	        double b = 20.0;
//	        double expectedResult = 35.0;
//	        double result = calculator.Add(a, b);
//	        Assert.assertEquals(expectedResult, result, 0);
//	    }
//
//		@Test
//		public void testSubtract() {
//			double a = 34;
//	        double b = 12;
//	        double expectedResult = 22;
//	        double result = calculator.Subtract(a, b);
//	        Assert.assertEquals(expectedResult, result, 0);
//		}
//
//		@Test
//		public void testMultiply() {
//			double a = 18.5;
//	        double b = 12.6;
//	        double expectedResult = 233.1;
//	        double result = calculator.Multiply(a, b);
//	        Assert.assertEquals(expectedResult, result, 0);
//		}
//
//		@Test
//		public void testDivide() {
//			double a = 60.0;
//	        double b = 12.0;
//	        double expectedResult = 5.0;
//	        double result = calculator.Divide(a, b);
//	        Assert.assertEquals(expectedResult, result, 0.0001);
//		}
//
//		@Test(expected = IllegalArgumentException.class)
//	    public void testDivideByZero() {
//	        int a = 25;
//	        int b = 0;
//	        calculator.Divide(a, b);
//	    }
}
