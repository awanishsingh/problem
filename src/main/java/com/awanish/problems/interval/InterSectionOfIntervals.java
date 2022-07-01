package com.awanish.problems.interval;

import java.util.ArrayList;

public class InterSectionOfIntervals {
	
	
	
	public int[][] mergerOverLappingIntervals ( int[][] intervals1 , int[][]intervals2){
	//Idea to determine common part of int1 {a1,a2} and int2 {b1,b2}  
		
	//common interval = { max(a1,b1) , min(a2,b2))
	//move the pointer to next for the interval which ended first 

		 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		 int lenOfInterval1 = intervals1.length ;
		 int lenOfInterval2 = intervals2.length ;
		 
		 int i=0 ;
		 int j = 0;
		 
		 while ( i<lenOfInterval1 && j<lenOfInterval2) {
			 
			 if( ( intervals1[i][0]<=intervals2[j][0] && intervals1[i][1]>=intervals2[j][0]) 
					        
					  || (intervals1[i][0]>=intervals2[j][0] && intervals1[i][0]<=intervals2[j][1])  )
					 
			 {
				 ArrayList<Integer> temp = new ArrayList<Integer>() ;
				 temp.add(Math.max(intervals1[i][0], intervals2[j][0]));
				 temp.add( Math.min(intervals1[i][1], intervals2[j][1]));
				 result.add(temp);
			 }
			 
			 if(intervals1[i][1]< intervals2[j][1]) {
				 i++;
			 }else {
				 j++ ;
			 }
				 
				 
		 }
		
		
		
		return result.stream()
				      .map( l ->l.stream().mapToInt(Integer::intValue).toArray())
				      .toArray(int [][]::new);
				       
                     
              
	}

}
