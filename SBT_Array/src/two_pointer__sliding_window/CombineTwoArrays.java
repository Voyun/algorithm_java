package two_pointer__sliding_window;
import java.util.*;

public class CombineTwoArrays {

	public ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB){
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0; // 각각의 배열을 가르키는 포인터 역할
	
		while(p1<n && p2<m) {
			if(arrA[p1]<arrB[p2]) 
				answer.add(arrA[p1++]); // p1++ 하면 p1의 값이 add 되고 그 후에 p1의 값이 증가함 
			else answer.add(arrB[p2++]);
		}
		
		while(p1<n) {
			answer.add(arrA[p1++]);
		}
		
		while(p2<m) {
			answer.add(arrB[p2++]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		CombineTwoArrays T = new CombineTwoArrays();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arrA = new int[n];
		for(int i=0; i<n; i++) {
			arrA[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] arrB = new int[m];
		for(int i=0; i<m; i++) {
			arrB[i] = kb.nextInt();
		}
		
		for(int x: T.solution(n, arrA, m, arrB)) {
			System.out.print(x + " ");
		}
	}
}
