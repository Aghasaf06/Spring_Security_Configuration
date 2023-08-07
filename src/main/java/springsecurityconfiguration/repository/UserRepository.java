package springsecurityconfiguration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import springsecurityconfiguration.entity.User;

@Repository
public interface UserRepository extends JpaRepository<Integer, User> {

    UserDetails getByEmail(String username);
}
