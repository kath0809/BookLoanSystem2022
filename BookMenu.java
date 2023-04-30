/*
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Jdbc jdbc = new Jdbc();
    private User user = new User();

    public void startUpMeny() throws SQLException, ClassNotFoundException {
        Scanner userInput = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        boolean programRunning = true;

//  Menu 1:
        System.out.println("Velkommen til BokLån. Velg ett alternativ");
        System.out.println("1.  Opprett bruker");
        System.out.println("2.  Logg inn");

        int userChoise;
        userChoise = userInput.nextInt();
//  Menu2:
        while (programRunning) {
            switch (userChoise) {
                case 1: {
                    System.out.println("Velg brukernavn:");
                    String inputUsername = scanner.nextLine();
                    user.setUsername(inputUsername);

                    System.out.println("Velg en pin kode:");
                    int inputUserPin = scanner.nextInt();
                    user.setUserPin(inputUserPin);

                    jdbc.addUsers(user);
                    System.out.println("Bruker " + inputUsername + " opprettet");
                    break;
                }
                case 2: {
                    System.out.println("Skriv inn brukernavn: ");
                    String username = scanner.nextLine();

                    System.out.println("Skriv inn pin kode: ");
                    int userPin = scanner.nextInt();
                    userInput.nextLine();
                    boolean userExists = false;
                    for (User userList : jdbc.getUser(user)) {
                        if (userList.getUsername().equals(username) && userList.getUserPin() == userPin) {
                            userExists = true;
                            break;
                        } else {
                            System.out.println("Feil brukernavn eller pin");
                        }
                    }
                    while (userExists) {
                        System.out.println("Velkommen " + username);
                        System.out.println("""
                        Hva ønsker du å gjøre:
                        1.  Låne bok        (normalBook)
                        2.  Låne lydbok     (audioBook)
                        3.  Levere en bok
                        4.  Levere lydbok
                        5.  Se dine lån     (loan record)
                        6.  Avslutt"""
                        );

                        String userAction = scanner.nextLine();

                        switch (userAction) {
                            case "1": {
                                System.out.println("Dette er bøkene tilgjengelige for utlån");
                                startAudioBookLoan();
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    private void startAudioBookLoan() throws SQLException, ClassNotFoundException {
        ArrayList<AudioBooks> audio = jdbc.getAudio();


    }

}

 */
