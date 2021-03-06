package com.catchmeon.catchmeonjwt.models;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserCMO {


    String id;
    String firstName;
    String lastName;
    String username;
    String password;
    String email;


    HashMap<String, String> userIds;

    List<String> userFollowed ;

    public UserCMO() {
    }


    public UserCMO(String username, String password, String email) {
        this.userIds = new HashMap<String,String>();
        this.userFollowed = new ArrayList<String>();
        this.id = "";
        this.firstName = "";
        this.lastName = "";
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap getUserIds() {
        return userIds;
    }

    public void setUserIds(HashMap<String,String> userIds) {
        this.userIds = userIds;
    }

    public List<String> getUserFollowed() {
        return userFollowed;
    }

    public void setUserFollowed(List<String> userFollowed) {
        this.userFollowed = userFollowed;
    }
}
