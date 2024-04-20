import java.util.Objects;

public class Artist {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public Artist(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Artist(String name) {
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(name, artist.name) && Objects.equals(type, artist.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
