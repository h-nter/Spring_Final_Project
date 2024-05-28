/*
* represents a Novel, a type of Book, with an additional page count property
*
**/

public class Novel extends Book{
    private int pageCount;

    /*
     * @param title the title of the novel
     * @param author the author of the novel
     * @param price the price of the novel
     * @param pageCount the number of pages in the novel
     * */
    public Novel(String title, String author, double price, int pageCount) {
        super(title, author, price);
        this.pageCount = pageCount;
    }
    /*Get the number of pages in the novel
     *
     * @return the number of pages in the novel
     * */
    public int getPageCount() {
        return pageCount;
    }
    /*
     *
     * Print details of the novel
     * */
    public void printDetails() {
        super.printDetails();
        System.out.println("Page count: " + pageCount);
    }
}
