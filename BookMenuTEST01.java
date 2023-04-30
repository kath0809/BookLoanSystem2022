/*
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMenuTEST {
    private Jdbc jdbc = new Jdbc();
    private User user = new User();
    private Scanner scanner = new Scanner(System.in);

    public void startUpMeny() throws SQLException, ClassNotFoundException {
        boolean programRunning = true;

        while (programRunning) {
            System.out.println("Velkommen til BokLån. Velg ett alternativ");
            System.out.println("1.  Opprett bruker");
            System.out.println("2.  Logg inn");
            int userChoise = scanner.nextInt();
            scanner.nextLine();

            switch (userChoise) {
                case 1:
                    createUser();
                    break;
                case 2:
                    if (login()) {
                        mainMenu();
                    } else {
                        System.out.println("Feil brukernavn eller pin");
                    }
                    break;
                default:
                    System.out.println("Ugyldig valg");
            }
            break;
        }
    }


    private void createUser() throws SQLException, ClassNotFoundException {
        System.out.println("Velg brukernavn:");
        String inputUsername = scanner.nextLine();
        user.setUsername(inputUsername);

        System.out.println("Velg en pin kode:");
        int inputUserPin = scanner.nextInt();
        scanner.nextLine();
        user.setUserPin(inputUserPin);

        jdbc.addUsers(user);
        System.out.println("Bruker " + inputUsername + " opprettet");
    }

    private boolean login() throws SQLException, ClassNotFoundException {
        System.out.println("Skriv inn brukernavn: ");
        String username = scanner.nextLine();

        System.out.println("Skriv inn pin kode: ");
        int userPin = scanner.nextInt();
        scanner.nextLine();

        for (User userList : jdbc.getUser(user)) {
            if (userList.getUsername().equals(username) && userList.getUserPin() == userPin) {
                return true;
            }
        }
        return false;
    }

    private void mainMenu() throws SQLException, ClassNotFoundException {
        boolean userExists = true;

        while (userExists) {
            System.out.println("Velkommen ");
            System.out.println("""
                    Hva ønsker du å gjøre:
                    1.  Låne bok        (normalBook)
                    2.  Låne lydbok     (audioBook)
                    3.  Levere en bok
                    4.  Levere lydbok
                    5.  Se dine lån     (loan record)
                    6.  Avslutt"""
            );
            break;
        }
        int userChoise = scanner.nextInt();
        scanner.nextLine();
        switch (userChoise) {
            case 1: {
            }
        }
    }
}

 */


