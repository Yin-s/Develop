package main;

import java.util.ArrayList;

public class MainTask {//成绩统计
	public static void main(String[] args) {
		
		//对成绩进行排序
		//求平均值，最大值、最小值
		//统计区间：0~20：xx个；21~40：xx个
		ArrayList arr=new ArrayList();
		arr.add(50);
		arr.add(20);
		arr.add(60);
		arr.add(90);
		arr.add(70);
		arr.add(30);
		arr.add(80);
		arr.add(40);
		arr.add(20);
		
		SortClass sc=new SortClass();
		sc.sort(arr);
		
	}
	
	
}
