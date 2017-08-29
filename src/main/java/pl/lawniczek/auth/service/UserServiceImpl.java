package pl.lawniczek.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.lawniczek.auth.entity.User;
import pl.lawniczek.auth.repository.RoleRepository;
import pl.lawniczek.auth.repository.UserRepository;

import java.util.HashSet;

/**
 * Created by elawpio on 2017-08-29.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save (User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username){
        return userRepository.findByUserName(username);
    }


}
