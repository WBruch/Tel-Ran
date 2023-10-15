package org.task_7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Book {
    private int bookId;
    private String bookTitle;
    private String BookAuthor;
    private BookGenre BookGenre;
    private int bookYear;
    private boolean bookAvailable;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", BookAuthor='" + BookAuthor + '\'' +
                ", BookGenre=" + BookGenre +
                ", bookYear=" + bookYear +
                ", bookAvailable=" + bookAvailable +
                '}';
    }

}
