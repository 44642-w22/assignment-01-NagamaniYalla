package Assignment01_Solution;

import java.util.*;

public class Problem09_Solution 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Queue<Integer> queFirst = new LinkedList<>();
		Queue<Integer> queEven = new LinkedList<>();
		Queue<Integer> queOdd = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Queue :");
		int lenQue = scan.nextInt();		
		System.out.println("Enter the list of Integers for Queue :");
		for(int i=1; i<=lenQue;i++) 
		{
			queFirst.add(scan.nextInt());
		}		
		Queue<Integer> queDouble = new LinkedList<>(queFirst);
		for(int y : queDouble) 
		{
			if(y%2==0) {
					queEven.add(y);	
			}else{
					queOdd.add(y);				
				}
		}
		List<Integer> arrayQue = new ArrayList<Integer>(lenQue);			
		for(int i=0;i<lenQue;i++) 
		{
				if(arrayQue.size()<lenQue) 
				{
					if(!queEven.isEmpty()) 
					{
						arrayQue.add(queEven.poll());
					}
					if(arrayQue.size()<lenQue) 
					{
						if(!queOdd.isEmpty()) 
						{
							arrayQue.add(queOdd.poll());	
						}
					}
				}
		}
		System.out.println("Output : " + arrayQue);
		scan.close();
	}
}