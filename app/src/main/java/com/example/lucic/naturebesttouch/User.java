package com.example.lucic.naturebesttouch;

/**
 * Created by lucic on 11/28/2018.
 */

public class User {

    private String userUsername;
    private String userPassword;

        public User(String user) {

            String[] splitUser = user.split("\\s+");
            this.userUsername = splitUser[0];
            this.userPassword = splitUser[1];
        };

    public String getUserUsername() {
        return userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
