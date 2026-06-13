package LearningCollections.ProductReview;

public class Review {
    int reviewId;
    String product;
    String comments;

    public Review(int reviewId, String product, String comments) {
        this.reviewId = reviewId;
        this.product = product;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Review ID: " + reviewId +
                ", Product: " + product +
                ", Comments: " + comments;
    }
}