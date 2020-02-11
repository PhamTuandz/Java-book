
public class Book {
	private String bookName = "";
	private String bookID = "";
	private double bookPrice = 0;
	
	public Book (String bookName, String bookID, double bookPrice) {
		this.setID(bookID);
		this.setName(bookName);
		this.setPrice(bookPrice);
	}
	public String getID() {
		return bookID;
	}
	public void setID(String bookID) {
		this.bookID = bookID;
	}
	
	public String getName() {
		return bookName;
	}
	public void setName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return bookPrice;
	}
	
	public void setPrice (double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public void showInfo() {
		
		System.out.println("Thông tin giá sách");
		System.out.println("Mã sách:" + this.getID());
		System.out.println("Tên sách:" + this.getName());
		System.out.println("Giá tiền: " + this.getPrice());
		 
	}
}
