abstract public class Books {
// author, language

    private String author;

    private String language;

    private String bookName;

    public Books(String author, String language) {
        this.author = author;
        this.language = language;
    }

    public Books() {

    }

    abstract public void printBooks();






}
