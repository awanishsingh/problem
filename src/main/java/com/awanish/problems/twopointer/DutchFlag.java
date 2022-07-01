package com.awanish.problems.twopointer;

/*
 * Input: [1, 0, 2, 1, 0]
   Output: [0, 0, 1, 1, 2]
 */
public class DutchFlag {
	
	
	public  void rearrage(int[] arr) {
	  
		
		int low=0 ;
		int high =arr.length-1 ;
		int pt=0;
		
		while (pt<arr.length && pt<=high) {
			
			if(arr[pt]==0) {
				swap(arr,low, pt);
				low++ ;
				pt++ ;
			}else if (arr[pt]==1) {
				pt++;
			}else {
				swap(arr,high, pt);
				high--;
				
			}
						
		}
		
		
	  }

	private  void swap(int[] arr, int low, int pt) {
		
		int temp=arr[pt];
		arr[pt]=arr[low];
		arr[low]=temp ;
	}

	public static void main(String[] args) {
		
		DutchFlag f = new DutchFlag();
		
		f.rearrage(null);
	}
}
