package com.loose.coupling;

public class PostGresSQL implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "User Details from PostGresSQL";
    }

}
