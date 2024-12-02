package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {

        UserDataProvider userDataProvider = new PostGresSQL();
        UserManager userManager=new UserManager(userDataProvider);

        System.out.println(userManager.getUserInfo());

    }
}
