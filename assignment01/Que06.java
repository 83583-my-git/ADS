package assignment01;

import java.util.Scanner;

public class Que06 {
	private static int linearSearch(int arr[], int N, int key,int occu) {
		int count = 0;
		int last = -1;
		for(int i = 0;i<N ;i++) {
			if(arr[i]==key) {
				last = i;
				count++;
				if(count == occu) {
					System.out.println("no. of comparison = "+count);
					return last;
				}
			}
		}
		System.out.println("no. of comparison = "+count);
		return last;
		
		
		
	}
	public static void main(String[] args) {
		int arr[] = {33,88,99,11,77,88,22,88,14};
		System.out.println("enter your key ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println("enter no. of occurance of given no.");
		int occu = sc.nextInt();
		
		int index = linearSearch(arr,arr.length,key,occu);
		if(index == -1) {
			System.out.println(key+"key is not found ");
			
		}
		else {
			System.out.println("key is found "+index);
		}
	}


}
