package com.backend.projetofinal.SpringBootRestLastProject;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerReview {
	private final static String URL = "/api/v1/review";
	@Autowired
	private ReviewService service;

	@RequestMapping("/review")
	public String index() {
		return "Hello Spring Boot";
	}

	@GetMapping(URL + "/{id}")
	public ResponseEntity<Review> getReviewById(@PathVariable("id") Integer id) {
		Review e = service.getReviewById(id);
		return new ResponseEntity<Review>(e, HttpStatus.OK);
	}

	@GetMapping(URL)
	public ResponseEntity<List<Review>> getAllReviews() {
		List<Review> list = service.getAllReviews();
		return new ResponseEntity<List<Review>>(list, HttpStatus.OK);
	}

	@PostMapping(URL)
	public ResponseEntity<Review> addReview(@RequestBody Review e) {
		Review novo = service.addReview(e);
		return new ResponseEntity<Review>(novo, HttpStatus.CREATED);
	}

	@PutMapping(URL)
	public ResponseEntity<Review> updateArticle(@RequestBody Review e) {
		service.updateReview(e);
		return new ResponseEntity<Review>(e, HttpStatus.OK);
	}

	@DeleteMapping(URL + "/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
		service.deleteReview(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
