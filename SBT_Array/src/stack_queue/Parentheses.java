package stack_queue;
import java.util.*;

public class Parentheses {
	
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		
		for(char x: str.toCharArray()) {
			if(x == '(')
				stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		
		if(!stack.isEmpty())
			return "No";
		
		
		return answer;
	}

	public static void main(String[] args) {
		Parentheses T = new Parentheses();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}

}
