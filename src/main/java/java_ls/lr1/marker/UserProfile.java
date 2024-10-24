package java_ls.lr1.marker;

import java.io.Serializable;

public class UserProfile implements Serializable {
    private static final long serialVersionUID = 1L; // Unique version identifier
    private String username;
    private String email;
    private int age;
    // Constructor
    public UserProfile(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
    // Getters and setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}