import java.util.Scanner;

public class UserMenu {
    static Scanner scanner = new Scanner(System.in);
    Database database = new Database();


    void displayMenu() {
        int input;


        do {
            System.out.println("Please make your choice from below:");
            System.out.println("1. Add New Artist\n" +
                    "2. Add New Release:\n" +
                    "3. Add New Song:\n" +
                    "4. Add Song To Release\n" +
                    "5. Print Artist's Releases\n6. Exit");

            input = scanner.nextInt();

            switch (input) {
                case 1:
                    addNewArtist();
                    break;
                case 2:
                    addNewRelease();
                    break;
                case 3:
                    addNewSong();
                    break;
                case 4:
                    addSongToRelease();
                    break;
                case 5:
                    printArtistReleases();

                case 6:
                    System.out.println("See you next time");

                default:
                    System.out.println("You input is not valid.Try again!");

            }

        }
        while (input != 6);
    }


    private void addNewArtist() {
        System.out.println("What is the name of the artist? :");
        String artistName = scanner.next();
        String typeOfArtist;

        do {
            System.out.println("The Artist is solo or band? Write \"solo\" if the artist is solo or write \"band\" if " +
                    "artist is band: ");
            typeOfArtist = scanner.next();
        } while (!typeOfArtist.equals("solo") && !typeOfArtist.equals("band"));

        Artist newArtist = new Artist(artistName, typeOfArtist);

        try {
            if (database.getArtists().contains(newArtist)) {
                throw new ArtistExistsException("Artist is already in database");
            } else {
                database.addArtist(newArtist);
                System.out.println(newArtist.getName() + " added to database!");
            }
        } catch (ArtistExistsException e) {
            System.out.println(e.getMessage());
        }
    }

    private void addNewRelease() {
        System.out.println("What is the release id? :");
        int releaseId = scanner.nextInt();

        System.out.print("What is the name of the artist? :");
        String artistName = scanner.next();
        Artist artist = new Artist(artistName);

        System.out.print("What is the release title? :");
        String releaseTitle = scanner.next();

        String typeOfRelease;
        System.out.println("What is the release type? :");
        do {
            System.out.println("Select release type: Write \"cd\" if it is cd or \"mp3\" if " +
                    "it is mp3: ");
            typeOfRelease = scanner.next();
        } while (!typeOfRelease.equals("cd") && !typeOfRelease.equals("mp3"));

        try {
            Releases newRelease = new Releases(releaseId, artist, releaseTitle, typeOfRelease);
            if (database.getReleases().contains(newRelease)) {
                throw new ReleaseExistsException("Release is already in database");
            } else {
                Database.addRelease(newRelease);
                System.out.println("Release added successfully!");
            }
        } catch (ReleaseExistsException e) {
            System.out.println(e.getMessage());
        }

    }

    private void addNewSong() {

        System.out.println("What is the name of the artist? :");
        String artistName = scanner.next();
        Artist artist = null;

        int counter = 0;


        while (artist == null && counter < 3) {
            for (Artist r : database.getArtists()) {
                if (r.getName().equals(artistName)) {
                    artist = r;
                    break;
                }
            }

            if (artist == null) {
                System.out.println("Artist not found in the database. Please try again.");
                System.out.println("What is the name of the artist? :");
                artistName = scanner.next();
                counter++;
            }
        }


        if (counter >= 3) {
            System.out.println("You have reached the attempts limit for providing correct artist.Please try again later");
            return;
        }

        System.out.println("What is the title of the song? :");
        String songTitle = scanner.next();

        Song newSong = new Song(artist, songTitle);

        try {
            if (database.getSongs().contains(newSong)) {
                throw new SongExistsException("Song is already in database");
            } else {
                database.addSong(newSong);
                System.out.println("Song added successfully!");

            }
        } catch (SongExistsException e) {
            System.out.println(e.getMessage());
        }


    }

    private void addSongToRelease() {
        System.out.print("What is the id of the release? :");
        int releaseId = scanner.nextInt();
        Releases release = null;

        int counter = 0;


        while (release == null && counter < 3) {
            for (Releases r : database.getReleases()) {
                if (r.getId() == releaseId) {
                    release = r;
                    break;
                }
            }

            if (release == null) {
                System.out.println("Release not found in the database. Please try again.");
                System.out.println("What is the id of the release? :");
                releaseId = scanner.nextInt();
                counter++;
            }
        }

        if (counter >= 3) {
            System.out.println("You have reached the attempts limit for providing correct release id.Please try again later");
            return;
        }

        String typeOfRelease = release.getType();
        try {
            if ((typeOfRelease.equals("cd") && database.getReleasesByType("cd").size() > Releases.getMaxCd()) || (typeOfRelease.equals("mp3") && database.getReleasesByType("mp3").size() > Releases.getMaxMp3())) {
                throw new MaxSongsException("Max Songs reached ");
            }

        } catch (MaxSongsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("What is the title of the song? :");
        String songTitle = scanner.next();

        Artist artist = release.getArtist();
        Song newSong = new Song(artist, songTitle);

        try {
            if (database.getSongs().contains(newSong)) {
                throw new SongExistsException("Song already exists in the database.");
            } else {
                release.addSong(newSong);
                database.addSong(newSong);
                System.out.println("Song added to release successfully!");
            }
        } catch (SongExistsException e) {
            System.out.println(e.getMessage());
        }


    }

    private void printArtistReleases() {
        System.out.print("What is the name of the artist? :");
        String artistName = scanner.next();
        Artist artist = null;

        int counter = 0;


        while (artist == null && counter < 3) {
            for (Artist r : database.getArtists()) {
                if (r.getName().equals(artistName)) {
                    artist = r;
                    break;
                }
            }

            if (artist == null) {
                System.out.println("Artist not found in the database. Please try again.");
                System.out.println("What is the name of the artist? :");
                artistName = scanner.next();
                counter++;
            }
        }


        if (counter >= 3) {
            System.out.println("You have reached the attempts limit for providing correct artist.Please try again later");
            return;
        }

        System.out.println("Artist's Releases:");

        for (Releases release : database.getReleases()) {
            if (release.getArtist().getName().equals(artist.getName())) {
                System.out.println("Release id: " + release.getId() + ", title: " + release.getTitle());
                System.out.println("Song List:");
                for (Song song : release.getSongs()) {
                    System.out.println("Artist: " + song.getArtist().getName() + ", title: " + song.getTitle());
                }
            }
        }


    }


}









