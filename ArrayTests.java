import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input1 = { 2,1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,2 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedMoreElements() {
    int[] input1 = {1, 2, 3, 4, 5 };
    assertArrayEquals(new int[]{5, 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowestNoElements(){
    double [] input1 = {};
    // Deprecated. Use assertEquals(double expected, double actual, double epsilon) instead
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.000001);
  }

  @Test
  public void testAverageWithoutLowestOneElement(){
    double [] input1 = {2};
    // Deprecated. Use assertEquals(double expected, double actual, double epsilon) instead
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.000001);
  }

  @Test
  public void testAverageWithoutLowestMultipleElement(){
    double [] input1 = {1,2,3,4,5};
    double expectedValue = (5+4+3+2)/4.0;
    // Deprecated. Use assertEquals(double expected, double actual, double epsilon) instead
    assertEquals(expectedValue, ArrayExamples.averageWithoutLowest(input1), 0.000001);
  }
}
