package com.ray.basic;

public class TestDice {

	public static void main(String[] args) {
		int lickyNum = 8;
		int diceNum;
		while (true) {
			diceNum = (int) (Math.random() * 8) + 1;
			// System.out.println(diceNum);
			if (lickyNum == diceNum) {
				System.out.println(diceNum);
			break;
			}
		}
	}

}
