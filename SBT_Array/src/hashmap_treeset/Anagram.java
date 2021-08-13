package hashmap_treeset;
import java.util.*;

public class Anagram {
	public String solution (String a, String b) {
		String answer = "YES";
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x: a.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for(char x: b.toCharArray()) {
			if(!map.containsKey(x) || map.get(x)==0) return "NO";
			map.put(x, map.get(x)-1);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Anagram T = new Anagram();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		
		System.out.print(T.solution(a, b));

	}

}
