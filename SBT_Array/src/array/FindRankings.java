package array;
import java.util.*;

public class FindRankings {

	public ArrayList<Integer> solution (int num, int arr[]){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int cnt = 1; 
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(arr[i] < arr[j]) {
					cnt ++;
				}
			}
			
			answer.add(cnt);
			cnt = 1; 
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		FindRankings T = new FindRankings();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x: T.solution(num, arr)) {
			System.out.print(x+ " ");
		}
	}

}
