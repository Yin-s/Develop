package main;

import java.util.ArrayList;
import java.util.Collections;

public class AvgClass {

	public static double avg(ArrayList arr) {
		double sum=0;
		for(int i=0;i<arr.size();i++)
		{
			sum+=(int)arr.get(i);
		}
		double avg=sum/arr.size(); 
		
		return avg;
	}
	public static int maxGrade(ArrayList arr) {
		int maxgrade=(int)Collections.max(arr);
		return maxgrade;
	}
	public static int minGrade(ArrayList arr) {
		int mingrade=(int)Collections.min(arr);
		
		return mingrade;
	}

}
