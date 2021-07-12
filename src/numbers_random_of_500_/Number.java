package numbers_random_of_500_;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

public class Number {

	public static void main(String[] args) {

		int[] numbers = new int[500];
		int[] num2= new int[500];

		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 500 + 1);
			//System.out.println(numbers[i]);
			} 
		
		removingDuplicate(numbers);
		System.out.println();
		Arrays.sort(numbers);
		num2=numbers;
		System.out.println("Enter the smallest Nth Number?");
		Scanner scanner = new Scanner(System.in);
		int user_number = scanner.nextInt();
		//int smallest_Number=kthSmallest(num2, user_number);
		int smallest_Number=num2[user_number];
		System.out.println("The Nth Smallest Number is :"+smallest_Number);
	}

	public static int kthSmallest(int[] numbers1,int n) {

		Arrays.sort(numbers1);
		return	numbers1[n-1];
		
	}

	public static void removingDuplicate(int[] ints) {
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < ints.length; i++) {
			set.add(ints[i]);
		}
		 System.out.println(set);
		 System.out.println("size of the array"+set.size());
		
	}

}
