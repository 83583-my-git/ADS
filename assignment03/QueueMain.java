package assignment;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		Queue que = new Queue(4);
		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("enter your choice ");
			System.out.println("0. exit");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. display Queue");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				if (!que.isFull()) {
					System.out.println("enter value to push");
					int value = sc.nextInt();
					que.push(value);
				} else {
					System.out.println("sorry buddy! queue is full");
				}

			}
				break;
			case 2: {
				if (!que.isEmpty()) {
					System.out.println("popped element" + que.pop());
				} else {
					System.out.println("queue is empty");
				}
				break;
			}
			case 3: {
				if (!que.isEmpty()) {
					System.out.println("peek element is " + que.peek());
				} else {
					System.out.println("queue is empty");
				}
				break;

			}
			case 4:
				que.display();
				break;
			}

		} while (choice != 0);
	}
	}

