package JavaAlgorithm;


public class Link {

	public String bookName;
	public int millionSold;
	
	public Link next;
	
	public Link (String bookName, int millionSold) {
		this.bookName = bookName;
		this.millionSold = millionSold;
	}
	
	public void display() {
		System.out.println(bookName + " : " + millionSold + ",000,000");
	}
	
	public String toString() {
		return bookName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList theLinkList = new LinkList();
		
		theLinkList.insertLink("AAA", 500);
		theLinkList.insertLink("BBB", 600);
		theLinkList.insertLink("CCC", 700);
		theLinkList.insertLink("DDD", 800);
		theLinkList.insertLink("EEE", 900);
		
		System.out.println("Remove first value: ");
		theLinkList.removeFirst();
		theLinkList.display();
		
		System.out.println("Remove last value: ");
		theLinkList.removeLast();
		theLinkList.display();
		System.out.println("Remove last value: ");
		theLinkList.removeLast();
		theLinkList.display();
		System.out.println("Remove last value: ");
		theLinkList.removeLast();
		theLinkList.display();
		System.out.println("Remove last value: ");
		theLinkList.removeLast();
		theLinkList.display();
		
	}
}

class LinkList {
	
	public Link firstLink;
	
	LinkList() {
		firstLink = null;
	}
	
	public boolean isEmpty() {
		return (firstLink == null);
	}
	
	public void insertLink(String bookName, int millionSold) {
		Link theLink = firstLink;
		Link newLink = new Link(bookName, millionSold);
		if(firstLink == null) {
			firstLink = newLink;
		}
		else {
			while(theLink.next != null) {
				theLink = theLink.next;
			}
			theLink.next = newLink;
		}
		//Link newLink = new Link(bookName, millionSold);
		//newLink.next = firstLink;
		//firstLink = newLink;
	}
	
	public Link removeFirst() {
		Link linkRef = firstLink;
		if(!isEmpty()) {
			firstLink = firstLink.next;
		}
		else {
			System.out.println("Empty LinkList");
		}
		return linkRef;
		
	}
	
	public Link removeLast() {
		Link curLink = firstLink;
		Link preLink = firstLink;
		
		while(curLink.next != null){
			preLink = curLink;
			curLink = curLink.next;
		}
		if(curLink == preLink) {
			System.out.println("Empty LinkList");
			preLink = null;
		}
		else {
			preLink.next = null;
		}
		
		
		return preLink;		
	}
	
	public void display() {
		Link theLink = firstLink;
		
		while(theLink != null) {
			theLink.display();
			System.out.println("Next Link: " + theLink.next);
			
			theLink = theLink.next;
			System.out.println();
		}
	}
	
	public Link find(String bookName) {
		Link theLink = firstLink;
		
		while(!isEmpty()) {
			if(theLink.bookName != bookName) {
				if(theLink.next == null) {
					return null;
				}
				theLink = theLink.next;
			}
			else {
				break;
			}
		}
		return theLink;
	}
	
	public Link remove(String bookName) {
		Link currLink = firstLink;
		Link preLink = firstLink;
		while(currLink.bookName != bookName) {
			if (currLink.next == null) {
				return null;
			}
			else {
				preLink = currLink;
				currLink = currLink.next;
			}
		}
		
		if (currLink == firstLink) {
			firstLink = firstLink.next;
		}
		else {
			preLink.next = currLink.next;
		}

		return currLink;
	}
 
}
