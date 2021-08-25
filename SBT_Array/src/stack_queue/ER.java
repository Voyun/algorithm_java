package stack_queue;
import java.util.*;

class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class ER {
	

	public Integer solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> queue = new LinkedList<>();
		
		for(int i=0; i<n; i++) queue.offer(new Person(i, arr[i]));
		
		while(!queue.isEmpty()) {
			Person tmp = queue.poll();
			for(Person x: queue) {
				if(x.priority > tmp.priority) {
					queue.offer(tmp);
					tmp = null;
					break;
				}
			}
			
			if(tmp!=null) {
				answer++;
				if(tmp.id == m) return answer;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		ER T = new ER();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.print(T.solution(n, m, arr));
	}

}
