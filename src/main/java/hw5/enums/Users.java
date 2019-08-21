package hw5.enums;

public enum Users {

    PITER_CHAILOVSKII("epam", "1234", "PITER CHAILOVSKII123");

    public String login;
    public String password;
    public String loggedUser;

    Users(String login, String password, String loggedUser) {
        this.login = login;
        this.password = password;
        this.loggedUser = loggedUser;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return loggedUser;
    }
}
