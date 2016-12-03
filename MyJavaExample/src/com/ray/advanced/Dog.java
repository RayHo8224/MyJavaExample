package com.ray.advanced;

public class Dog extends Mammal{

	public String run(String x) {
		System.out.println(x+"   Dog run");
		return null;
	}

	public static void main(String[] args) {

		Mammal m=new Dog();
		m.x="Dog";
		
		m.run(m.x);
		m.jump(m.x);
		
		Dog t=new Dog();
		t.x="Do";
		
		t.run(t.x);
		t.jump(m.x);
		
	}

}
