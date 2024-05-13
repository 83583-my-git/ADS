package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = {44,55,22,66,77,88,55};
		DescendingStack dst = new DescendingStack(arr.length);
		for(int i = 0;i<arr.length;i++) {
			dst.push(arr[i]);
		}
		for(int i = 0;i<arr.length;i++) {
			arr[i]= dst.pop();
		}
		System.out.println(Arrays.toString(arr));
		
	}
}

