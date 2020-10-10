package main;

import java.util.ArrayList;

public class SecClass {
	int a,b,c=0;//a是0-40，b是40-80，c是80-100
	public void Section(ArrayList arr){
		
		for(int i=0;i<arr.size();i++){
			if((int)arr.get(i)>0 && (int)arr.get(i) < 40)
				a++;
			else if((int)arr.get(i)>=40 && (int)arr.get(i) < 80)
				b++;
			else if((int)arr.get(i)>=80 && (int)arr.get(i) < 100)
				c++;
		}
		System.out.println("0-40区间的有"+a+"个，40-80区间的有"+b+"个，80-100区间的有"+c+"个");
	}
}
