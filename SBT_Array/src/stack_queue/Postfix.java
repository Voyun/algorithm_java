package stack_queue;
import java.util.*;
public class Postfix {

	public Integer solution(String arr) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
	
		for(char x: arr.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(Character.getNumericValue(x));
			} else {
				int b = stack.pop();
				int a = stack.pop();
				switch(x) {
					case '+' : stack.push(a+b);
						break;
					case '-' : stack.push(a-b);
						break;
					case '*' : stack.push(a*b);
						break;
					case '/' : stack.push(a/b);
						break;
				}
			}
		}
		
		answer = stack.get(0);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Postfix T = new Postfix();
		Scanner kb = new Scanner(System.in);
		String arr = kb.next();
		System.out.print(T.solution(arr));
	}

}
