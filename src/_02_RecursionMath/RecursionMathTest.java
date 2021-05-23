package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        
        // Add more JUnit tests like the one above to test your method
        assertEquals(30, RecursionMath.recursiveMultiplication(5, 6));
		assertEquals(16, RecursionMath.recursiveMultiplication(2, 8));
		assertEquals(50, RecursionMath.recursiveMultiplication(10, 5));
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(10, RecursionMath.recursiveDivision(20, 2));
        
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(16, RecursionMath.recursivePower(2, 4));
    }
}
