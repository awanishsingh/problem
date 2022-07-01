package com.awanish.problems.sorting;

import com.awanish.problems.twopointer.HoarsArrayPartition;

public class QuickSortUsingHoarsPartition {
	
	
	public void sort(int arr[],int l , int h) {
		
		if(l<h) {
			HoarsArrayPartition hPartition = new HoarsArrayPartition();
			
			int k = hPartition.partition(arr, l , h);
	         		
			sort(arr,l ,k);
			sort(arr, k+1 , h);
		}
		
		
	}

}
