package com.awanish.problems.interval;

import java.util.Arrays;
import java.util.Comparator;

/* Given an array of intervals representing ‘N’ appointments, find out if a person can attend all the appointments.
 * Appointments: [[1,4], [2,5], [7,9]]
    Output: false
     Explanation: Since [1,4] and [2,5] overlap, a person cannot attend both of these appointments.
 * 
 * 
 * */
public class ConflictingAppointments {
	
	public boolean canAttendAllMeeting(int [][] appointments) {
		
		   boolean canAttendAllMeeting = true ;
		Arrays.sort(appointments, (a,b) ->Integer.compare(a[0], b[0]) ) ;
		
		for(int i=1 ;i<appointments.length;i++) {
			
			if(appointments[i][0] < appointments[i-1][1]) {
				canAttendAllMeeting =false ;
			}
		}
		
		return canAttendAllMeeting ;
	}

//	private Comparator<? super int[]> comp() {
//		return (a,b) ->Integer.compare(a[0], b[0]);
//	}

}
