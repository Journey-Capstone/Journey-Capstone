package com.journey.journeycapstone.repositories;

import com.journey.journeycapstone.models.Review;
import com.journey.journeycapstone.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long>{
    Review findReviewByBookTitle(String book_title);

    Review findReviewByReviewTitle(String review_title);

    List<Review> findAllByUser(User user);
}
