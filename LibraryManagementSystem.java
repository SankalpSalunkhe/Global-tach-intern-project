import java.util.Scanner;

// Create the LibraryManagementSystem class to implement the library management functionality
public class LibraryManagementSystem {
    // Main method starts
    public static void main(String args[]) {
        // Declare and initialize variables
        int choice, numBooks = 0;
        String bookName, authorName, publisherName;
        Scanner sc = new Scanner(System.in);

        // Create an array of Book objects
        Book[] books = new Book[100];

        while (true) {
            System.out.println("Library Management System");
            System.out.println("Choose 1 to Add a Book");
            System.out.println("Choose 2 to Display All Books");
            System.out.println("Choose 3 to Search for a Book");
            System.out.println("Choose 4 to Exit");
            System.out.print("Enter your choice: ");

            // Get the user's choice
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add a new book
                    System.out.print("Enter the name of the book: ");
                    bookName = sc.next();
                    System.out.print("Enter the name of the author: ");
                    authorName = sc.next();
                    System.out.print("Enter the name of the publisher: ");
                    publisherName = sc.next();

                    // Create a new Book object and add it to the array
                    books[numBooks] = new Book(bookName, authorName, publisherName);
                    numBooks++;
                    System.out.println("");
                    break;

                case 2:
                    // Display all books in the array
                    if (numBooks == 0) {
                        System.out.println("No books in the library");
                    } else {
                        for (int i = 0; i < numBooks; i++) {
                            books[i].displayBookDetails();
                        }
                    }
                    System.out.println("");
                    break;

                case 3:
                    // Search for a book by name
                    if (numBooks == 0) {
                        System.out.println("No books in the library");
                        break;
                    }
                    System.out.print("Enter the name of the book to search: ");
                    bookName = sc.next();
                    boolean found = false;
                    for (int i = 0; i < numBooks; i++) {
                        if (books[i].getBookName().equalsIgnoreCase(bookName)) {
                            books[i].displayBookDetails();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found");
                    }
                    System.out.println("");
                    break;

                case 4:
                    // Exit from the menu
                    System.exit(0);
            }
        }
    }
}
