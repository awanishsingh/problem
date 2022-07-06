package com.awanish.problems.twopointer;

import org.junit.Test;

public class RemoveDuplicateTest {
	
	RemoveDuplicate removeDuplicate = new RemoveDuplicate();

	@Test
	public void testInput1() {
		int [] input1 = {2, 3, 3, 3, 6, 9, 9};
		
		int size = removeDuplicate.removeAndReturnSize(input1);
		for(int i=0; i<size;i++) {
			System.out.print(input1[i]+",");
		}
		
		
		
		
	}
}
