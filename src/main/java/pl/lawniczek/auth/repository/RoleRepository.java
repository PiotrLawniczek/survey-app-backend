package pl.lawniczek.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lawniczek.auth.entity.Role;

/**
 * Created by elawpio on 2017-08-29.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
