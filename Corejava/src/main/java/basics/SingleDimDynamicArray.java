package basics;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimDynamicArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer Array Size ?");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements?");
		for(int i=0;i<size;++i) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are :");
		for(int i=0;i<size;++i) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("After Sorting Array Elements are:");
		for(int k:arr) {
			System.out.println(k);
		}
		System.out.println("Array Min Value = "+arr[0]);
		System.out.println("Array Max Value = "+arr[size-1]);
		System.out.println("Arra Second Highest Value = "+arr[size-2]);

	}

}
