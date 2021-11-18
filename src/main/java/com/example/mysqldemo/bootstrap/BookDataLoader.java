package com.example.mysqldemo.bootstrap;

import com.example.mysqldemo.domain.entity.Book;
import com.example.mysqldemo.domain.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookDataLoader implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        //loadBooks();
    }

    private void loadBooks(){
        Book peril = Book.builder()
                .bookName("peril")
                .authorName("woodward")
                .build();
        bookRepository.save(peril);

        Book rage = Book.builder()
                .bookName("rage")
                .authorName("woodward")
                .build();
        bookRepository.save(rage);
    }
}
