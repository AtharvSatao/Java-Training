package DAY12.BrowserHistory;

public class App {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visitPage("Amazon");
        browser.visitPage("Flipkart");
        browser.visitPage("Netflix");
        browser.visitPage("Instagram");

        browser.displayHistory();
        browser.goBack();
        browser.goBack();
        browser.visitPage("geeksforgeeks");
        browser.goForward();

    }
}
