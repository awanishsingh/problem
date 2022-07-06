package com.awanish.problems.twopointer;

public class RemoveDuplicate {
	
	
	
	public int [] remove(int arr[] ) {
		int ptNonDup=1 ;
		for(int i=1 ;i<arr.length ;i++) {
			
			if(arr[i]!=arr[ptNonDup-1]) {
				arr[ptNonDup]=arr[i];
				ptNonDup++;
			}
			
		}
		
		 return arr ;
		
	}
	public int  removeAndReturnSize(int arr[] ) {
		int ptNonDup=1 ;
		for(int i=1 ;i<arr.length ;i++) {
			
			if(arr[i]!=arr[ptNonDup-1]) {
				arr[ptNonDup]=arr[i];
				ptNonDup++;
			}
			
		}
		
		 return ptNonDup  ;
		
	}

}
