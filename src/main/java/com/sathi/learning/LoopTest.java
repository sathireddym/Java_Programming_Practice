package com.sathi.learning;
/*
Demonstrate the for loop.
Call this file ForDemo.java.
 */
class LoopTest {
	public static void main(String args[]) {
		int count;
		for (count = 0; count < 5; count = count + 1)
			System.out.println("This is count: " + count);

		System.out.println("Final count is " + count);
		System.out.println("Done!");
	}
}