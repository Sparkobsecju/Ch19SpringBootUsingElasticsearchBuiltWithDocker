package com.example.ch19.controller;

import com.example.ch19.persistence.entity.Book;
import com.example.ch19.persistence.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public String saveBook(@RequestBody Book book) {
        Book resultBook = bookRepository.save(book);
        return resultBook.toString();
    }

    @PostMapping("/batch")
    public String saveBookBatch(@RequestBody List<Book> books) {
        bookRepository.saveAll(books);
        return "批量新增成功";
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable String id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        return bookOptional.isPresent()? bookOptional.get().toString(): "Book Not Found（參數錯誤）";
    }

    @PutMapping
    public String updateBook(@RequestBody Book book) {
        Book resultBook = bookRepository.save(book);
        return resultBook.toString();
    }

    @DeleteMapping("{/id}")
    public String deleteBook(@PathVariable String id) {
        bookRepository.deleteById(id);
        return "刪除成功";
    }

    @GetMapping("/search")
    public Object searchByTitle(String keyword) {
        List<Book> students = bookRepository.findByTitleLike(keyword);
        return students;
    }

    @GetMapping("/search/custom")
    public Object searchByTitleCustom(@RequestParam String keyword) {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Book> page = bookRepository.findByTitleCustom(keyword, pageable);
        return page;
    }
}
