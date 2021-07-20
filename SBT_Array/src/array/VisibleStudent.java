package array;
import java.util.*;

public class VisibleStudent {
	
	public String solution(int n, int[] arrA, int[] arrB) {
		String answer = "";
		
		for(int i=0; i<n; i++) {
			if(arrA[i] - arrB[i] == 1 || arrA[i] - arrB[i] == -2 )
				answer+= "A";
			else if(arrA[i] - arrB[i] == -1 || arrA[i] - arrB[i] == 2)
				answer+= "B";
			else
				answer+= "D";
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		VisibleStudent T = new VisibleStudent();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		
		for(int i=0; i<n; i++) {
			arrA[i] = kb.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			arrB[i] = kb.nextInt();
		}
		
		for(char x: T.solution(n, arrA, arrB).toCharArray())
			System.out.println(x);
		
		
	}

}
