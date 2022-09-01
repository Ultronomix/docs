package com.revature.demos;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    // FIELDS
    private String id;
    private String username;
    private String password;

    protected static int age;

    public String displayName;

    public User() {
        super();
    }

    protected User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(displayName, user.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, age, displayName);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", displayName='" + displayName + '\'' +
                '}';
    }

}
