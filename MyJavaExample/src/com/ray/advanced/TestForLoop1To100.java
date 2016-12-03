package com.ray.advanced;

public class TestForLoop1To100 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++){
			count=count+i;
		}
		System.out.println("1+2+...+99+100="+count);
	}

}
