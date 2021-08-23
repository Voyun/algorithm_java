package stack_queue;
import java.util.*;

public class ClawMachine {

	public Integer solution (int n, int[][] boards, int m, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<m; i++) {
			int col = moves[i]-1;
			for(int j=0; j<n; j++) {
				if(boards[j][col] != 0 ) {
					int tmp = boards[j][col];
					boards[j][col] = 0;
					if(!stack.isEmpty() && stack.peek() == tmp) {
						stack.pop();
						answer += 2;
					} else stack.push(tmp);	
					break;
				}
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		ClawMachine T = new ClawMachine();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m; i++) {
			moves[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(n, board, m, moves));

	}

}
