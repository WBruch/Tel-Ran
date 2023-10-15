package org.task_7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor

public class LibraryManager {
    private ArrayList<Book> libraryCatalog;
    private ArrayList<LibraryUser> libraryUsers;

    //Метод,
    //который возвращает список доступных книг заданного жанра.
    public List<Book> listAvailableBooksByGenre(BookGenre genre) {
        return libraryCatalog.stream()
                .filter(el -> el.getBookGenre().equals(genre))
                .filter(Book::isBookAvailable)
                .toList();
    }

    // Метод,
    //который возвращает множество адресов электронной почты пользователей, зарезервировавших книги.
    public Set<String> listUserEmailsWithReservedBooks() {
        return libraryUsers.stream()
                .filter(libraryUser -> !libraryUser.getUserBooksReserved().isEmpty())
                .map(LibraryUser::getUserEmail)
                .collect(Collectors.toSet());
    }

    // Метод, который добавляет новую книгу в библиотеку.
    public void addBookToLibrary(Book book) {
        libraryCatalog.add(book);
    }

    // Метод, который удаляет книгу из библиотеки.
    public void removeBookFromLibrary(Book book) {
        libraryCatalog.remove(book);
    }

    // Метод, который позволяет пользователю взять книгу в аренду.
    public void borrowBook(LibraryUser user, Book book) {
        user.getUserBooksBorrowed().add(book);
        book.setBookAvailable(false);
    }

    // Метод, который позволяет пользователю зарезервировать книгу.
    public void reserveBook(LibraryUser user, Book book) {
        user.getUserBooksReserved().add(book);
        book.setBookAvailable(false);
    }
}
