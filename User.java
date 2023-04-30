public class User {

    String username;
    int userPin;

    public User(String username, int userPin) {
        this.username = username;
        this.userPin = userPin;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserPin() {
        return userPin;
    }

    public void setUserPin(int userPin) {
        this.userPin = userPin;
    }
}
