package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] firstArray = getRandomArray(10);
		System.out.println(Arrays.toString(firstArray));
	
		Arrays.sort(firstArray);
		System.out.println(Arrays.toString(firstArray));
		
		
		int[] secondArray = new int[10];
		System.out.println(Arrays.toString(secondArray));
		Arrays.fill(secondArray, 5);
		System.out.println(Arrays.toString(secondArray));
		
		System.out.println();
		
		
		int[] thirdArray = getRandomArray(8);
		System.out.println(Arrays.toString(thirdArray));
		
		int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
		System.out.println(Arrays.toString(fourthArray));
				
		Arrays.sort(fourthArray);
		System.out.println(Arrays.toString(thirdArray));
		System.out.println(Arrays.toString(fourthArray));
		
		int[] smallArray = Arrays.copyOf(thirdArray, 5);
		System.out.println(Arrays.toString(smallArray));
		
		int[] largeArray = Arrays.copyOf(thirdArray, 12);
		System.out.println(Arrays.toString(largeArray));
				
		
		String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
		Arrays.sort(sArray);
		System.out.println(Arrays.toString(sArray));
		if(Arrays.binarySearch(sArray, "Mark") > 0) {
			System.out.println("Found Mark in the list");
		}
		
		
		int[] s1 = {1, 2, 3, 4, 5, 6};
		int[] s2 = {1, 2, 3, 4, 5, 6};
		
		if(Arrays.equals(s1, s2)) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are NOT equal");
		}
	}
	
	private static int[] getRandomArray(int len) {
		Random random = new Random();
		int[] newInt = new int[len];
		
		for(int i = 0; i < len; i++) {
			newInt[i] = random.nextInt(100);
		}
		
		return newInt;
	}

}
