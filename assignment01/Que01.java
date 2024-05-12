package assignment01;

public class Que01 {
	public static int palindrome(int arr[],int N) {
		
		int count = 0;
		for (int i = 0;i<N/2;i++) {
			if (arr[i]==arr[N-i-1]) {
			count++;
			}
			else {
				return -1;
			}
		}
		System.out.println("count = "+count);
		return 1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,3,3,1};
		int i = palindrome(arr,arr.length);
		if(i == 1) {
			System.out.println("given arr is palindrome");
		}
		else {
			System.out.println("given arr  is not palindrome");
		}

}
}
