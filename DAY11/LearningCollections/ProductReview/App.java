package LearningCollections.ProductReview;

public class App {
    public static void main(String[] args) {
        ReviewService rs = new ReviewService();

        rs.addReview(new Review(103, "Laptop", "Excellent"));
        rs.addReview(new Review(101, "Mouse", "Good"));
        rs.addReview(new Review(105, "Laptop", "Worth Buying"));
        rs.addReview(new Review(102, "Keyboard", "Average"));

        System.out.println("All Reviews:");
        rs.displayReviews();

        System.out.println("\nSearch Review By Product (Laptop):");
        rs.toSearchAReviewByProduct("Laptop");

        System.out.println("\nUpdate Comment:");
        rs.toUpdateACommentByID(102, "Very Good");

        System.out.println("\nAfter Update:");
        rs.displayReviews();

        System.out.println("\nSort Reviews By ID:");
        rs.toSortReviewListByID();
    }
}