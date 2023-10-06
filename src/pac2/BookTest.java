package pac2;

import java.util.Arrays;
import java.util.Comparator;


public class BookTest {
    private Book[] books;
    private int bookCount;

    public BookTest(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Книжная полка полна. Невозможно добавить больше книг.");
        }
    }

    public Book findOldestBook() {
        if (bookCount == 0) {
            return null;
        }

        Book oldestBook = books[0];
        for (int i = 1; i < bookCount; i++) {
            if (books[i].getYear() < oldestBook.getYear()) {
                oldestBook = books[i];
            }
        }
        return oldestBook;
    }

    public Book findNewestBook() {
        if (bookCount == 0) {
            return null;
        }

        Book newestBook = books[0];
        for (int i = 1; i < bookCount; i++) {
            if (books[i].getYear() > newestBook.getYear()) {
                newestBook = books[i];
            }
        }
        return newestBook;
    }

    public void sortByYear() {
        Arrays.sort(books, 0, bookCount, Comparator.comparingInt(Book::getYear));
    }

    public static void main(String[] args) {
        BookTest bookshelf = new BookTest(5);

        bookshelf.addBook(new Book("Автор1", "Книга1", 2005));
        bookshelf.addBook(new Book("Автор2", "Книга2", 1998));
        bookshelf.addBook(new Book("Автор3", "Книга3", 2010));
        bookshelf.addBook(new Book("Автор4", "Книга4", 1987));
        bookshelf.addBook(new Book("Автор5", "Книга5", 2022));

        System.out.println("Самая старая книга:");
        System.out.println(bookshelf.findOldestBook());

        System.out.println("\nСамая новая книга:");
        System.out.println(bookshelf.findNewestBook());

        System.out.println("\nСортировка книг по году выпуска:");
        bookshelf.sortByYear();
        for (int i = 0; i < bookshelf.bookCount; i++) {
            System.out.println(bookshelf.books[i]);
        }
    }

}
