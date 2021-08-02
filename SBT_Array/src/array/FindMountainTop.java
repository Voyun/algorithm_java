package array;
import java.util.*;

public class FindMountainTop {

	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public int solution(int n, int[][] arr) {
		int answer = 0;
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true; // 봉우리 판별 부울 변수
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		FindMountainTop T = new FindMountainTop();
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
