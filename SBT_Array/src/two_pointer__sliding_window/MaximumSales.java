package two_pointer__sliding_window;

import java.util.Scanner;

public class MaximumSales {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int p1 = m, p2 = 0 ;
		int tmp = 0;
		
		for(int i=0; i<m; i++) answer += arr[i];
		tmp = answer;
		
		while(p1<n) {
			tmp = tmp + arr[p1++] - arr[p2++];
			
			if(answer < tmp) answer = tmp;	
		}
		
		/*FOR¹®*/
		/*
		 for(int i=m; i<n; i++) {
		 	sum += (arr[i]-arr[i-k]);
		 	answer = Math.max(answer, sum);
		 }
		 */
		 
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		MaximumSales T = new MaximumSales();
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
