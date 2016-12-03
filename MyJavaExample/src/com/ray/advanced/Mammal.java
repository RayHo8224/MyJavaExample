package com.ray.advanced;

public class Mammal implements Animal_Interface {
	public String x="Doggg";



	@Override
	public String run(String x) {
		System.out.println(x+"Mammal run");
		return null;
	}

	@Override
	public String jump(String x) {
		System.out.println(x+"Mammal jump");
		return null;
	}

}
