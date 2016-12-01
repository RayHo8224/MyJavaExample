package com.ray.basic;

class Text1{
	public void forward(){
		System.out.println("Go Forward.");
		backward();
	}
	
	public void backward(){
		System.out.println("Go Backward.");
		//forward();
	}

}

public class CallTestMethodEx1 {
	int i;
	int j=i+1;
	public static void main(String[] args) {
		System.out.println();
		Text1 test1 = new Text1();
	}

}
