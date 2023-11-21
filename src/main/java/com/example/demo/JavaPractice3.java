package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//class JavaPractice313 {
//
//	public static int findSecondLargest(int[] arr) {
//        if (arr.length < 2) {
//            System.out.println("Array should have at least two elements");
//            return -1;
//        }
//
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        System.out.println(largest+"...."+secondLargest);
//        
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                secondLargest = largest;
//                largest = arr[i];
//                System.out.println(secondLargest+"...."+largest);
//            } else if (arr[i] > secondLargest && arr[i] != largest) {
//                secondLargest = arr[i];
//                System.out.println("Else If "+secondLargest);
//            }
//        }
//
//        return secondLargest;
//    }
//	
//	public static void main(String[] args) {
//        int[] arr = { 5, 10, 3, 8, 15 };
//        int secondLargest = findSecondLargest(arr);
//        System.out.println("Second largest value: " + secondLargest);
//    }
//}



//class Superclass {
//	public static void staticMethod() {
//        System.out.println("Superclass static method");
//    }
//}
//
//class Subclass extends Superclass {
//	public static void staticMethod() {
//        System.out.println("Subclass static method");
//    }
//}
//
//public class JavaPractice3 {
//    public static void main(String[] args) {
//        Superclass.staticMethod(); // Output: Superclass static method
//        Subclass.staticMethod();   // Output: Subclass static method
//
//        Superclass instance = new Subclass();
//        instance.staticMethod();   // Output: Superclass static method
//    }
//}


import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/api/books")
public class JavaPractice3 {

    @GetMapping
    public String getAllBooks() {
        // Logic to fetch all books from a database or any other source
        return "List of all books";
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable int id) {
        // Logic to fetch a book by ID from a database or any other source
        return "Book with ID: " + id;
    }

    @PostMapping
    public String addBook(@RequestBody Employee book) {
        // Logic to add a new book to a database or any other source
        return "Book added successfully";
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable int id, @RequestBody Employee book) {
        // Logic to update a book with the given ID in a database or any other source
        return "Book updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        // Logic to delete a book with the given ID from a database or any other source
        return "Book deleted successfully";
    }
}







