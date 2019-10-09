package hw7.entities;

public enum Users {

    PITER_CHAILOVSKII("epam", "1234", "PITER CHAILOVSKII");

    private final String login;
    private final String password;
    private final String fullName;

    Users(String login, String password, String fullName){
        this.login = login;

        this.password = password;
        this.fullName = fullName;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public String getFullName(){
        return fullName;
    }
}
