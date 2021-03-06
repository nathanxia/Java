package google;
import java.util.*;

public class Trie {

	private class TrieNode {
		Map<Character, TrieNode> children;
		boolean end;
		public TrieNode() {
			children = new HashMap<>();
			end = false;
		}
	}
	
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public void addWord(String word) {
		TrieNode current = root;
		for (Character c : word.toCharArray()) {
			if (!current.children.containsKey(c)) {
				TrieNode newNode = new TrieNode();
				current.children.put(c, newNode);
			}
			current = current.children.get(c);
		}
		current.end = true;
	}
	
	public boolean exactMatch(String word) {
		TrieNode current = root;
		for (Character c : word.toCharArray()) {
		
			if (!current.children.containsKey(c)) {
				return false;
			}
			else {
				current = current.children.get(c);
			}
		}
		if (current.end == true) {
			return true;
		}
		
		return false;
	}
	
	public boolean findPrefix(String prifix) {
		TrieNode current = root;
		for (Character c : prifix.toCharArray()) {
		
			if (!current.children.containsKey(c)) {
				return false;
			}
			else {
				current = current.children.get(c);
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ban";
		
		Trie map = new Trie();
		map.addWord("banana");
		map.addWord("apple");
		map.addWord("orange");

		System.out.println(map.exactMatch(str));
		System.out.println(map.findPrefix(str));
		
	}

}
