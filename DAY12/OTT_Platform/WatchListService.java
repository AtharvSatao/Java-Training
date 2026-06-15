package DAY12.OTT_Platform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WatchListService {

    List<String> movies = new ArrayList<>();

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void addMultipleMovies(List<String> movieList) {
        movies.addAll(movieList);
    }

    public void removeMovie(String movie) {
        if (movies.remove(movie)) {
            System.out.println(movie + " removed successfully.");
        } else {
            System.out.println(movie + " not found.");
        }
    }

    public void replaceMovie(String oldMovie, String newMovie) {
        int index = movies.indexOf(oldMovie);

        if (index != -1) {
            movies.set(index, newMovie);
            System.out.println(oldMovie + " replaced with " + newMovie);
        } else {
            System.out.println(oldMovie + " not found.");
        }
    }

    public void displayMovies() {
        System.out.println("\nWatch List:");
        for (String movie : movies) {
            System.out.println(movie);
        }
    }

    public void displayMoviesInReverse() {
        System.out.println("\nMovies in Reverse Order:");

        for (int i = movies.size() - 1; i >= 0; i--) {
            System.out.println(movies.get(i));
        }
    }

    public void sortMovies() {
        Collections.sort(movies);

        System.out.println("\nMovies Sorted Alphabetically:");
        for (String movie : movies) {
            System.out.println(movie);
        }
    }

    public void displayMoviesStartingWith(char ch) {
        System.out.println("\nMovies Starting With '" + ch + "':");

        for (String movie : movies) {
            if (movie.toLowerCase().startsWith(
                    String.valueOf(ch).toLowerCase())) {

                System.out.println(movie);
            }
        }
    }

    public void countMoviesContainingKeyword(String keyword) {

        int count = 0;

        for (String movie : movies) {
            if (movie.toLowerCase().contains(
                    keyword.toLowerCase())) {

                count++;
            }
        }

        System.out.println(
                "\nMovies containing \"" + keyword + "\" : " + count);
    }

    public void displayDuplicateMovies() {

        System.out.println("\nDuplicate Movies:");

        boolean found = false;

        for (int i = 0; i < movies.size(); i++) {

            for (int j = i + 1; j < movies.size(); j++) {

                if (movies.get(i).equalsIgnoreCase(movies.get(j))) {
                    System.out.println(movies.get(i));
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No Duplicate Movies Found.");
        }
    }

    public void removeDuplicateMovies() {

        for (int i = 0; i < movies.size(); i++) {

            for (int j = i + 1; j < movies.size(); j++) {

                if (movies.get(i).equalsIgnoreCase(movies.get(j))) {

                    movies.remove(j);
                    j--;
                }
            }
        }

        System.out.println("\nDuplicate Movies Removed.");
    }
}