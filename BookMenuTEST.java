import java.sql.SQLException;
import java.util.Scanner;

public class BookMenuTEST {
    private Jdbc jdbc = new Jdbc();
    private User user = new User();
    private AudioBooks audioBooks = new AudioBooks();
    private NormalBooks normalBooks = new NormalBooks();
    public Scanner userActions = new Scanner(System.in);

// START
    public void startUpMenu() throws SQLException, ClassNotFoundException {
        while (true) {
            System.out.println("""
                    Velkommen til boklån. Velg ønsket handling
                    1.  Opprett bruker
                    2.  Logg inn
                    """);
            int userChoice = userActions.nextInt();
            userActions.nextLine();

            switch (userChoice) {
                case 1: {
                    createUser();
                    break;
                }
                case 2: {
                    logIn();
                }
                break;
                default:
                    System.out.println("Ugyldig valg");
            }
        }
    }
//      Valg 1: Opprett bruker
//      legger bruker til i databasen 'user'

    public void createUser() throws SQLException, ClassNotFoundException {
        System.out.println("Velg ett brukernavn");
        String inputUsername = userActions.nextLine();
        user.setUsername(inputUsername);
        System.out.println("Velg en pin kode:");
        int inputUserPin = userActions.nextInt();
        user.setUserPin(inputUserPin);

        jdbc.addUsers(user);
        System.out.println("Bruker " + inputUsername + " opprettet");
    }

//      Valg 2: Logg inn med eksisterende bruker
//      Sjekker at bruker og pin finnes i datababasen(array list userList)
    public boolean logIn() throws SQLException, ClassNotFoundException {
        System.out.println("Brukernavn: ");
        String username = userActions.nextLine();

        System.out.println("Pin: ");
        int userPin = userActions.nextInt();

        for (User userList : jdbc.getUser(user)) {
            if (userList.getUsername().equals(username) && userList.getUserPin() == userPin) {
                return true;
            } else {
                System.out.println("Ugyldig brukernavn eller pin" + "\n" + "Prøv igjen");
                break;
            }
        }
        return false;
    }

        public void getAudioBook () throws SQLException, ClassNotFoundException {
        }
        public void getNormalBook () throws SQLException, ClassNotFoundException {
        }

    }



