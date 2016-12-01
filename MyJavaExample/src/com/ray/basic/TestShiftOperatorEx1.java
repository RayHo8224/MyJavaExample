package com.ray.basic;

public class TestShiftOperatorEx1 {
	public static void main(String[] args) {

		System.out.println("1234>>2=" + (1234 >> 2));
		System.out.println("-1234>>2=" + (-1234 >> 2));
		System.out.println("1234>>>2=" + (1234 >>> 2));
		System.out.println("-1234>>>2=" + (-1234 >>> 2));
		System.out.println("1234<<2=" + (1234 << 2));
		System.out.println("-1234<<2=" + (-1234 << 2));
	}
}
