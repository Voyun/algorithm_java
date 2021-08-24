package stack_queue;
import java.util.*;

public class SavingPrincess {
	
	public Integer solution(int n, int k) {
		int answer = 0 ;
		int cnt = k; 
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=n; i++) queue.offer(i);
		
		while(queue.size()>1) {
			int tmp = queue.poll();
			if(cnt==1) {
				cnt = k; 
			} else {
				queue.offer(tmp);
				cnt--;
			}
		}
		
		answer = queue.peek();
		
		/*
		while(!queue.isEmpty()) {
			for(int i=1; i<k; i++) queue.offer(queue.poll());
			queue.poll();
			if(queue.size() == 1 ) answer = queue.poll();
		}
		*/
	
		return answer;
	}

	public static void main(String[] args) {
		SavingPrincess T = new SavingPrincess();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();

		System.out.print(T.solution(n, k));
	}

}
