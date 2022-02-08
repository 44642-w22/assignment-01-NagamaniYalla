package Assignment01_Solution;

import java.util.*;

public class Problem02_Solution {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	LinkedList<Integer> L1 = new LinkedList<>();
	System.out.println("Enter the size of linked list L1: ");
	int sizeOfList = scan.nextInt();
	System.out.println("Enter the value of k whose sum equal to pairs of continuous elements in L1: ");
	int k = scan.nextInt();
	while(sizeOfList >0) { 
		System.out.println("Enter the elements to add into list L1: ");
        L1.add(scan.nextInt());
        sizeOfList --;    
        }
        scan.close();   
        
    Problem02_Function(L1,k);
    
}
public static void Problem02_Function(LinkedList<Integer> L1, int k) {
	
	LinkedList<ArrayList<Integer>> L2 = new LinkedList<>();
	for (int i = 0; i <L1.size()-1; i++) {
		ArrayList<Integer> pairList = new ArrayList<>();
			if (k == (L1.get(i)+L1.get(i+1))) {
				pairList.add(L1.get(i));
				pairList.add(L1.get(i+1));
				L2.add(pairList);
			}
			
		}
	System.out.println(L2);
	}
	
}