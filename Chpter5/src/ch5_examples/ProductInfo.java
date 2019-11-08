package ch5_examples;

import java.util.InputMismatchException;
import java.util.Scanner;

class Product{
	Scanner sc = new Scanner(System.in);
	private static int x=0;
	private int id; //고유한 식별자
	private String category; //상품 설명
	private String productor; //생산자
	private int price=0; //가격
	
	
	public Product() { //서브클래스들보다 Product(슈퍼클래스)의 생성자가 먼저 출력됨!
		try{
			System.out.print("상품 설명>>");
			setCategory(sc.nextLine());
			System.out.print("생산자>>");
			setProductor(sc.nextLine());
			System.out.print("가격>>");
			setPrice(sc.nextInt());
		}catch(InputMismatchException e){ 
			System.out.println("잘못입력하셨습니다.");
		}
		x++;
	}
	protected void setId(){id = x;}
	protected void setCategory(String s){category=s;}
	protected void setProductor(String s){productor=s;}
	protected void setPrice(int s){price=s;}
	
	protected int getId(){return id;}
	protected String getCategory(){return category;}
	protected String getProductor(){return productor;}
	protected int getPrice(){return price;}
}

class Book extends Product{ //책
	Scanner sc = new Scanner(System.in);
	private int ISBN; 
	private String author;
	private String bookName;
	
	public Book() {
		try{
			System.out.print("책 제목>>");
			setBookName(sc.nextLine());
			System.out.print("저자>>");
			setAuthor(sc.nextLine());
			System.out.print("ISBN>>");
			setISBN(sc.nextInt());
		}catch(InputMismatchException e){ 
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	protected void setBookName(String s){bookName=s;}
	protected void setAuthor(String s){author=s;}
	protected void setISBN(int x){ISBN=x;}
	
	protected String getBookName(){return bookName;}
	protected String getAuthor(){return author;}
	protected int getISBN(){return ISBN;}
}

class ConversationBook extends Book{ //회화책
	Scanner sc = new Scanner(System.in);
	private String language;

	public ConversationBook() {
		try{
			System.out.print("언어>>");
			setLanguage(sc.next());
		}catch(InputMismatchException e){ 
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	protected void setLanguage(String s){language=s;}
	protected String getLanguage(){return language;}
}

class CompactDisc extends Product{ //음악	CD
	Scanner sc = new Scanner(System.in);
	private String albumName; //앨범 제목
	private String singer; //가수
	
	public CompactDisc() {
		try{
			System.out.print("앨범 제목>>");
			albumName = sc.nextLine();
			System.out.print("가수>>");
			singer = sc.nextLine();
		}catch(InputMismatchException e){ 
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	protected void setAlbumName(String s){albumName=s;}
	protected void setSinger(String s){singer=s;}
	
	protected String getAlbumName(){return albumName;}
	protected String getSinger(){return singer;}
}

public class ProductInfo {
	Scanner sc = new Scanner(System.in);
	
	public static void inquiry(Product p){ //조회
		System.out.println("상품 설명>>"+p.getCategory());
		System.out.println("생산자>>"+p.getProductor());
	
		if(p instanceof Book){ //책
			Book ex_B = (Book)p;
			System.out.println("ISBN>>"+ex_B.getISBN());
			System.out.println("저자>>"+ex_B.getAuthor());
			System.out.println("책 제목>>"+ex_B.getBookName());
		}
		if(p instanceof ConversationBook){ //영어회화책
			ConversationBook ex_CB = (ConversationBook)p;
			System.out.println("언어>>"+ex_CB.getLanguage());
		}
		if(p instanceof CompactDisc){ //CD
			CompactDisc ex_CD = (CompactDisc)p;
			System.out.println("앨범 제목>>"+ex_CD.getAlbumName());
			System.out.println("가수>>"+ex_CD.getSinger());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] p = new Product[10];
		Book[] book = new Book[10]; //roductMenu==1
		CompactDisc[] cd = new CompactDisc[10]; //roductMenu==2
		ConversationBook[] cv = new ConversationBook[10]; //roductMenu==3
		int menu=0, productMenu=0;
		int count=0; //count for counting the num of the products
		
		
		do{
			System.out.print("상품 추가<1>, 모든 상품 조회<2>, 끝내기<3>>>"); //menu
			menu = sc.nextInt();
			
			switch(menu){
				case 1:
					System.out.print("상품 종류 책<1>, 음악CD<2>, 회화책<3>>>"); //productMenu
					productMenu = sc.nextInt();
					
					if(count<10){
						if(menu==1 && productMenu==1){
							p[count] = new Book();
							book[count] = (Book) p[count];
							book[count].setId();
							count++; 
						} else if(menu==1 && productMenu==2){
							p[count] = new CompactDisc();
							cd[count] = (CompactDisc) p[count];
							count++;
						} else if(menu==1 && productMenu==3){
							p[count] = new ConversationBook();
							cv[count] = (ConversationBook) p[count];
							count++; 
						}
					}
					break;
				
				case 2:
					//p[a]의 a의 값이 id값과 매칭됨
					for(int i=0; i<count; i++){
						System.out.print("상품ID(0~"+(count-1)+")>>");
						int a = sc.nextInt();
						if(a>=count){
							System.out.println("잘못입력하셨습니다.");
							i--;
						}
						
						if(p[a] instanceof ConversationBook && p[a] instanceof Book){ //ConversationBook
							inquiry(cv[a]);
						} else if(p[a] instanceof Book && !(p[a] instanceof ConversationBook)){ //Book
							inquiry(book[a]);
						} else if(p[a] instanceof CompactDisc){ 
							inquiry(cd[a]);
						} System.out.println();
					}
					break;
				
				case 3: //exit
					System.exit(0);
					break;
					
			}
			
			if(count>=10)
				System.out.println("데이터공간이 부족합니다.(10/10)");
				
			System.out.println();
			
		} while(count<10);	
	}
}
