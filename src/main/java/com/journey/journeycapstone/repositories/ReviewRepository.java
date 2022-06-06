package com.journey.journeycapstone.repositories;

import com.journey.journeycapstone.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long>{
//    Review findReviewBy(String book_title);
}
