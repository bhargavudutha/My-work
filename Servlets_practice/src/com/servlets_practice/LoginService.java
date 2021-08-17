package com.servlets_practice;

public class LoginService {
    LoginDao ld=new LoginDao();
    public boolean check(String username,String password) {
        return ld.validate(username, password);
    }
}
 
