package com.awanish.problems.twopointer;

import org.junit.Test;

public class HoarsArrayPartitionTest {
	
	
	private HoarsArrayPartition hoars = new HoarsArrayPartition();
	
	@Test
	public void testInput1() {
		
		
		int arr[] = {5,3,8,5,2,7,1,10};
		
		int k = hoars.partition(arr,0,7);
		
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("index of the partition" + k);
		
	}
	
	

}
