package hw6.entities;

public class UserTableValue {
    private String Number;
    private String User;
    private String Description;

    public UserTableValue(String number, String user, String description){
        this.Number = number;
        this.User = user;
        this.Description = description;
    }

    public String getNumber() {
        return Number;
    }

    public String getUser() {
        return User;
    }

    public String getDescription() {
        return Description;
    }
}
