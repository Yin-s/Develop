package main;

import java.util.ArrayList;

public class SecClass {
	int a,b,c=0;//a��0-40��b��40-80��c��80-100
	public void Section(ArrayList arr){
		
		for(int i=0;i<arr.size();i++){
			if((int)arr.get(i)>0 && (int)arr.get(i) < 40)
				a++;
			else if((int)arr.get(i)>=40 && (int)arr.get(i) < 80)
				b++;
			else if((int)arr.get(i)>=80 && (int)arr.get(i) < 100)
				c++;
		}
		System.out.println("0-40�������"+a+"����40-80�������"+b+"����80-100�������"+c+"��");
	}
}
