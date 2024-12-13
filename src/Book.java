public class Book {
    Author author;
    int pageAmount;
    String publisher;

    public Book(Author author, int pageAmount, String publisher) {
        this.author = author;
        this.pageAmount = pageAmount;
        this.publisher = publisher;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPageAmount() {
        return pageAmount;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
