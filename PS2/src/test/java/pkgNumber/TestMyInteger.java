package pkgNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

	@BeforeClass
	public void setUpBeforeClass() throws Exception{
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}
	@Before
	public void setUp() throws Exception {
	}
	@After
	public void tearDown() throws Exception {
	}
	 @Test
	 public static void TestValue1() {
		 MyInteger myInt = new MyInteger(4);
		 
		 boolean bExpectedEven = true;
		 boolean bExpectedOdd = false;
		 boolean bExpectedPrime = false; 
		 boolean bExpectedEquals = true;
		 
assertEquals(bExpectedEven,myInt.isEven());
assertEquals(bExpectedOdd,myInt.isOdd());
assertEquals(bExpectedPrime,myInt.isPrime());
assertEquals(bExpectedEven,myInt.isEven(4));
assertEquals(bExpectedOdd,myInt.isOdd(4));
assertEquals(bExpectedPrime,myInt.isPrime(4));
assertEquals(bExpectedEquals,myInt.equals(4));
assertEquals(bExpectedEquals,myInt.equals(myInt));
	 }
	 @Test
	 public void TestValue3() {
		 MyInteger myInt = newMyInteger(9);
		 
		 boolean bExpectedEven = false;
		 boolean bExpectedOdd = true;
		 boolean bExpectedPrime = false;
		 boolean bExpectedEquals = true;
		 
assertEquals(bExpectedEven,myInt.isEven());
assertEquals(bExpectedOdd,myInt.isOdd());
assertEquals(bExpectedPrime,myInt.isPrime());
assertEquals(bExpectedEven,myInt.isEven(9));
assertEquals(bExpectedOdd,myInt.isOdd(9));
assertEquals(bExpectedPrime,myInt.isPrime(9));
assertEquals(bExpectedEquals,myInt.equals(9));
assertEquals(bExpectedEquals,myInt.equals(myInt));
	 }
	 private MyInteger newMyInteger(int i) {
		return null;
	}
	@Test
	 public void TestValue4() {
		 MyInteger myInt = newMyInteger(17);
		 
		 boolean bExpectedEven = false;
		 boolean bExpectedOdd = true;
		 boolean bExpectedPrime = true;
		 boolean bExpectedEquals = true;
		 
assertEquals(bExpectedEven,myInt.isEven());
assertEquals(bExpectedOdd,myInt.isOdd());
assertEquals(bExpectedPrime,myInt.isPrime());
assertEquals(bExpectedEven,myInt.isEven(17));
assertEquals(bExpectedOdd,myInt.isOdd(17));
assertEquals(bExpectedPrime,myInt.isPrime(17));
assertEquals(bExpectedEquals,myInt.equals(17));
assertEquals(bExpectedEquals,myInt.equals(myInt));
	 }
	 @Test
	 public void TestValue5() {
		 MyInteger myInt = newMyInteger(49);
		 
		 boolean bExpectedEven = false;
		 boolean bExpectedOdd = true;
		 boolean bExpectedPrime = false;
		 boolean bExpectedEquals = true;
		 
assertEquals(bExpectedEven,myInt.isEven());
assertEquals(bExpectedOdd,myInt.isOdd());
assertEquals(bExpectedPrime,myInt.isPrime());
assertEquals(bExpectedEven,myInt.isEven(49));
assertEquals(bExpectedOdd,myInt.isOdd(49));
assertEquals(bExpectedPrime,myInt.isPrime(49));
assertEquals(bExpectedEquals,myInt.equals(49));
assertEquals(bExpectedEquals,myInt.equals(myInt));
	 }
	 @Test
	 public void TestValue6() {
		 MyInteger myInt = newMyInteger(50);
		 
		 boolean bExpectedEven = true;
		 boolean bExpectedOdd = false;
		 boolean bExpectedPrime = false;
		 boolean bExpectedEquals = true;
		 
assertEquals(bExpectedEven,myInt.isEven());
assertEquals(bExpectedOdd,myInt.isOdd());
assertEquals(bExpectedPrime,myInt.isPrime());
assertEquals(bExpectedEven,myInt.isEven(50));
assertEquals(bExpectedOdd,myInt.isOdd(50));
assertEquals(bExpectedPrime,myInt.isPrime(50));
assertEquals(bExpectedEquals,myInt.equals(50));
assertEquals(bExpectedEquals,myInt.equals(myInt));
	 }
}


