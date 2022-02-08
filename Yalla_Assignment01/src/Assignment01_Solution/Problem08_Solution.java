package Assignment01_Solution;

import java.util.*;

public class Problem08_Solution {

	public static void main(String[] args) {
		Queue<Integer> qList = new LinkedList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Queue: ");
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements to QUEUE: ");
			qList.add(scan.nextInt());
		}
	
		Problem08_Function (qList,size);
		scan.close();
		
	}
	
	public static void Problem08_Function(Queue<Integer> Q1, int size) {
		ArrayList<Integer> arrayOne = new ArrayList<>();
		ArrayList<Integer> arrayTwo = new ArrayList<>();
		for (Integer item: Q1) {
            arrayOne.add(item);
        }
		
		for(int i = 0; i < size/2; i++) {
			arrayTwo.add(arrayOne.get(size-i-1));
			arrayTwo.add(arrayOne.get(i));
		}
		if (size % 2 != 0) {
			arrayTwo.add(arrayOne.get(size/2));
		}
		
		System.out.println(arrayTwo);
	}
	
	
}