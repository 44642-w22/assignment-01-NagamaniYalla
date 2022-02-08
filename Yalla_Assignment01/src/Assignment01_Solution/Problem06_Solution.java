package Assignment01_Solution;

import java.util.*;

public class Problem06_Solution {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the even size of stack: ");
		int size = scan.nextInt();
		while(true) {
			if (size % 2 == 0) {
				break;
			}
			else {
				System.out.println("Sorry, you have entered odd size. Please enter even size again: ");
				size = scan.nextInt();
			}
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements to store in to the stack: ");
			stack.push(scan.nextInt());
		}
		
		Problem06_Function(stack,size);
		scan.close();

	}
	
	public static void Problem06_Function(Stack<Integer> stack, int size) {
		ArrayList<Integer> problem6Array = new ArrayList<>();
		int z = size / 2;
		for (int i = 0; i < size; i++) {
			if(i < z) {
				problem6Array.add(stack.pop());
			}
			else {
				problem6Array.add(stack.get(i-z));
			}
		}
		System.out.println(problem6Array);
	}

}


