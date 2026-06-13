package LearningCollections.ProductReview;

import java.util.*;

public class ReviewService {

    List<Review> reviews = new ArrayList<>();

    // Add Review
    public void addReview(Review review) {
        reviews.add(review);
    }

    // Search Review by Product
    public void toSearchAReviewByProduct(String productName) {

        for (Review r : reviews) {
            if (r.product.equalsIgnoreCase(productName)) {
                System.out.println(r);
            }
        }
    }

    // Update Comment by Review ID
    public void toUpdateACommentByID(int id, String newComment) {

        for (Review r : reviews) {
            if (r.reviewId == id) {
                r.comments = newComment;
                System.out.println("Comment Updated Successfully");
                return;
            }
        }

        System.out.println("Review ID Not Found");
    }

    // Sort Reviews by ID
    public void toSortReviewListByID() {

        Collections.sort(reviews,
                (r1, r2) -> Integer.compare(r1.reviewId, r2.reviewId));

        System.out.println("Sorted Reviews:");
        for (Review r : reviews) {
            System.out.println(r);
        }
    }

    // Display Reviews
    public void displayReviews() {
        for (Review r : reviews) {
            System.out.println(r);
        }
    }
}