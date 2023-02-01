package smart.array;

import java.util.Arrays;
import java.util.Collection;

public class ArrayPractice {

	public static void main(String[] args) {
		
		findMaxvalue();
		findMinValue();
		find2ndVelue();

	}

//find maximum number :: using single dimensional array	
	static void findMaxvalue() {
		int arr[] = { 4, 2, 6, 3, 7, 9, 1, 8, 5, 0, 10, 15, 15 };
		int maxvalue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maxvalue < arr[i]) {
				maxvalue = arr[i];
			}
		}
		System.out.println("Maxmum Number: " + maxvalue);
	}

//find minimum number :: using single dimensional array	
	static void findMinValue() {
		int arr[] = { 4, 2, 6, 3, 7, 9, 1, 8, 5, 0, 10 };
		int minvalue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (minvalue > arr[i]) {
				minvalue = arr[i];
			}
		}
		System.out.println("Minimum Number: " + minvalue);

	}
// find a 2nd height(nth) number :: using single dimensional array	
	static void find2ndVelue() {
		int arr[] = { 4, 2, 6, 3, 7, 9, 1,10, 8, 5, 0, 10, 15,15};
		System.out.println(Arrays.toString(arr));
		int index= arr.length;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int secendNumber=arr[index-2];   //find 2nd hight number;
		System.out.println(secendNumber);
		
	}
	static void shuffleValue() {
		int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15};
		System.out.println(Arrays.toString(arr));
		
		
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
