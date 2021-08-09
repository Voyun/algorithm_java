package array;

import java.util.Scanner;

public class ChooseClassLeader {

	public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {
			int cnt = 0; 
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
		}
		
	
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		ChooseClassLeader T = new ChooseClassLeader();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[][] arr = new int[num+1][6];
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<6; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.print(T.solution(num, arr));
	}

}
