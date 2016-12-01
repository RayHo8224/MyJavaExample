package com.ray.basic;

public class TestOperationEx2 {

	public static void main(String[] args) {

		int x=1,y=2,z;
		z=(x++)+(++y);
		System.out.println("x="+x);//2
		System.out.println("y="+y);//3
		System.out.println("z="+z);//4
	}

}
