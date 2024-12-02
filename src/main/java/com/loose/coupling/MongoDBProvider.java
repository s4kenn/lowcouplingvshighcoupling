package com.loose.coupling;

public class MongoDBProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "User Details from MongoDB";
    }

}
