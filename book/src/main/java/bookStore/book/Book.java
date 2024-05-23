package bookStore.book;

import lombok.Data;

@Data
public class Book {
    private final String id;
    private final String author;
    private final String bookName;
}
