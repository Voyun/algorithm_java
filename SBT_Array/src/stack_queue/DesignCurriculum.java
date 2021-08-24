package stack_queue;
import java.util.*;

public class DesignCurriculum {

	public String solution(String mandatory, String plan) {
		String answer = "YES";
		Queue<Character> queue = new LinkedList<>();
		
		for(char x: mandatory.toCharArray()) queue.offer(x);
		
		for(char x: plan.toCharArray()) {
			if(queue.contains(x)) {
				if(queue.peek() == x) queue.poll();
				else return "NO";
				// if(x!=Q.poll()) return "NO";
			}
		}
	
		if(!queue.isEmpty()) return "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		DesignCurriculum T = new DesignCurriculum();
		Scanner kb = new Scanner(System.in);
		String mandatory = kb.next();
		String plan = kb.next();

		System.out.print(T.solution(mandatory, plan));
	}

}
