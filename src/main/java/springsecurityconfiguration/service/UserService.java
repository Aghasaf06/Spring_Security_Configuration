package springsecurityconfiguration.service;

import org.springframework.security.core.userdetails.UserDetails;
import springsecurityconfiguration.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDetails getByUserMail(String username) {
        return userRepository.getByEmail(username);
    }
}
