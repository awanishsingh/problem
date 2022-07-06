package com.awanish.problems.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToZero {
	
	
	 public List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> ret = new ArrayList<List<Integer>>();
	        
	        Arrays.sort(nums);
	        for(int i=0 ;i<nums.length;i++){
	            if(i>0 && nums[i]==nums[i-1]){
	                continue;
	            }
	           ret.add(twoSum(nums,i));
	        }
	        return ret ;
	    }
	    
	 private  ArrayList<Integer>  twoSum(int arr[] , int target ){
	        //X+Y+Z -> Y+Z=-X 
	        //Use two pointer approach if the Xi+Yj > targetSum  decrement  j
	        //Xi+Yj < targetSum increment i 
	        //break if the Xi+Yj=targetSum
	        ArrayList<Integer> ret = new ArrayList<>();
	        int targetSum = -arr[target];
	        int low = target+1;
	        int high = arr.length-1;
	        
	        while(low<=high){
	             if(arr[low]+arr[high]==targetSum){
	                ret.add(arr[target]);
	                ret.add(arr[low]);
	                ret.add(arr[high]);
	                break ;
	                
	            }else if(arr[low]+arr[high]>targetSum){
	                high--;
	            }else{
	                low++;
	            }
	            
	        }
	        
	        return ret ;
	    }

}
