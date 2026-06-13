package DAY11.LearningCollections.BrowserHistory;
import java.util.*;

public class BrowserHistory {

    List<String> history = new ArrayList<>();
    int currentIndex = -1;

    // Visit a page
    public void visitPage(String page) {

        // Remove forward history
        while(history.size() > currentIndex + 1) {
            history.remove(history.size() - 1);
        }

        history.add(page);
        currentIndex++;

        System.out.println("Visited: " + page);
    }

    // Go Back
    public void goBack() {

        if(currentIndex > 0) {
            currentIndex--;
            System.out.println("Current Page: "
                    + history.get(currentIndex));
        }
        else {
            System.out.println("No Previous Page");
        }
    }

    // Go Forward
    public void goForward() {

        if(currentIndex < history.size() - 1) {
            currentIndex++;
            System.out.println("Current Page: "
                    + history.get(currentIndex));
        }
        else {
            System.out.println("No Forward Page");
        }
    }

    // Display History
    public void displayHistory() {

        System.out.println("Browser History:");

        for(String page : history) {
            System.out.println(page);
        }
    }
}