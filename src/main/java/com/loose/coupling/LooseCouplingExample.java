package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider mongoDBProvider = new MongoDBProvider();
        UserManager userManager = new UserManager(mongoDBProvider);
        System.out.println(userManager.getUserInfo());
    }
}
