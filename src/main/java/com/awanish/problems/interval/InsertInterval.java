package com.awanish.problems.interval;

import java.util.ArrayList;

/* @Leet Code : https://leetcode.com/problems/insert-interval/
 * 
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

   Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

    Return intervals after the insertion.

 
Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 * 
 */


public class InsertInterval {
	
	
	
	public int[][] insert(int[][] intervals, int[] newInterval) {
		
		ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
		
		for ( int i=0 ; i<intervals.length;i++) {
			if(newInterval[1] < intervals[i][0]) {
				addInterval(newInterval[0],newInterval[1], returnList);
				return appendRestElement(returnList,intervals,i);
			}else if(newInterval[0]>intervals[i][1]) {
				addInterval(intervals[i][0],intervals[i][1], returnList);
			}else {
				newInterval[0]= Math.min(intervals[i][0], newInterval[0]);
				newInterval[1]= Math.max(intervals[i][1], newInterval[1]);
			}
		}
		
		addInterval(newInterval[0],newInterval[1], returnList);
		
		return convertToArray(returnList);
		
	}

	private void addInterval(int intervalStart, int intervalEnd ,ArrayList<ArrayList<Integer>> returnList) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(intervalStart);
		temp.add(intervalEnd);
		returnList.add(temp);
	}

	private int[][] appendRestElement(ArrayList<ArrayList<Integer>> returnList, int[][] intervals, int i) {
		
		for ( int j=i ;j<intervals.length;j++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(intervals[j][0]);
			temp.add(intervals[j][1]);
			returnList.add(temp);
		}
		return convertToArray(returnList);
	}

	private int[][] convertToArray(ArrayList<ArrayList<Integer>> returnList) {
		return returnList.stream()
				         . map( l -> l.stream().mapToInt(Integer::intValue).toArray())
				         .toArray(int [][]::new);
	}

}
