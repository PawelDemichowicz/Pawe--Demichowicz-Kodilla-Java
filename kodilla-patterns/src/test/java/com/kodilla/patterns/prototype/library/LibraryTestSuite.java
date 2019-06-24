package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Main Library");
        Book book1 = new Book("Octopus", "AAA", LocalDate.of(1999,1,1));
        Book book2 = new Book("Spectre", "BBB", LocalDate.of(1989,3,3));
        Book book3 = new Book("007", "CCC", LocalDate.of(2009,6,6));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow copy of object board
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("National Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Title","Author", LocalDate.of(2000,1,1)));

        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(library.getBooks().size(),shallowClonedLibrary.getBooks().size());
        Assert.assertNotEquals(library.getBooks().size(),deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(),shallowClonedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(),deepClonedLibrary.getBooks());
    }
}
