package com.example.demo;

import com.example.junitTestCaseScenarioTest.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testAddBook() {
		// Arrange
		Book book = new Book();
		book.setTitle("The Great Gatsby");
		book.setAuthor("F. Scott Fitzgerald");

		// Act
		ResponseEntity<Book> response = restTemplate.postForEntity("/books123", book, Book.class);

		// Assert
		assertAll("Book addition",
				() -> assertEquals(HttpStatus.OK, response.getStatusCode(), "HTTP status is not OK"),
				() -> assertNotNull(response.getBody(), "Response body is null"),
				() -> assertEquals("The Great Gatsby", response.getBody().getTitle(), "Incorrect book title"),
				() -> assertEquals("F. Scott Fitzgerald", response.getBody().getAuthor(), "Incorrect author")
		);
	}

	/*@Test
	void testGetAllBooks() {
		// Act
		ResponseEntity<List<Book>> response = restTemplate.exchange(
				"/books123",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Book>>() {});

		// Assert
		assertAll("Get all books",
				() -> assertEquals(HttpStatus.OK, response.getStatusCode(), "HTTP status is not OK"),
				() -> assertNotNull(response.getBody(), "Response body is null")
				// Add more assertions based on your API response structure
		);
	}*/


}
