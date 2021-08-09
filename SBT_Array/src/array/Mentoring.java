package array;
import java.util.Arrays;
import java.util.Scanner;

public class Mentoring {

	public int solution(int student, int test, int[][] arr) {
		int answer = 0;
		
		/// 4중 for문 이용 - 가능한 모든 경우의수를 구해서 각각 가능한지 아닌지 확인하는 방법 ///
		/// 배열이 없어서 더 빠름 - 144ms ///
		
		for(int i=1; i<=student; i++) {
			
			for(int j=1; j<=student; j++) {  // student * student : 모든 경우의 수
				int cnt = 0;
				for(int k=0; k<test; k++) {
					int pi=0, pj=0; // i학생의 등수, j학생의 등수
					for(int s=0; s<student; s++){
						if(arr[k][s]==i) pi=s; // 같은 값일때 해당하는 순서가 등수
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==test) { // 모든 test에서 등수가 높은 경우일때
					answer ++;
				}
			}
			
		}
	
		
		/// 3중 for문과 하나의 배열을 이용해서 풀기  ///
		/// 배열이 있어서 더 느림 - 279ms ///
		
		
		/*int[] mentee = new int[student];
		
		for(int i=0; i<student; i++) {
		
			Arrays.fill(mentee, 1);  // 멘티를 1로 고정 
			
			for(int j=0; j<test; j++) {
					
				for(int k=0; k<student; k++) {
					if(arr[j][k] == (i+1)) {
						mentee[arr[j][k]-1] = 0;
						break;
					}
					mentee[arr[j][k]-1] = 0;
				}
			}
			answer += Arrays.stream(mentee).sum();
		}*/
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Mentoring T = new Mentoring();
		Scanner kb = new Scanner(System.in);
		int student = kb.nextInt();
		int test = kb.nextInt();
		int[][] arr = new int[test][student];
		
		for(int i=0; i<test; i++) {
			for(int j=0; j<student; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.print(T.solution(student, test,  arr));
	}

}