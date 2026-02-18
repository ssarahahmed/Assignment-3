public class Problem1Song {

    private String title;
    private String artist;
    private double length;

    public Problem1Song(String title, String artist, double length){
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public static void main(String[] args){
        Problem1Song Song = new Problem1Song("Hello", "Adele", 4.55);
        // create new song
        System.out.println("Title: " + Song.title + "\nArtist: " +
                Song.artist + "\nLength: " + Song.length);

    }

    public String toString() {
        return "Title: " + title + "\nArtist: " +
                artist + "\nLength: " + length;
    }
}
