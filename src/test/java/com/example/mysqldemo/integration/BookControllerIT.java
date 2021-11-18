package com.example.mysqldemo.integration;

import com.example.mysqldemo.model.BookList;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class BookControllerIT {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testGetAllBooks(){
        BookList bookList = testRestTemplate.getForObject("/api/v1/book", BookList.class);
        log.info("Books:{}", bookList );
    }
}
