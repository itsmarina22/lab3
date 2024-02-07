import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

import java.util.List;

public class ListTests {
  @Test 
	public void testRfilter() {
    List <String> input = Arrays.asList3( "yippee", "", "wow" );
    ListExamples.filter(input, "");
    assertArrayEquals(new int[]{ 3 }, input);
	}
  
}
