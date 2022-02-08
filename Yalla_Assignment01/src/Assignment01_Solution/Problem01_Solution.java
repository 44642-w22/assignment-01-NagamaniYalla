package Assignment01_Solution;

import java.util.*;

public class Problem01_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		LinkedList<Integer> L1 = new LinkedList<>();
		System.out.println("enter the size");
		int sizeOfArray = scan.nextInt();
		while(sizeOfArray>0) { 
			System.out.println("Enter the elements to the list : ");
	        L1.add(scan.nextInt());
	        sizeOfArray--;  
	        }
	        scan.close();
	    Problem01_Function(L1);
	}
	public static void Problem01_Function(LinkedList<Integer> L1) {
    	LinkedList<Integer> L2 = new LinkedList<>();
    	for (int i = 0; i < L1.size(); i++) {
    		int x = L1.get(i);
    		int sum = 0;
    		for (int j=1; j<=x/2; j++) {
    			if (x%j == 0) {
    				sum += j;
    			}
    		}
    		if (sum == x) {
    			L2.add(x);
    		}
    	}
    	System.out.println(L2);
    }
}