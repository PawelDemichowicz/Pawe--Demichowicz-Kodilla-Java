package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookB {
    private final String author;
    private final String title;
    private final int yearPublication;
}

