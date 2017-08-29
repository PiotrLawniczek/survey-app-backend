package pl.lawniczek.auth.service;

import pl.lawniczek.auth.entity.User;

/**
 * Created by elawpio on 2017-08-29.
 */
public interface UserService {
    void save (User user);
    User findByUsername(String username);
}
