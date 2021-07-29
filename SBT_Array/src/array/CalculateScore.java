package array;
import java.util.*;

public class CalculateScore {

	public int solution(int num, int[] arr) {
		int answer = 0;
		int cnt = 0;
		
		for(int i=0; i<num; i++) {
			if(arr[i] == 1) {
				cnt ++; 
				answer += cnt;
			} else {
				cnt = 0;
			}
		}
	
		return answer;
	}
	
	public static void main(String[] args) {
		CalculateScore T = new CalculateScore();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++){
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(num, arr));
	}

}
