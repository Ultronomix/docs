package com.revature.challenges.array_list;

public class SumOfArray {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5};
		int sum = 0;
		for (int counter = 0; counter < num.length; counter++) {
			sum += num[counter];
		}
		System.out.println("The sum of the numbers is " + sum);
				
		}
	

}
