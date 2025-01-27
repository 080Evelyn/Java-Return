package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] returnedArray = readIntegers();
		System.out.println(Arrays.toString(returnedArray));
		
//		int returnedMin = findMin(returnedArray);
//		System.out.println("min = " + returnedMin);
		
//		reverse(returnedArray);
//		System.out.println("Final: " + Arrays.toString(returnedArray));
		
		
		int[]  reversedCopy = reverseCopy(returnedArray);
		System.out.println("Before reverse " + Arrays.toString(returnedArray));
		System.out.println("reversed copy " + Arrays.toString(reversedCopy));
		
	}
	
	private static int[] readIntegers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a list of integers, separated by commas");
		String input = sc.nextLine();
		
		String[] splits = input.split(",");
		int[] values = new int[splits.length];
		
		for(int i = 0; i < splits.length; i++) {
			values[i] = Integer.parseInt(splits[i].trim());
		}
		
		return values;
	}
	
	
	private static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int element : array) {
			if(element < min) {
				min = element;
			}
		}
		return min;
	}
	
	private static void reverse(int[] array) {
		
		int maxIndex = array.length -1;
		int halflength = array.length / 2;
		
		for(int i = 0; i < halflength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
			
			System.out.println("--> " + Arrays.toString(array));
		}
		
	}
	
	private static int[] reverseCopy(int[] array) {
		int[] reversedArray = new int[array.length];
		int maxIndex = array.length - 1;
		for(int element : array) {
			reversedArray[maxIndex--] = element;
			
		}
		
		return reversedArray;
	}
	
	
	
	
	

}
