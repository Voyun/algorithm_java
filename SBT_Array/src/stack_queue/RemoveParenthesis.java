package stack_queue;
import java.util.*;

public class RemoveParenthesis {

	public String solution(String str){
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char x: str.toCharArray()) {
			if(x==')') {
				while(stack.pop()!='(');
			}
			else stack.push(x);
		}
		
		for(char x: stack) {
			answer += x;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		RemoveParenthesis T = new RemoveParenthesis();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}

}
