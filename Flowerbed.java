package coreJava;

import java.util.Arrays;

public class Flowerbed {

	public static void main(String[] args) {
		int[] plant = { 0, 0, 1, 0, 1,0,0 };
		int flower = 2;

		boolean canPlant = canPlaceFlowers(plant, flower);
		System.out.println(canPlant);
	}

	public static boolean canPlaceFlowers(int[] plant, int n) {
		int count = 0;
		for (int i = 0; i < plant.length; i++) {
			if (plant[i] == 0) {
				
				boolean emptyLeft = (i == 0) || (plant[i - 1] == 0);
				boolean emptyRight = (i == plant.length - 1) || (plant[i + 1] == 0);

				if (emptyLeft && emptyRight) {
					plant[i] = 1;
					count++;
					if (count >= n)			
						
					return true;
				}
				
			}
			System.out.println(Arrays.toString(plant));
		}
		return count >= n;
	}
}
