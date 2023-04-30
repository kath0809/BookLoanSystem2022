import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //populateDB();
        BookMenuTEST bookMenu = new BookMenuTEST();
        bookMenu.startUpMenu();
        bookMenu.createUser();
        bookMenu.logIn();

// TODO husk å fjerne test
    }
    private static void populateDB() throws SQLException, ClassNotFoundException {
        Jdbc jdbc = new Jdbc();
        jdbc.populateDbNormalBook();
        jdbc.populateDbNAudioBook();
        jdbc.populatedDbUser();
    }
}
