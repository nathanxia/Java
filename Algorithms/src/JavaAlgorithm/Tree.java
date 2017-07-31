package JavaAlgorithm;

public class Tree {

	public int value;
	
	public Tree left;
	public Tree right;
	
	public Tree(int val) {
		this.value = val;
		left = null;
		right = null;
	}
	
	public void display() {
		System.out.println(this.value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree tree = new BinaryTree();
		
		tree.insertValue(10);
		tree.insertValue(5);
		tree.insertValue(15);
		tree.insertValue(1);
		tree.insertValue(7);
		tree.insertValue(12);
		tree.insertValue(16);
		tree.insertValue(22);
		tree.insertValue(8);
		tree.insertValue(0);
		tree.insertValue(11);
		tree.insertValue(14);
		tree.insertValue(17);
		tree.insertValue(2);
		tree.insertValue(6);
		System.out.println("=====================================");
		tree.display();
		
		System.out.println("=====================================");
		System.out.println("Current tree size is: " + tree.getSize());
		
		System.out.println("=====================================");
		tree.remove(2);
		tree.remove(5);
		tree.remove(7);
		tree.remove(12);
		tree.remove(15);
		tree.display();
		System.out.println("Current tree size is: " + tree.getSize());
		
	}

}

class BinaryTree {
	public Tree Btree;
	
	BinaryTree() {
		Btree = null;
	}
	
	public boolean isEmpty() {
		return Btree == null;
	}
	
	public void insertValue(int val) {
		Tree theTree = Btree;
		Btree = insertchildren(theTree, val);
	}
	
	public void display() {
		displayChildren(Btree);
	}
	
	public void remove(int val) {
		Tree curTree = Btree;
		Btree = removeValue(curTree, val);
		System.out.println(val + " deleted");
	}
	
	public int getSize() {
		int sizeNum = 0;
		return getSizeValue(Btree, sizeNum);
	}
	
	private Tree insertchildren(Tree theTree, int val) {
		if (theTree == null) {
			Tree newTree = new Tree(val);
			theTree = newTree;
			System.out.println("Value inserted: " + val);
		}
		else {
			System.out.println(theTree.value);
			if (val > theTree.value) {
				System.out.println("Go right: ");
				theTree.right = insertchildren(theTree.right, val);
			}
			else {
				System.out.println("Go left: ");
				theTree.left = insertchildren(theTree.left, val);
			}
		}
		return theTree;
	}
	
	private void displayChildren(Tree theTree) {
		if (theTree.right != null) {
			displayChildren(theTree.right);
		}
		System.out.println(theTree.value);
		if (theTree.left != null) {
			displayChildren(theTree.left);
		}
		//System.out.println(theTree.value);
		

	}
	
	private Tree removeValue(Tree curTree, int val) {
		
		if (curTree.value == val) {
			if (curTree.left == null) {
				curTree = curTree.right;
			}
			else if (curTree.right == null){
				curTree = curTree.left;
			}
			else {
				curTree.value = findMinVal(curTree.right);
				curTree.right = removeValue(curTree.right, curTree.value);
				System.out.println(curTree.value + " moved");
			}
		}
		else {
			if (val > curTree.value) {
				curTree.right = removeValue(curTree.right, val);
			}
			else {
				curTree.left = removeValue(curTree.left, val);
			}
		}
		
		return curTree;
	}
	
	private int findMinVal(Tree theTree) {
		int minVal = theTree.value;
		while(true) {
			if(theTree.left != null) {
				minVal = theTree.left.value;
				theTree = theTree.left;
			}
			return minVal;
		}
	}
	
	private int getSizeValue(Tree Btree, int sizeNum) {
		
		if (Btree.left == null && Btree.right == null) {
			return sizeNum + 1;
		}
		if(Btree.left != null) {
			sizeNum = getSizeValue(Btree.left, sizeNum);
		}
		sizeNum += 1;
		if(Btree.right != null) {
			sizeNum = getSizeValue(Btree.right, sizeNum);
		}
		return sizeNum;
	}
}
