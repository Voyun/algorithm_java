package stack_queue;
import java.util.*;

public class IronBar {
	
	public Integer solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
			
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ')') {
				if(str.charAt(i-1) == '(') {
					stack.pop();
					answer += stack.size();
				} else {
					answer += 1;
					stack.pop();
				}
			} else {
				stack.push(str.charAt(i));
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		IronBar T = new IronBar();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}

}
