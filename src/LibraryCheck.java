import java.util.Scanner;

public class LibraryCheck {
    private Book[] books = new Book[3];
    private Scanner scanner = new Scanner(System.in);
    private int bookCounter = 0;

    public void addBook() {

        while (bookCounter < books.length) {
            Book book = createBook();
            if (isUnique(book, books)) {
                books[bookCounter] = book;
                bookCounter++;
            } else {
                System.out.println("Duplikat");
            }
        }
    }

    private Book createBook() {
        System.out.println("Podaj tytuł");
        String name = scanner.nextLine();
        System.out.println("Podaj ilość stron:");
        int pages = scanner.nextInt();
        scanner.nextLine();
        Book book = new Book(name, pages);
        return book;
    }

    private boolean isUnique(Book book, Book[] books) {
        for (int i = 0; i < bookCounter; i++) {
            if (books[i].equals(book)) {
                return false;
            }
        }
        return true;
    }

    public void bookInfo() {
        for (Book book : books) {
            System.out.println("Nazwa ksiązki: " + book.getName());
            System.out.println("Liczba stron: " + book.getPages());
        }
    }
}
