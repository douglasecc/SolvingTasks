package com.deccsoft.solvingtasks.sino;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestSolution {

	@Test
	public void solution() {
		int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
		Solution solution = new Solution();
		assertNotNull(solution.solution(array));
	}
}
