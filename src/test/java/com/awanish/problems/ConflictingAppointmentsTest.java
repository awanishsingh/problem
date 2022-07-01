package com.awanish.problems;

import org.junit.*;

import com.awanish.problems.interval.ConflictingAppointments;

public class ConflictingAppointmentsTest {
	
	ConflictingAppointments conflictAppointment = new ConflictingAppointments();

	@Test
	public void testInput1() {
		
		int [][] input1 = {{1,4},{2,5},{7,9}};
		boolean result = conflictAppointment.canAttendAllMeeting(input1);
		
		Assert.assertFalse(result);
		
	}
	@Test
	public void testInput2() {
		//None of the appointments overlap, therefore a person can attend all of them.
		int [][] input1 = {{6,7},{2,4},{8,12}};
		boolean result = conflictAppointment.canAttendAllMeeting(input1);
		
		Assert.assertTrue(result);
		
	}
	
	@Test
	public void testInput3() {
		
		int [][] input1 = {{4,5},{2,3},{3,6}};
		//Since [4,5] and [3,6] overlap, a person cannot attend both of these appointments.
		boolean result = conflictAppointment.canAttendAllMeeting(input1);
		
		Assert.assertFalse(result);
		
	}
}
