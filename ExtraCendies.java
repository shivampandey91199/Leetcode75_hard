package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//candies = [2,3,5,1,3], extraCandies = 3
public class ExtraCendies {
	public static void main(String[] args) {
		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		int largest = Arrays.stream(candies).max().getAsInt();
		List<Boolean> list = new ArrayList<Boolean>();
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies == largest || candies[i] + extraCandies > largest) {
				list.add(true);
			} else {
				list.add(false);
			}
		}
		System.out.println(list);
	}
}
