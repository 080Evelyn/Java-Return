

import java.util.Arrays;
import java.util.Random;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int[] fArray = getRandomArray(5);
				System.out.println(Arrays.toString(fArray));
				
				Arrays.sort(fArray);
				System.out.println(Arrays.toString(fArray));
				
				int[] tArray = sortedInteger(new int[] {7, 5, 30, 35, 19});
				System.out.println( Arrays.toString(tArray));
			}
			
			private static int[] getRandomArray(int len) {
				Random random = new Random();
				int[] sArray = new int[len];
				
				for(int i = 0; i < len; i++) {
					sArray[i] = random.nextInt(100);
				}
				
				return sArray;
			}
			
			private static int[] sortedInteger(int[] fey) {
				
				System.out.println(Arrays.toString(fey));
				
				int[] sortedArray = Arrays.copyOf(fey, fey.length);
				boolean flag = true;
				int temp;
				while(flag) {
					flag = false;
					for(int i = 0; i < sortedArray.length - 1; i++) {
						if(sortedArray[i] < sortedArray[i + 1]) {
							temp = sortedArray[i];
							sortedArray[i] = sortedArray[i + 1];
							sortedArray[i + 1] = temp;
							flag = true;
							
							System.out.println("---> " + Arrays.toString(sortedArray));
						}
					}
					System.out.println("--------> " + Arrays.toString(sortedArray));
				}
				
				return sortedArray;
				
				
				]
	

}
