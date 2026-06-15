package DAY12.OTT_Platform;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        WatchListService watchList = new WatchListService();

        watchList.addMovie("Dark");
        watchList.addMovie("Money Heist");

        watchList.addMultipleMovies(Arrays.asList(
                "Lucifer",
                "Squid Game",
                "Dark",
                "Wednesday",
                "Money Heist"
        ));

        watchList.displayMovies();

        watchList.removeMovie("Lucifer");

        watchList.replaceMovie("Squid Game", "Breaking Bad");

        watchList.displayMovies();

        watchList.displayMoviesInReverse();

        watchList.sortMovies();

        watchList.displayMoviesStartingWith('D');

        watchList.countMoviesContainingKeyword("Money");

        watchList.displayDuplicateMovies();

        watchList.removeDuplicateMovies();

        watchList.displayMovies();
    }
}