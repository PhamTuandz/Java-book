
public class Store {
	private static int totalItems = 0;
	private final int MAX_ITEMS = 50;
	private Book[] listItems = null;
	
	public Store () {
		listItems = new Book[MAX_ITEMS];
	}
	public boolean checkFull() {
		if(totalItems == MAX_ITEMS) {
			return true;
		}
		return false;
	}
	public boolean checkEmpty() {
		if(totalItems == 0) {
			return true;
		}
		return false;
	}
	public int getItemPosition(String bookID) {
		for(int i = 0; i < totalItems; i++) {
			if(bookID.equals(listItems[i].getID()) == true){
				return i;
			}
		}
		return -1;
	}
	public void add(Book bookObj) {
		if(this.checkFull()== false) {
			this.listItems[totalItems] = bookObj;
			this.totalItems++;
			System.out.println("Add successfull");
		}else {
			System.out.println("Store if full!");
		}
		
	}
	public void list() {
		if(this.checkEmpty() == false) {
			for(int i = 0; i < totalItems; i++) {
				this.listItems[i].showInfo();
			}
		}else {
			System.out.println("Store is Empty!");
		}
		
	}
	public void find(String bookID) {
		int bookPosition = this.getItemPosition(bookID);
		if(bookPosition == -1) {
			System.out.println("This book is not exist!");
		}else {
			listItems[bookPosition].showInfo();
		}
	}
}
