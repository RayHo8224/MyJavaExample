package com.ray.basic;

public class TestForLoopEx1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				System.out.print("*");

			}
			System.out.print("\n");
		}

		int z = 3;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j <= z || j > 7 - z)

					System.out.print(" ");
				else
					System.out.print("*");

			}
			System.out.print("\n");
			z = z - 1;
		}
	}

}
