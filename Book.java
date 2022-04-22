package Duplication;
enum rate {
	ANOHANA("anohana","Mari Okada",450),SILENT_VOICE("silent_voice","Yoshitoki Oima",500);
	
	private String Book_Name;
	private int Book_rate;
	private String Author_name;
	
	public String get_Book_Name() {
		return this.Book_Name;
	}
	
	public int get_Book_rate() {
		return this.Book_rate;
	}
	
	public String get_Author_Name() {
		return this.Author_name;
	}
	
	private rate(String Name ,String Author_name, int rate){
		this.Book_Name = Name;
		this.Author_name = Author_name;
		this.Book_rate = rate;
	}
}
public class Book {
	String Book_name;
	int Book_id;
	
	Book(String Book_name,int Book_id){
		this.Book_name = Book_name;
		this.Book_id = Book_id;
	}
}
