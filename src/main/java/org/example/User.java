package org.example;

import javax.management.Notification;

public class User {
    private String name;
    private String email;

    public void respondInvitation(Notification invite,  boolean accept) {

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
