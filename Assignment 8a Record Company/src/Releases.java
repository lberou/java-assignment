import java.util.*;

public class Releases {
    private int id;
    private Artist artist;
    private String title;
    private List<Song> songs;

    private String type;

    public String getType() {
        return type;
    }

    private static int maxCd = 5;
    private static int maxMp3 = 1;


    public Releases(int id, Artist artist, String title, String type) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.type = type;
        songs = new ArrayList<>();
    }


    public static int getMaxCd() {
        return maxCd;
    }

    public static int getMaxMp3() {
        return maxMp3;
    }

    public int getId() {
        return id;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Releases releases = (Releases) o;
        return id == releases.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
