package com.awanish.problems.twopointer;

import org.junit.Test;

public class ReplaceElementWithGreatestElimentOnRightSideTest {
	
	ReplaceElementWithGreatestElimentOnRightSide replace = new ReplaceElementWithGreatestElimentOnRightSide();
	
	@Test
	public void input1() {
		int [] input1 = {17,18,5,4,6,1};
		
		input1 = replace.replace(input1);
		for(int i:input1) {
			System.out.println(i);
		}
		
	}

}
