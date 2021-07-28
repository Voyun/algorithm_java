package array;
import java.util.*;

public class PrimeNumbers {

	public int solution(int n) {
		int answer = 0;
		
		int[] Nums = new int[n+1];
		
		for(int i=2; i<=n; i++) {
			
			if(Nums[i] == 0) {
				answer ++;
				for(int j=0; j<=n; j=i+j) {
					Nums[j] = 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
	
		PrimeNumbers T = new PrimeNumbers();
		Scanner kb = new Scanner(System.in);
		int input = kb.nextInt();
		System.out.println(T.solution(input));
	}

}
