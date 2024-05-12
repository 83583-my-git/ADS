package assignment01;

import java.util.Scanner;

public class Que031 {
	private static int linearSearch(int arr[], int N, int key) {
		int count = 0;
		int last = -1;
		for(int i = 0;i<N ;i++) {
			if(arr[i]==key) {
				last = i;
				count++;
				
			}
		}
		System.out.println("comparison is equal to "+count);
		return last;
		
		
		
	}
	public static void main(String[] args) {
		int arr[] = {33,88,99,11,77,88,22,14};
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		int index = linearSearch(arr,arr.length,key);
		if(index == -1) {
			System.out.println(key+"key is not found ");
			
		}
		else {
			System.out.println("key is found "+index);
		}
	}


}
