package az.edu.ada.wm2.authorcrudsecurity.service;

import az.edu.ada.wm2.authorcrudsecurity.model.entity.User;

import java.util.List;

public interface UserService {
    User getById(Long id);

    List<User> getAllUsers();

    void saveRoleToUser(String roles, Long userId);

}
