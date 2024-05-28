import java.util.*; // import the necessary packages (ArrayList and Scanner)

/*
* Main file, simulating a simple Bookstore
* */
public class Bookstore {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a magazine");
            System.out.println("2. Add a novel");
            System.out.println("3. Display all books");
            System.out.println("4. Apply a discount to the books");
            System.out.println("5. Quit");
            System.out.print("Choose an option: ");

            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                // add a magazine
                System.out.println("Enter the title of the magazine: ");
                String magTitle = input.nextLine();

                System.out.println("Enter the author of the magazine: ");
                String magAuthor = input.nextLine();

                System.out.println("Enter the price of the magazine: ");
                double magPrice = input.nextDouble();

                input.nextLine();

                System.out.println("Enter the publisher of the magazine: ");
                String magPublisher = input.nextLine();

                books.add(new Magazine(magTitle,magAuthor,magPrice, magPublisher));
            }
            else if (option == 2) {
                // add a novel

                System.out.println("Enter the title of the novel: ");
                String novTitle = input.nextLine();

                System.out.println("Enter the author of the novel: ");
                String novAuthor = input.nextLine();

                System.out.println("Enter the price of the novel: ");
                double novPrice = input.nextDouble();

                input.nextLine();
                System.out.println("Enter the page count: ");

                int novPageCount = input.nextInt();

                books.add(new Novel(novTitle,novAuthor,novPrice,novPageCount));
            }
            else if (option == 3) {
                // display the books
                if (books.isEmpty()) {
                    // check if the ArrayList is empty
                    System.out.println("There are no books. Add some first");
                }
                for (Book book : books) {
                    // iterate for each book in the ArrayList and print its details
                    book.printDetails();
                    System.out.println();
                }
            }

            else if (option == 4) {
                // apply a discount
                System.out.println("Enter discount percentage: ");
                double discount = input.nextDouble();
                input.nextLine();
                for (Book book : books) {
                    // iterate for each book in the ArrayList and apply the appropriate discount
                    book.calcDiscount(discount);
                    System.out.println("Discount successfully applied");
                }
            }
            else if (option == 5) {
                // close the Scanner, and quit the program
                input.close();
                System.exit(0);
            }
            else {
                // very simple error checking
                System.out.println("Invalid option. ");
            }
        }

    }
}
