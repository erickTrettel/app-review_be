package com.backend.projetofinal.SpringBootRestLastProject;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
	@Autowired
	private ReviewRepositorio rep;

	public Review getReviewById(int id) {
		Review e = null;
		try {
			e = rep.findById(id).get();
		} catch (Exception exp) {
			System.out.println(exp);
		}
		return e;
	}

	public List<Review> getAllReviews() {
		List<Review> list = new ArrayList<Review>();
		rep.findAll().forEach(e -> list.add(e));
		return list;
	}

	public synchronized Review addReview(Review e) {
		Review novo = rep.save(e);
		return novo;
	}

	public void updateReview(Review e) {
		rep.save(e);
	}

	public void deleteReview(int id) {
		rep.delete(getReviewById(id));
	}
}