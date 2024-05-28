/*
*  represents a magazine, a type of book with a publisher
* */
public class Magazine extends Book {
private String publisher;

    /*
    * @param title the title of the magazine
    * @param author the author of the magazine
    * @param price the price of the magazine
    * @param publisher the publisher of the magazine
    * */
    public Magazine(String title, String author, double price, String publisher) {
        super(title, author, price);
        this.publisher = publisher;
    }

    /*Get the publisher  of the magazine
     *
     * @return the publisher of the magazine
     * */
    public String getPublisher() {
        return publisher;
    }
    /*
     *
     * Print details of the magazine
     * */
    public void printDetails() {
        super.printDetails();
        System.out.println("Publisher: " + publisher);
    }
}
