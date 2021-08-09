package array;
import java.util.Arrays;
import java.util.Scanner;

public class Mentoring {

	public int solution(int student, int test, int[][] arr) {
		int answer = 0;
		
		/// 4�� for�� �̿� - ������ ��� ����Ǽ��� ���ؼ� ���� �������� �ƴ��� Ȯ���ϴ� ��� ///
		/// �迭�� ��� �� ���� - 144ms ///
		
		for(int i=1; i<=student; i++) {
			
			for(int j=1; j<=student; j++) {  // student * student : ��� ����� ��
				int cnt = 0;
				for(int k=0; k<test; k++) {
					int pi=0, pj=0; // i�л��� ���, j�л��� ���
					for(int s=0; s<student; s++){
						if(arr[k][s]==i) pi=s; // ���� ���϶� �ش��ϴ� ������ ���
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==test) { // ��� test���� ����� ���� ����϶�
					answer ++;
				}
			}
			
		}
	
		
		/// 3�� for���� �ϳ��� �迭�� �̿��ؼ� Ǯ��  ///
		/// �迭�� �־ �� ���� - 279ms ///
		
		
		/*int[] mentee = new int[student];
		
		for(int i=0; i<student; i++) {
		
			Arrays.fill(mentee, 1);  // ��Ƽ�� 1�� ���� 
			
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