
public class Book {
	String title;
	String author;
	int ISBN;
	
	public Book(String t, String a, int i) {
		// TODO Auto-generated constructor stub
		this.title=t;
		this.author=a;
		this.ISBN=i;
	}
	
	public String getTitle(){return this.title;}
	public String getAuthor(){return this.author;}
	public int getIsbn(){return this.ISBN;}
	
	
	public static void main(String args[]){
		Book book = new Book("One-sided love", "Higashinogeigo", 8888);
		System.out.println(book.getTitle()+"책의 저자는 "+book.getAuthor()+"이며, "+book.getIsbn()+"번으로 나눠집니다." );
	}
}
