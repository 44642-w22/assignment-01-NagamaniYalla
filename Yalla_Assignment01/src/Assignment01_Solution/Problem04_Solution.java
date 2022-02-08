package Assignment01_Solution;

import  java.util.*;

public class Problem04_Solution {

	public static void main(String[] args) {
		ArrayList<String> A1 = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array list A1: ");
		int arraySize = scan.nextInt();
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter the elements to store into array list A1: ");
			A1.add(scan.next());
		}
		
		Problem04_Function(A1, arraySize);
		scan.close();
	}
	
	public static void Problem04_Function(ArrayList<String> A1, int size) {
		ArrayList<String> A2 = new ArrayList<String>();
		int [] arrayNew = new int [size];
		for (int i = 0; i < size; i++) {
			arrayNew[i] = A1.get(i).length();
		}
			
		Arrays.sort(arrayNew);
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arrayNew[i] == A1.get(j).length()) {
					A2.add(A1.get(j));
					A1.set(j, "");
				}
			}
		}
		
		System.out.println(A2);	
	}
}


