package com.ray.basic;

public class TestSwitchCase {

	public static void main(String[] args) {
		int x=12;
		switch (x){
		case 1:
			x=1;
			System.out.println(x);
			break;
		case 5:	
			x=5;
			System.out.println(x);
			break;
		case 10:	
			x=10;
			System.out.println(x);
			break;
		default:
			System.out.println("default");
		}
	}

}
