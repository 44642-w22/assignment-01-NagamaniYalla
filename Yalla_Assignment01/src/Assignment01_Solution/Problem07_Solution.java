package Assignment01_Solution;
import java.util.*;

public class Problem07_Solution {

	public static void main(String[] args) {
		Queue<Integer> qList = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Queue: ");
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements: ");
			qList.add(scan.nextInt());
		}
		Problem07_Function(qList,size);
		scan.close();
	}
	
	public static void Problem07_Function(Queue<Integer> Q1, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + Q1.poll()*(int)(Math.pow(2, i));
		}
		System.out.println(sum);
	}

}

