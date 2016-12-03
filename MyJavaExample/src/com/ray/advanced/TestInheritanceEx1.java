package com.ray.advanced;

class Father{
	public int x=10;
	public void test1(){
		System.out.println("Father x="+x);
	}
}

class Son extends Father{
	
}

public class TestInheritanceEx1 {

	public static void main(String[] args) {
		Son son = new Son();
		son.test1();
		Son son2 = new Son();
		System.out.println(son==son2);
	}

}
