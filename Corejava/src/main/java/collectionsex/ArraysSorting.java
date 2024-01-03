package collectionsex;

import java.util.Arrays;

public class ArraysSorting {

	public static void main(String[] args) {
		int[] arr = {20,4,68,87,21,2,90};
		String[] names = {"xyz","pqr","abc"};
		System.out.println("--without sorting Array Elements --");
		for(int k:arr) {
			System.out.println(k);
		}
		Arrays.sort(arr);
		System.out.println("--After sorting Array Elements are--");
		for(int k:arr) {
			System.out.println(k);
		}
		System.out.println("Array Minvalue = "+arr[0]);
		System.out.println("Array Maxvalue = "+arr[arr.length-1]);
		System.out.println("Array Second Highest value = "+arr[arr.length-2]);
        Arrays.sort(names);
        System.out.println("After sorting string array elements are");
        for(String name:names) {
        	System.out.println(name);
        }
        System.out.println("Sorting Reverse Order");
        for(int i=names.length-1;i>=0;--i) {
        	System.out.println(names[i]);
        }
	}

}