package com.example.auth.service;

/**
 * Created by Vitalii on 02.05.2017.
 */
public interface SecurServ {
    String findLoggedUsername();

    void autologin(String username, String password);
}
