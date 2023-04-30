import java.sql.*;
import java.util.ArrayList;

public class Jdbc {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/bookDB";
        String username = "root";
        String password = "root";

// Sjeker om JDBS driver for mysql eksisterer
        return DriverManager.getConnection(url, username, password);

    }


    // NORMAL BOOK DATABASE
    public ArrayList<NormalBooks> populateDbNormalBook() throws SQLException, ClassNotFoundException {
        String sqlPopulateDb = """
                INSERT INTO bookDB.normalBook(bookName, author, language, year, numberOfBooks, loanPeriod)
                VALUE (?, ?, ?, ?, ?, ?), (?, ?, ?, ?, ?, ?), (?, ?, ?, ?, ?, ?);
                """;
        PreparedStatement statement = getConnection().prepareStatement(sqlPopulateDb);
// Bok 1
        String bookName1 = "The Search";
        String author1 = "Marcel Proust";
        String language1 = "English";
        int year1 = 1954;
        int numberOfBooks1 = 6;
        int loanPeriod1 = 4;

// bok 2
        String bookName2 = "The Lion King";
        String author2 = "Markus Zusak";
        String language2 = "Norwegian";
        int year2 = 1985;
        int numberOfBooks2 = 7;
        int loanPeriod2 = 5;

// bok 3
        String bookName3 = "Lord Of The Rings";
        String author3 = "J.R.R. Tolkien";
        String language3 = "Danish";
        int year3 = 2022;
        int numberOfBooks3 = 10;
        int loanPeriod3 = 2;


        // Populate book 1
        statement.setString(1, bookName1);
        statement.setString(2, author1);
        statement.setString(3, language1);
        statement.setInt(4, year1);
        statement.setInt(5, numberOfBooks1);
        statement.setInt(6, loanPeriod1);

        // Populate book 2
        statement.setString(7, bookName2);
        statement.setString(8, author2);
        statement.setString(9, language2);
        statement.setInt(10, year2);
        statement.setInt(11, numberOfBooks2);
        statement.setInt(12, loanPeriod2);

        // Populate book 3
        statement.setString(13, bookName3);
        statement.setString(14, author3);
        statement.setString(15, language3);
        statement.setInt(16, year3);
        statement.setInt(17, numberOfBooks3);
        statement.setInt(18, loanPeriod3);

        statement.executeUpdate();
        return null;
    }

    // AUDIOBOOK DATABASE
    public void populateDbNAudioBook() throws SQLException, ClassNotFoundException {
        String sqlPopulateDb = """
                INSERT INTO bookDB.audioBook(bookName, author, language, trialPeriode)
                VALUE (?, ?, ?, ?), (?, ?, ?, ?), (?, ?, ?, ?);
                """;
        PreparedStatement statement = getConnection().prepareStatement(sqlPopulateDb);

        String bookName1 = "To Kill a Mockingbird";
        String author1 = "Harper Lee";
        String language1 = "English";
        int trialPeriod1 = 3;

        String bookName2 = "The Kite Runner";
        String author2 = "Khaled Hosseini";
        String language2 = "English";
        int trialPeriod2 = 5;

        String bookName3 = "1985";
        String author3 = "George Orwell";
        String language3 = "Indian";
        int trialPeriod3 = 2;

        // Populate Book 1
        statement.setString(1, bookName1);
        statement.setString(2, author1);
        statement.setString(3, language1);
        statement.setInt(4, trialPeriod1);

        // Populate Book 2
        statement.setString(5, bookName2);
        statement.setString(6, author2);
        statement.setString(7, language2);
        statement.setInt(8, trialPeriod2);

        // Populate Book 3
        statement.setString(9, bookName3);
        statement.setString(10, author3);
        statement.setString(11, language3);
        statement.setInt(12, trialPeriod3);

        statement.executeUpdate();
    }

    // USER DATABASE
    public void populatedDbUser() throws SQLException, ClassNotFoundException {
        String sqlPopulateDb = """
                INSERT INTO bookDB.user(username, userPin)
                VALUE (?, ?), (?, ?), (?, ?);
                """;

        PreparedStatement statement = getConnection().prepareStatement(sqlPopulateDb);

        String username1 = "Karima";
        int userpin1 = 1234;

        String username2 = "Elizabeth";
        int userpin2 = 4321;

        String username3 = "Marcus";
        int userpin3 = 911;

        statement.setString(1, username1);
        statement.setInt(2, userpin1);

        statement.setString(3, username2);
        statement.setInt(4, userpin2);

        statement.setString(5, username3);
        statement.setInt(6, userpin3);

        statement.executeUpdate();
    }

    /*
        public void populateDbLoanRecord() throws SQLException, ClassNotFoundException {
                String sqlPopulateDb = """
                        INSERT INTO bookDB.loanRecord(user, bookType, startLoan, endLoan)
                        VALUE (?, ?, ?), (?, ?, ?), (?, ?, ?)
                        """;

            PreparedStatement statement = getConnection().prepareStatement(sqlPopulateDb);
        }
    */
    public void addUsers(User user) throws SQLException, ClassNotFoundException {
        String sqlUpdateUsers = """
                INSERT INTO bookDB.user(username, userPin)
                VALUES (?, ?)
                """;
        PreparedStatement statement = getConnection().prepareStatement(sqlUpdateUsers);
        statement.setString(1, user.getUsername());
        statement.setInt(2, user.getUserPin());

        statement.executeUpdate();
    }

    public ArrayList<User> getUser(User user) throws SQLException, ClassNotFoundException {
        ArrayList<User> userList = new ArrayList<>();

        String sqlGetAllUsers = """
                SELECT *
                FROM bookDb.user
                """;
        PreparedStatement statement = getConnection().prepareStatement(sqlGetAllUsers);
        ResultSet result = statement.executeQuery();

        while (result.next()) {
            String username = result.getString(1);
            int userPin = result.getInt(2);

            User users = new User(username, userPin);
            userList.add(users);

        }
        return userList;

    }
}
/*
    public ArrayList<AudioBooks> getAudio() throws SQLException, ClassNotFoundException {
        ArrayList<AudioBooks> audio = new ArrayList<>();
        return audio;
    }
}
    public void populateDbNAudioBook() throws SQLException, ClassNotFoundException {
        String sqlPopulateDb = """
                    INSERT INTO bookDB.audioBook(bookName, author, language, trialPeriode)
                    VALUE (?, ?, ?, ?), (?, ?, ?, ?), (?, ?, ?, ?);
                    """;
        PreparedStatement statement = getConnection().prepareStatement(sqlPopulateDb);
 */