package DAY12.MusicPlaylist;
import java.util.LinkedList;
import java.util.List;

public class PlaylistService {

    LinkedList<String> playlist = new LinkedList<>();

    public void addSongAtBeginning(String song) {
        playlist.addFirst(song);
    }

    public void addSongAtEnd(String song) {
        playlist.addLast(song);
    }

    public void removeFirstSong() {
        if (!playlist.isEmpty()) {
            System.out.println("Removed: " + playlist.removeFirst());
        } else {
            System.out.println("Playlist is Empty");
        }
    }

    public void removeLastSong() {
        if (!playlist.isEmpty()) {
            System.out.println("Removed: " + playlist.removeLast());
        } else {
            System.out.println("Playlist is Empty");
        }
    }

    public void displayCurrentPlayingSong() {
        if (!playlist.isEmpty()) {
            System.out.println("Current Playing Song: " + playlist.get(0));
        } else {
            System.out.println("Playlist is Empty");
        }
    }

    public void displayPreviousSong() {
        if (playlist.size() > 1) {
            System.out.println("Previous Song: " + playlist.get(1));
        } else {
            System.out.println("No Previous Song");
        }
    }

    public void displayUpcomingSong() {
        if (playlist.size() > 1) {
            System.out.println("Upcoming Song: " + playlist.get(1));
        } else {
            System.out.println("No Upcoming Song");
        }
    }

    public void searchSong(String song) {
        if (playlist.contains(song)) {
            System.out.println(song + " Found in Playlist");
        } else {
            System.out.println(song + " Not Found");
        }
    }

    public void displayPlaylist() {
        System.out.println("\nPlaylist:");

        for (String song : playlist) {
            System.out.println(song);
        }
    }

    public void clearPlaylist() {
        playlist.clear();
        System.out.println("Playlist Cleared");
    }
}