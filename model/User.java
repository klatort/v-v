package model;

public class User {
    private String userType;

    public User(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }
}
