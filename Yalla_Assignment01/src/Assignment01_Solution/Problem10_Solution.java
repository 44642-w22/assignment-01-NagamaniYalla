package Assignment01_Solution;

import java.util.*;
public class Problem10_Solution {

	public static void main(String[] args) {
		{		
			Deque<String> deqArr = new ArrayDeque<>();
			List<Integer> arrList = new ArrayList<>();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the length of Deque");
			int lendeq = scan.nextInt();		
			System.out.println("Enter the list of Characters for Deque");
			for(int i=1; i<=lendeq;i++) {
				deqArr.add(scan.next());
			}		
			System.out.println("Enter the length of Array of operations");
			int lenArray = scan.nextInt();		
			System.out.println("Enter the Array of operations in 1 and 0 ");
			for(int i=1; i<=lenArray;i++) {
				arrList.add(scan.nextInt());
			}		
			System.out.println("List of Deque : " + deqArr);
			System.out.println("Array of operations : " + arrList);		
			Deque<String> deqDouble = new LinkedList<>(deqArr);
			Stack<String> S = new Stack<>();		
			for(int xy : arrList) {
				switch(xy) {
				 	case 1: if(!deqDouble.isEmpty()) {
				 		S.add(deqDouble.pollFirst());
				 		break;
				 	}
				 	case 0: if(!S.isEmpty()) {
				 		deqDouble.addFirst(S.pop());
				 		break;
				 	}
				}
			}		
			Iterator<String> objIterator = deqDouble.iterator();  
			while(objIterator.hasNext())
			{
				System.out.print(objIterator.next());
			}
			scan.close();
		}	
	}
}