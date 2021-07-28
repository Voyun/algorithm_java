package array;
import java.util.*;

public class FibonacciNumbers {

	public int[] solution(int term){
		int[] answer = new int[term];
		
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i=2; i<term; i++) {
			answer[i] = answer[i-1] + answer[i-2];	
		}
		
		return answer;
	}

	public static void main(String[] args) {
		FibonacciNumbers T = new FibonacciNumbers();
		Scanner kb = new Scanner(System.in);
		int input = kb.nextInt();
		for(int x: T.solution(input)) {
			System.out.print(x + " ");
		}
	}
}

/* 배열 쓰지 않고 손코딩 풀이 */

/*
public void solution(int term){
		
		int a=1, b=1, c;
		
		System.out.print(a + " " + b + " ");
		
		for(int i=2; i<term; i++) {
			c = a+b;
			System.out.print(c+ " ");
			a = b; 
			b = c;
		}
		
	}
	
	public static void main(String[] args) {
		FibonacciNumbers T = new FibonacciNumbers();
		Scanner kb = new Scanner(System.in);
		int input = kb.nextInt();
		T.solution(input);
	}
*/