import java.util.Scanner;

public class LibraryCheck {
    private Book[] books = new Book[3];
    private Scanner scanner = new Scanner(System.in);
    private boolean isEmpty = true;
    private int bookCounter = 0;

    public void addBook() {
        System.out.println("Podaj tytuł");
        String name = scanner.nextLine();
        System.out.println("Podaj ilość stron:");
        int pages = scanner.nextInt();
        scanner.nextLine();
        Book book = new Book(name, pages);
        if (isEmpty){
            books[bookCounter] = book;
            bookCounter++;
            isEmpty = false;
        } else {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getName().equals(book.getName())){
                    System.out.println("DUPLIKAT");
                    addBook();
                } else {
                    books[bookCounter] = book;
                    bookCounter++;
                }
            }
        }
    }

    public void bookInfo() {
        for (Book book : books) {
            System.out.println("Nazwa ksiązki: " + book.getName());
            System.out.println("Liczba stron: " + book.getPages());
        }
    }
}
