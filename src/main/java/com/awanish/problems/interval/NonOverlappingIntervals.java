package com.awanish.problems.interval;

import java.util.Arrays;

/*  leetCode : https://leetcode.com/problems/non-overlapping-intervals/
 * *
 * Given an array of intervals intervals where intervals[i] = [starti, endi], 
 * return the minimum number of intervals you need to remove to make the rest of 
 * the intervals non-overlapping.
 * Example 1:

Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
 */

public class NonOverlappingIntervals {
	
	
	 public int eraseOverlapIntervals(int[][] intervals) {
	        
	        
	        Arrays.sort(intervals , ( a ,b) -> Integer.compare(a[0] ,b[0]));
	        int i=1 ;
	        int count =0 ;
	        int endofInterval=intervals[0][1];
	        while(i<intervals.length){
	            if(intervals[i][0] < endofInterval){
	                //System.out.println(intervals[i][0] + "," + intervals[i][1] );
	                endofInterval=Math.min(endofInterval,intervals[i][1]);
	                count ++ ;
	            }else{
	                endofInterval=intervals[i][1];
	            }
	            i++;
	        }
	       return count ;
	        
	    }

}
