package com.example.mysqldemo.model;

import com.example.mysqldemo.domain.entity.Book;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookList {

    private List<Book> books;

    @Override
    public String toString() {
        return "BookList{" +
                "books=" + books +
                '}';
    }
}
