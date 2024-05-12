package assignment01;

import java.util.Scanner;

public class Que05 {
	public static int binarySearch(int arr[],int N,int key) {
		int left = 0;
		int right = N-1;
		int count =0;
		while(left<=right) {
			count++;
			int mid = (left + right)/2;
			if(key==arr[mid]) {
				System.out.println("comparison is equal to "+count);
				return mid;
				
			}
			else if(key>arr[mid]) {
				right = mid-1;
			}
			else {
				left = mid +1;
			}
			
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		// decided the key
		// 
		// divide collection into two diff partition
		// check key is match with mid  
		// if key is more than mid then go into right partition 
		// if not then go into left partition
		int arr[] = {99,88,77,66,55,44,33,22,11};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your key  = ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr,arr.length,key);
		//System.out.println("index is"+index);
		if(index != -1) {
			System.out.println("key is found ");
		}
		else {
			System.out.println("key is not found");
		}

}
}


