package com.awanish.problems.twopointer;

import org.junit.Test;

public class DutchFlagTest {
	
	
	private DutchFlag flag = new DutchFlag();
	
	@Test
	public void testInput1() {
		
		
		int arr[] = {1,0,2,1,0};
		
		flag.rearrage(arr);
		
		for(int i:arr) {
			System.out.println(i);
		}
		
	}
	
	@Test
	public void testInput2() {
		
		
		int arr[] = {2, 2, 0, 1, 2, 0};
		
		flag.rearrage(arr);
		
		for(int i:arr) {
			System.out.println(i);
		}
		
	}

}
