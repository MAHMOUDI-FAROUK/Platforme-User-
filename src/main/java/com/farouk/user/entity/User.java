package com.farouk.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
    @Id
    private String userId;
    private String userName;
    private String userAdress;
    private String userPhoneNumber;

    public User() {
    }

    public User(String userId, String userName, String userAdress, String userPhoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userAdress = userAdress;
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }
}
