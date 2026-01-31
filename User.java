package restaurantmanagement;

import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

public abstract class User {

    protected int userId;
    protected String username;
    protected String password;
    protected int role;

    public User() {
    }

    public User(int userId, String username, String password, int role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPass(String password) {
        return this.password.equals(password);
    }

    public boolean login(String username, String password) {
        return (this.checkPass(password) && this.getUsername().equals(username));
    }

    public void logout() {
        System.out.println("Logged out successfully."); // TRY AGAIN 
    }

    public abstract int getRole();

    public abstract void updateUserInfo(int userId, String newUserName, String newPassword) ;

}
