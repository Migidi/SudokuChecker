import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
String f = "4173-69825632158947958724316825437169791586432346912758289643571573291684164875293";
String d = "417a69825632158947958724316825437169791586432346912758289643571573291684164875293";
String h = "617369825432158947958724316825437169791586432346912758289643571573291684164875293";
String j = "417368925632159847958724316825437169791586432346912758298643571573291684164875293";
SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
		
		@Test
		public void testNegativeNumber() {
			int a = v.verify(f);
			assertEquals("negative numbers", a, -1);
			
		}
			@Test
			public void testNotNumber() {
				int a = v.verify(d);
				assertEquals("wrong characteres", a, 1);
			
	}
			@Test
			public void testFaultyRow() {
				int a = v.verify(h);
				assertEquals("wrong characteres", a, -3);
			
	}
			@Test
			public void testFaultyColumn() {
				int a = v.verify(j);
				assertEquals("wrong characteres", a, -4);
			
	}
	
	
	
}

