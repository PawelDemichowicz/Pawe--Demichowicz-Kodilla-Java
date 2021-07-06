package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<BookA> books = new HashSet<>();
        books.add(new BookA("Harlan Coben","Deal Breaker", 1995, "111"));
        books.add(new BookA("Stephen King","Pet Sematary", 1983, "112"));
        books.add(new BookA("Dan Brown","The da Vinci Code", 2003, "113"));
        books.add(new BookA(" J.R.R. Tolkiena","The Return of the King", 1955, "114"));
        books.add(new BookA(" J.K. Rowling","Harry Potter and the Philosopher's Stone", 1997, "115"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int medianBooks = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(1995, medianBooks);
    }
}
