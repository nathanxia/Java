
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
		
		theLinkList.insertFirstLink("AAA", 500);
		theLinkList.insertFirstLink("BBB", 600);
		theLinkList.insertFirstLink("CCC", 700);
		theLinkList.insertFirstLink("DDD", 800);
		theLinkList.insertFirstLink("EEE", 900);
		
		theLinkList.removeFirst();
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
	
	public void insertFirstLink(String bookName, int millionSold) {
		Link newLink = new Link(bookName, millionSold);
		newLink.next = firstLink;
		firstLink = newLink;
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
