package array;
import java.util.*;

public class GridPlateMaxSum {

	public int solution(int num, int[][] arr) {
		/*
		int answer = 0;
		int n = num;
		int[] sum = new int[ num*2 + 2];
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				sum[i] += arr[i][j];
				sum[i+num] += arr[j][i];
			}
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i==j) {
					sum[2*num] += arr[i][j];
				} else if (i+j == 4) {
					sum[2*num + 1] += arr[i][j];
				}
			}
		}
		
		answer = sum[0];
		
		for(int i=0; i<num*2+2; i++) {
			if(sum[i] > answer) {
				answer = sum[i];
			}
		}
		*/
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		
		for(int i=0; i<num; i++) {
			sum1 = sum2 = 0;
			for(int j=0; j<num; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1 = sum2 = 0;
		for(int i=0; i<num; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][num-1-i];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}
	
	public static void main(String[] args) {
		GridPlateMaxSum T = new GridPlateMaxSum();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[][] arr = new int[num][num];
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.print(T.solution(num, arr));
	}
}
