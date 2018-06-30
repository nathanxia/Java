
import java.util.*;




public class test {
	
	static class TrieNode {
		TrieNode[] children;
		String word;
		
		public TrieNode() {
			children = new TrieNode[26];
			word = null;
		}
	}
   
    public static void main (String [] args) {
    	
    	Map<Integer, TrieNode> map = new HashMap<>();
    	
    	map.put(1, new TrieNode());
    	
    	TrieNode node = map.get(2);
    	
    	if (node == null) {
    		map.put(2, new TrieNode());
    		map.get(2).word = "hahaha";
    	}
    	
    	System.out.println(map.get(2).word);
    }
}
