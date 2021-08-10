package two_pointer__sliding_window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindCommonNums {
	
	public ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB){
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		
		 Arrays.sort(arrA);
		 Arrays.sort(arrB);
		 
		 while(p1<n && p2<m) {
			 if(arrA[p1] == arrB[p2]) {
				 answer.add(arrA[p1++]);
				 p2++;
			 } else if(arrA[p1] < arrB[p2]) {
				 p1++;
			 } else {
				 p2++;
			 }
		 }
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		FindCommonNums T = new FindCommonNums();
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
