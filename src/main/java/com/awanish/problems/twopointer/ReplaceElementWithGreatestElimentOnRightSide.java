package com.awanish.problems.twopointer;

public class ReplaceElementWithGreatestElimentOnRightSide {
	
	
	
	public int[] replace(int [] arr) {
		
		int len = arr.length ;
		
		int currentMax= -1 ;
		
		for (int i=len-1 ;i>=0 ;i--) {
			int temp=arr[i];
			arr[i]=currentMax;
			currentMax = Math.max(currentMax, temp);
			
		}
		
		return arr ;
	}

}
