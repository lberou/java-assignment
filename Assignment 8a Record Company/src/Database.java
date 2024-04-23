import java.util.*;

public class Database {
    private List<Artist> artists;
    private static List<Releases> releases;
    private List<Song> songs;

    public List<Song> getSongs() {
        return songs;
    }

    public List<Releases> getReleases() {
        return releases;
    }



    public List<Artist> getArtists() {
        return artists;
    }

    public Database() {
        artists = new ArrayList<>();
        releases = new ArrayList<>();
        songs = new ArrayList<>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public static void addRelease(Releases release) {
        releases.add(release);
    }

    public void addSong(Song song) {
        songs.add(song);

    }


}
