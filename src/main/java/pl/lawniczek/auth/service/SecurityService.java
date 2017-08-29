package pl.lawniczek.auth.service;

/**
 * Created by elawpio on 2017-08-29.
 */
public interface SecurityService {
    String findLoggedInUsername();
    void autologin(String username, String password);
}
