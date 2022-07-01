package com.awanish.problems.interval;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FreeIntervalSlots {
	
	
	public List<Interval> emloyeeFreeTime(List<List<Interval>> schedules){
		List<Interval> result = new ArrayList<Interval>();
		List<Interval> allinterval = schedules.stream()
		          .flatMap(l ->l.stream())
		          .sorted((in1 , in2)-> (Integer.compare(in1.start, in2.start)))
		          .collect(Collectors.toList());
		allinterval =	allinterval.stream().
				              sorted((in1 , in2)-> (Integer.compare(in1.start, in2.start)))
				              .collect(Collectors.toList());
		for(int i=1 ;i<allinterval.size();i++) {
			if(allinterval.get(i-1).end>=allinterval.get(i).start) {
				continue ;
			}else {
				Interval inter = new Interval();
				inter.start=allinterval.get(i-1).end;
				inter.end=allinterval.get(i).start;
				result.add(inter );
			}
		}
		return result ;
	}
	
	
	
	
	
	
	
	
	public class Interval {
		int start ;
		int end ;
	}

}
