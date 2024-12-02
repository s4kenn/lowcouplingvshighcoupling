package com.tight.coupling;

public class UserManager {

    // Tight Coupling
    private UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo() {
        return userDatabase.getUserDetails();
    }



}
