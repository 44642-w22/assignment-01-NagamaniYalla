package Assignment01_Solution;
import java.util.*;

public class Problem05_Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input brackets :");  
		String strInput = scan.nextLine();
		Problem05_Function(strInput);
		scan.close();
		
	}

	private static void Problem05_Function(String strInput) {
		boolean defalt = true;
		ArrayList<Character> bracketsList = new ArrayList<>();
		bracketsList.add('(');
		bracketsList.add('[');
		bracketsList.add('{');

		Stack<Character> inputStack = new Stack<>(); 
		for (int i = 0; i < strInput.length(); i++) {
			if (bracketsList.contains(strInput.charAt(i))) {
				inputStack.push(strInput.charAt(i));

			} else {
				char peekChar;
				if (inputStack.size() > 0) {
					peekChar = inputStack.peek();
				} else {
					defalt = false;
					break;
				}

				if (inputStack.size() > 0 && (peekChar == '{' && strInput.charAt(i) == '}'
						|| peekChar == '(' && strInput.charAt(i) == ')'
						|| peekChar == '[' && strInput.charAt(i) == ']')) {
					inputStack.pop();
				} else {
					defalt = false;
					break;
				}
			}
		}

		if (defalt && inputStack.isEmpty())
			System.out.println(true);
		else
			System.out.println(false);
		

	}
}