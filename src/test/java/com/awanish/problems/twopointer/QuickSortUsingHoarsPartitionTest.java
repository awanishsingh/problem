package com.awanish.problems.twopointer;

import org.junit.Test;

import com.awanish.problems.sorting.QuickSortUsingHoarsPartition;

public class QuickSortUsingHoarsPartitionTest {
	
	
	private QuickSortUsingHoarsPartition qSort = new QuickSortUsingHoarsPartition();
	
	@Test
	public void testInput1() {
		
		
		int arr[] = {5,3,8,5,2,7,1,10};
		
		qSort.sort(arr, 0, 7);
		
		for(int i:arr) {
			System.out.println(i);
		}
		
	}
	
	

}
