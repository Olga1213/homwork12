//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args);

    public class Book {
        String author;
        int pageAmount;
        String publisher;

        public Book(String author, int pageAmount, String publisher) {
            this.author = author;
            this.pageAmount = pageAmount;
            this.publisher = publisher;
        }
    }

    Book book = new Book("Agatha Christie", "120", "OOO");

    public String getAutor() {
        return getAutor();
    }

    public String getPublisher() {
        return getPublisher();
    }

    public void setPablisher(String pablisher) {
        this.getPublisher () = pablisher;
    }
}