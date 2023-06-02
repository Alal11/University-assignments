// 아래와 같은 필드 및 메소드를 갖는 연습문제6.Song 클래스 작성
// 구분   |    속성    |   설명
// ㅡㅡㅡㅡ|ㅡㅡㅡㅡㅡㅡㅡ|ㅡㅡㅡㅡㅡㅡㅡ
//       |   title   |   노래의 제목
// 필드   |   artist  |   가수
//       |   length  |   곡의 길이

class Song {
    // 3개 필드 저장
    private String title;
    private String artist;
    private int length;

    // 생성자 메소드인 연습문제6.Song 매개변수 초기화
    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    // getㅁㅁㅁ() 메소드는 각각 필드의 값 반환
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getLength() {
        return length;
    }

    // setㅁㅁㅁ() 메소드는 각각 필드의 값 변경
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLength(int length) {
        this.length = length;
    }
}


public class No6_1 {
    public static void main(String[] args) {
        // 연습문제6.Song 객체 생성
        Song song = new Song("Butter", "BTS", 200);

        // getㅁㅁㅁ() 메소드 호출
        System.out.println("Title: " + song.getTitle());
        System.out.println("Artist: " + song.getArtist());
        System.out.println("Legth: " + song.getLength());
        System.out.println();

        // setㅁㅁㅁ() 메소드 호출 후 getㅁㅁㅁ() 메소드 호출
        song.setTitle("Boom");
        song.setArtist("BlackPink");
        System.out.println("Title: " + song.getTitle());
        System.out.println("Artist: " + song.getArtist());
        System.out.println("Legth: " + song.getLength());
    }
}
