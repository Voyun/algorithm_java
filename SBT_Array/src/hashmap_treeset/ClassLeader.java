package hashmap_treeset;
import java.util.*;

public class ClassLeader {
	
	public char solution(int n, String s) {
		char answer = ' ';
		int max = Integer.MIN_VALUE;
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x: s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		for(char key: map.keySet()) {
			if(map.get(key)> max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ClassLeader T = new ClassLeader();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		
		System.out.print(T.solution(n, str));

	}

}
