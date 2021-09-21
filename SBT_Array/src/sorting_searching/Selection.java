package sorting_searching;
import java.util.*;

public class Selection {
	
	public void swap(int n, int m, int[] arr) {
		int tmp = arr[n];
		arr[n] = arr[m];
		arr[m] = tmp;
	}

	public int[] solution(int n, int[] arr) {
		int idx = 0; 
		
		for(int i=0; i<n; i++) {
			idx = i; 
			
			for(int j=i+1; j<n; j++) {
				if(arr[idx] > arr[j]) 
					idx = j;	
			}
			
			if(idx != i) swap(i, idx, arr);
		}
	
		return arr;
	}
	
	public static void main(String[] args) {
		Selection T = new Selection();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		for(int x : T.solution(n, arr))
			System.out.print(x + " ");
	}
}
