package org.task_7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor

public class LibraryUser {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private List<Book> userBooksBorrowed;
    private List<Book> userBooksReserved;
}
