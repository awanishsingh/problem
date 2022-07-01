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

}
