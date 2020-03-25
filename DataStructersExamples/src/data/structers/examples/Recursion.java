package data.structers.examples;

import java.util.Scanner;

public class Recursion {
	static Scanner sc = new Scanner(System.in);
	static int a;

	public static void main(String[] args) {
		
		System.out.println("\nFactorial");
		for(int i = 0; i<10; i++) {
			System.out.println(i+ "!: " + factorial(i) );
		}
		
		System.out.println("\nFibo");
		for(int i = 0; i<15; i++) {
			System.out.print(fibo(i)+ " " );
		}
		
		System.out.println("\nCounttown (20)(recursive - return type:void)");
		countdown(20);
	}

	private static void countdown(int i) {
		if (i > 0) {
			System.out.print(i + " ");
			countdown(i - 1);
		} else
			return;
	}


	private static int fibo(int n) {
		
		if(n==0) {
			return 0;
		}else if (n==1){
			return 1;
		}else{
			return fibo(n-2) + fibo(n-1);
		}
		
	}

	private static int factorial(int i) {
		
		if(i==0) {
			return 1;
		}else{
			return factorial(i-1) * (i);
		}
	}

}
