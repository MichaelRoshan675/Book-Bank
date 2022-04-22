package Duplication;
import java.util.*;
public class duplicate {
	public static String getString(Scanner sc) { 
		return sc.nextLine();
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> book = new HashSet<String>();
		List<Book> book_rate = new ArrayList<Book>();
		int book_id = 001;
		while(true)
		{
			System.out.println("\n1.Press 'b' for Add a Book..\n2.Press 'd' for Details..\n3.Press 'q' to quit.." );
			char choice = sc.next().charAt(0);
			switch(choice) {
			case 'b' :  System.out.println("Enter the name of the book: ");
						String B_Name = sc.next();
						book.add(B_Name);
						break;
						
			case 'd' :  for(String bk : book) {
							Book b = new Book(bk,book_id);
							book_rate.add(b);
							book_id++;
						}
						for (Book bk  : book_rate) {
							System.out.println("\nBook Name : "+bk.Book_name+"\nBook Id : "+bk.Book_id);
							if(rate.ANOHANA.get_Book_Name().equals(bk.Book_name)) {
								System.out.println("Book Rate : $"+rate.ANOHANA.get_Book_rate()+"\nAuthor Name : "+rate.ANOHANA.get_Author_Name());
							}
							else if(rate.SILENT_VOICE.get_Book_Name().equals(bk.Book_name)) {
								System.out.println("Book Rate : $"+rate.SILENT_VOICE.get_Book_rate()+"\nAuthor Name : "+rate.SILENT_VOICE.get_Author_Name());
							}
							else {
								System.out.println("Book Rate : $200"+"\nAuthor Name : Unknown");
							}
						}
						break;
						
			case 'q' : System.exit(0);		
			            
			default :   System.out.println("Enter valid Options..");
						break;
			}
		}
	}
}
