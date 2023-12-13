package az.edu.ada.wm2.authorcrudsecurity.repository;

import az.edu.ada.wm2.authorcrudsecurity.model.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    @Query("select u from User u")
    Iterable<User> getAllUsersUsingJPAQuery();

    @Modifying
    @Transactional
    @Query(value = "update users set roles = ? where id = ?", nativeQuery = true)
    void saveToUser(String roles, Long userId);
}
