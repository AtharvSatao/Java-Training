package DAY11.LearningCollections.BrowserHistory;

public class App {

    public static void main(String[] args) {

        BrowserHistory bh = new BrowserHistory();

        bh.visitPage("google.com");
        bh.visitPage("youtube.com");
        bh.visitPage("github.com");

        bh.goBack();
        bh.goBack();

        bh.goForward();

        bh.visitPage("chatgpt.com");

        bh.displayHistory();
    }
}