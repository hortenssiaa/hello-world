package practice4_4;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song(){}
	public Song(String a, String t){
		artist = a;
		title = t;
	}
	public void setDetails(String a, String c, int y, int tr){
		album = a;
		composer = c;
		year = y;
		track = tr;
	}
	public void show(){
		System.out.println("가수 "+artist+"의 노래 "+title+"에 대한 정보입니다.");
		System.out.println("앨범이름:"+album);
		System.out.println("작곡가:"+composer);
		System.out.println("노래 발표된 연도:"+year);
		System.out.println(track+"번 트랙에 있음");
	}
	
	public static void main(String[] args) {
		Song s1 = new Song("ABBA", "Dancing Queen");
		s1.setDetails("arrival", "ABBA", 1977, 2);
		s1.show();
	}

}
