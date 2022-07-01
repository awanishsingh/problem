package com.awanish.problems.twopointer;


/*
 * Hoars partition technique - Choose first element of the array as Pivot .
 * 
 * function retunr the index J such that all the element i..j < pivot and j+1....h > pivot.
 * 
 */
public class HoarsArrayPartition {
	
	
	
	
	
	public int partition(int arr[] , int low , int high) {
		int pivot = arr[low];
		int i= low -1 ;
		int j = high+1 ;
		
		while(true) {
			
			do {
				
				i++ ;
				
			}while (arr[i]<pivot);
			
			do {
				
				j--;
			}while(arr[j]>pivot);
			
			if(i<j) {
				swap(arr ,i ,j);
			}
			if(i>=j) {
				return j;
			}
			
		}
		
	}

	private void swap(int[] arr, int i, int j) {
	         int temp = arr[i];
	         arr[i]=arr[j];
	         arr[j]=temp;
		
	}

}
