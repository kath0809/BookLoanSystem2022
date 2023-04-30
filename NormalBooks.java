public class NormalBooks extends Books {
    // id; author; year; language; numberofHardCopies, loanPeriod

    String bookName;
    String author;
    String language;
    int year;
    int numberOfHardCopies;
    int loanPeriod;

    // Konstruktør
    public NormalBooks(String bookName, String author, String language, int year, int numberOfHardCopies, int loanPeriod) {
        super(bookName, author);
        this.language = language;
        this.year = year;
        this.numberOfHardCopies = numberOfHardCopies;
        this.loanPeriod = loanPeriod;
    }

    public NormalBooks() {
    }

    @Override
    public void printBooks() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfHardCopies() {
        return numberOfHardCopies;
    }

    public void setNumberOfHardCopies(int numberOfHardCopies) {
        this.numberOfHardCopies = numberOfHardCopies;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }
}