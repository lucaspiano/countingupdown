package com.countingupdown.handler;

import java.util.Scanner;

/**
 * Class that counts up and down a value from a start entry point until a specific limit value
 * using recursion and printing the respective values on the screen
 * 
 * @author lucas
 *
 */
public class CountingUpDownMain {
	
	void countUpAndDown(int start, int end) {
		System.out.println(start);
		if (start == end) {
			return;
		}
		countUpAndDown(start+1, end);
		System.out.println(start);
	}
	
	void countUp(int start, int end) {
		if (start <= end) {
			System.out.println(start);
			countUp(start+1, end);
		}
	}
	
	public static void main(String[] args) {
		CountingUpDownMain countingUpDownMain = new CountingUpDownMain();
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter with the start value: ");
		String startValue = scanner.nextLine();
		int start = Integer.parseInt(startValue);

		System.out.println("Enter with the end value: ");
		String endValue = scanner.nextLine();
		int end = Integer.parseInt(endValue);
		
		if (start >= 0 && start < end) {
			System.out.println("Counting Up:");
			countingUpDownMain.countUp(start, end);
			
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			
			System.out.println("Counting Up and Down:");
			countingUpDownMain.countUpAndDown(start, end);
			System.out.println("The End!");
			
		}
		
		
	}

}
