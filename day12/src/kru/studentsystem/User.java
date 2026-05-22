package kru.studentsystem;

public class User {
    private String username;
    private String password;
    private String identify;
    private String phoneNumber;

    public User() {
    }

    public User(String username, String password, String identify, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.identify = identify;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
