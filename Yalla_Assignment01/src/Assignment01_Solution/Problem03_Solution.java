package Assignment01_Solution;

import java.util.*;

public class Problem03_Solution {

	public static void main(String[] args) {
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array A1: ");
		int sizeOfArray = scan.nextInt();
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.println("Enter the elements: ");
			A1.add(scan.nextInt());
		}
		
		Problem03_Function(A1);
		scan.close();
	}
	
	public static void Problem03_Function(ArrayList<Integer> A1) {
		if(A1.size() == 0) {
			System.out.println(Integer.MIN_VALUE);
		}
		else {
			Collections.sort(A1);
			System.out.println(A1.get(A1.size()-1));
		}
	}
}
