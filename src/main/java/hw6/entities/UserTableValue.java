package hw6.entities;

public class UserTableValue {
    private Integer Number;
    private String User;
    private String Description;

    public UserTableValue(Integer number, String user, String description){
        this.Number = number;
        this.User = user;
        this.Description = description;
    }

    public Integer getNumber() {
        return Number;
    }

    public String getUser() {
        return User;
    }

    public String getDescription() {
        return Description;
    }
}
