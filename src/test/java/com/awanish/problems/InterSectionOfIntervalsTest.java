package com.awanish.problems;

import org.junit.Assert;
import org.junit.Test;

import com.awanish.problems.interval.InterSectionOfIntervals;

public class InterSectionOfIntervalsTest {
	
	InterSectionOfIntervals interSectionOfIntervals = new InterSectionOfIntervals();
	@Test
	public void testInput1() {
		
		int [][] interval1 = {{1,3},{5,6},{7,9}} ;
		int [][] interval2 = {{2,3},{5,7}} ;
		//arr1=[[1, 3], [5, 6], [7, 9]], arr2=[[2, 3], [5, 7]]
		int [][] expected = {{2,3},{5,6},{7,7}};
		int[][] result = interSectionOfIntervals.mergerOverLappingIntervals(interval1, interval2);
		Assert.assertArrayEquals(expected, result);
		System.out.println("result +" + result);
	}
	@Test
	public void testInput2() {
		
		int [][] interval1 = {{1,3},{5,7},{9,12}} ;
		int [][] interval2 = {{5,10}} ;
		//arr1=[[1, 3], [5, 6], [7, 9]], arr2=[[2, 3], [5, 7]]
		int [][] expected = {{5,7},{9,10}};
		int[][] result = interSectionOfIntervals.mergerOverLappingIntervals(interval1, interval2);
		Assert.assertArrayEquals(expected, result);
		System.out.println("result +" + result);
	}
	
	public int[][] insterInterval(int intervals[][] , int newInterval[][]) {
		
		int len = intervals.length ;
		//edge case 1 begining 
		
		if(intervals[0][0]>newInterval[0][0]) {
		      	if(intervals[0][0]<newInterval[0][1]) {
		      		intervals[0][0]=Math.min(intervals[0][0], newInterval[0][0]);
		      		intervals[0][1]=Math.max(intervals[0][1], newInterval[0][1]);
		      	}else {
		      		int temp[][] = new int[intervals.length+1][2];
		      		temp[0]= newInterval[0];
		      		int k=1;
		      		for(int i=0;i<intervals.length;i++) {
		      			temp[k++]=intervals[i];
		      		}
		      		intervals=temp ;
		      		
		      	}
		      	return intervals ;
			
		}else if(intervals[len-1][1]<newInterval[0][1]) {
			
			 if(intervals[len-1][1]>newInterval[0][0]) {
				 intervals[len-1][0]=Math.min(intervals[len-1][0], newInterval[0][0]);
		      	 intervals[len-1][1]=Math.max(intervals[len-1][1], newInterval[0][1]);
			 }else {
				 int temp[][] = new int[intervals.length+1][2];
				 temp[temp.length-1]= newInterval[0];
				 int k=0;
		      		for(int i=0;i<intervals.length;i++) {
		      			temp[k++]=intervals[i];
		      		}
		      		intervals=temp ;
			 }
			 return intervals ;
			
		} else {
			
			
			return null ;
		}
		
		
	}

}
