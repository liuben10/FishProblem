import static org.junit.Assert.*;

import org.junit.Test;


public class MainTest {

	@Test
	public void testsimple() {
		int[] A = {4, 3, 2, 1, 5};
		int[] B = {0, 1, 0, 0, 0};
		assertEquals(2, FishProblemSolution.solution(A, B));
	}
	
	@Test
	public void testOneFish() {
		int[] A = {4};
		int[] B = {1};
		assertEquals(1, FishProblemSolution.solution(A, B));
	}
	
	@Test
	public void testTwoFish() {
		int[] A = {2, 3};
		int[] B = {0, 1};
		assertEquals(2, FishProblemSolution.solution(A, B));
	}
	
	@Test
	public void testExtremeTwoFish() {
		int[] A = {Integer.MIN_VALUE, Integer.MIN_VALUE+1};
		int[] B = {1, 0};
		assertEquals(1, FishProblemSolution.solution(A, B));
	}
	
	@Test
	public void testExtremeMaxTwoFish() {
		int[] A = {Integer.MAX_VALUE-1, Integer.MAX_VALUE};
		int[] B = {1, 0};
		assertEquals(1, FishProblemSolution.solution(A, B));
	}
	
	@Test
	public void testeatery() {
		int[] A = {4, 3, 2, 1, 5};
		int[] B = {1, 1, 0, 0, 0};
		assertEquals(1, FishProblemSolution.solution(A,  B));
	}
	
	@Test
	public void testEatenOverTwoSteps() {
		int[] A = {15, 12, 13, 16, 17, 21, 44, 23, 33};
		int[] B = {0, 0, 0, 1, 0, 1, 1, 1, 0};
		assertEquals(6, FishProblemSolution.solution(A, B));
	}

	@Test
	public void testLongEat() {
		int[] A = {4, 2, 5, 3, 2, 1, 6, 10, 8, 9, 3};
		int[] B = {1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0};
		System.out.println(FishProblemSolution.solution(A,  B));
	}
}
