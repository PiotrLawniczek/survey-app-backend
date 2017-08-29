package pl.lawniczek.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lawniczek.auth.entity.User;

/**
 * Created by elawpio on 2017-08-29.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String username);
}
