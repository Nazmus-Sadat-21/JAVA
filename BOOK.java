public class Start {
    public static void main(String[] args) {
        // Creating two objects of StoryBook
        StoryBook book1 = new StoryBook("ISBN123", "Book One", "Author One", 20.0, 50, "Fiction");
        StoryBook book2 = new StoryBook("ISBN456", "Book Two", "Author Two", 25.0, 30, "Non-Fiction");

        // Setting discount rate
        StoryBook.setDiscountRate(0.1);

        // Displaying details of the books
        System.out.println("Book 1 Details:");
        book1.showDetails();
        System.out.println();

        System.out.println("Book 2 Details:");
        book2.showDetails();
        System.out.println();
    }
}