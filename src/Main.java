import java.util.Scanner;

import javax.jws.soap.SOAPBinding;
import javax.swing.BoundedRangeModel;

public class Main {
	private static Store storeObj  = new Store();
	public static void showMenu() {
		System.out.println("LIST MENU");
		System.out.println("1. Add Book");
		System.out.println("2. Edit Book");
		System.out.println("3. Find Book");
		System.out.println("4. Delete Book");
		System.out.println("5. List Book");
		System.out.println("6. Exit");
		System.out.println("Your's choise [1-6]:");
	}
	
	public static void addBook() {
		if(storeObj.checkFull() == false) {
			Scanner scan = new Scanner(System.in);
			
			String bookName = "";
			String bookID = "";
			double bookPrice = 0;
			
			
			System.out.println("Nhập mã sách: ");
			bookID = scan.nextLine();
			
			System.out.println("Nhập tên sách: ");
			bookName = scan.nextLine();
			
			
			System.out.println("Nhập giá tiền sách: ");
			bookPrice = Double.parseDouble(scan.nextLine());
			
			Book bookObj = new Book(bookName, bookID, bookPrice);
			
			storeObj.add(bookObj);
		}else {
			System.out.println("Store is full!");
		}
		
	}
	
	public static void listBook() {
		storeObj.list();
	}
	public static void findBook() {
		Scanner scan = new Scanner(System.in);
		
		String bookID = "";
		 System.out.println("Nhập ID sách: ");
		 bookID = scan.nextLine();
		 
		 storeObj.find(bookID);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		int functionID = 0;
		boolean flag = true;
		do {
			showMenu();
			functionID = Integer.parseInt(scan.nextLine());
			
			switch (functionID) {
				case 1:
					addBook();
					break;
				case 4:
					findBook();
					break;
				case 5:
					listBook();
					break;
				
				default:
					break;
			}
			
		} while (flag == true);
	}

}
