package com.awanish.problems.interval;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {

	public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int[] startInterval = new int[2];
		startInterval[0] = intervals[0][0];
		startInterval[1] = intervals[0][1];

		for (int i = 1; i < intervals.length; i++) {

			if (startInterval[1] < intervals[i][0]) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(startInterval[0]);
				temp.add(startInterval[1]);
				result.add(temp);
				startInterval[0] = intervals[i][0];
				startInterval[1] = intervals[i][1];
			} else {
				startInterval[0] = Math.min(startInterval[0], intervals[i][0]);
				startInterval[1] = Math.max(startInterval[1], intervals[i][1]);
			}

		}
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(startInterval[0]);
		temp.add(startInterval[1]);
		result.add(temp);

		return result.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
	}
}
