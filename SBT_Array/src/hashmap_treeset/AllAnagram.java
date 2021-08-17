package hashmap_treeset;
import java.util.*;

public class AllAnagram {

	public Integer solution(String s, String t) {
		int answer = 0;
		int lt =0;
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		HashMap<Character, Integer> Smap = new HashMap<>();
		
		for(char x: t.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		for(int i=0; i<t.length()-1; i++) {
			Smap.put(s.charAt(i), Smap.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(int rt=t.length()-1; rt<s.length(); rt++) {
			Smap.put(s.charAt(rt), Smap.getOrDefault(s.charAt(rt), 0)+1);
			if(Smap.equals(map)) {
				answer++;
			}
			Smap.put(s.charAt(lt), Smap.getOrDefault(s.charAt(lt), 0)-1);
			if(Smap.get(s.charAt(lt))==0) Smap.remove(s.charAt(lt));
			lt ++; 
			
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		AllAnagram T = new AllAnagram();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();
		
		System.out.print(T.solution(s, t));
	}

}
