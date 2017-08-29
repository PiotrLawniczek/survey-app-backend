package pl.lawniczek.auth.service;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by elawpio on 2017-08-29.
 */
public interface UserDetailsService {
    UserDetails loadUserByUsername(String username);
}
