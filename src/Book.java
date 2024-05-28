/*
*
* represents a book with a title, author, and a price
* */

public class Book {
    private String title;
    private String author;
    private double price;

    /*
    * Constructs a new Book object
    *  @param title the title of book
    *  @param author author of the book
    *  @price the price of the book
    * */
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /*Get the title of the book
    *
    * @return the title of the book
    * */
public String getTitle() {
    return title;
}
    /*Get the author  of the book
     *
     * @return the author of the book
     * */
public String getAuthor() {
    return author;
}
/*Get the price of the book
     *
     * @return the price of the book
     * */
public double getPrice() {
    return price;
}

/*
* Calculate a discount to apply for all Book objects
*
* @param discount the discount percentage applied between 0 and 1
* */
public void calcDiscount(double discount) {
        if (discount > 0 && discount < 1) {
            this.price -= this.price * discount;
        }
}

/*
*
* Print details of the book
* */
public void printDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: " + price);
    }
}