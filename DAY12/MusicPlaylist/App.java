package DAY12.MusicPlaylist;

public class App {

    public static void main(String[] args) {

        PlaylistService ps = new PlaylistService();

        ps.addSongAtBeginning("Believer");
        ps.addSongAtBeginning("Shape Of You");

        ps.addSongAtEnd("Perfect");
        ps.addSongAtEnd("Faded");

        ps.displayPlaylist();

        ps.displayCurrentPlayingSong();

        ps.displayPreviousSong();

        ps.displayUpcomingSong();

        ps.searchSong("Perfect");

        ps.removeFirstSong();

        ps.removeLastSong();

        ps.displayPlaylist();

        ps.clearPlaylist();

        ps.displayPlaylist();
    }
}