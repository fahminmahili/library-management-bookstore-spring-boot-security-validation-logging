package az.edu.ada.wm2.authorcrudsecurity.service.impl;
import az.edu.ada.wm2.authorcrudsecurity.model.entity.User;
import az.edu.ada.wm2.authorcrudsecurity.repository.UserRepository;
import az.edu.ada.wm2.authorcrudsecurity.service.UserService;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepo;

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User getById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepo.getAllUsersUsingJPAQuery();
    }

    @Override
    public void saveRoleToUser(String roles, Long userId) {
        userRepo.saveToUser(roles, userId);
    }

}
