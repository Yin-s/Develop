package main;

import java.util.ArrayList;

public class MainTask {//�ɼ�ͳ��
	public static void main(String[] args) {
		
		//�Գɼ���������
		//��ƽ��ֵ�����ֵ����Сֵ
		//ͳ�����䣺0~20��xx����21~40��xx��
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
