package cz.cvut.fit.household.service.interfaces;

import cz.cvut.fit.household.datamodel.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createOrUpdateUser(User user);

    List<User> findAllUsers();

    List<User> findUsersBySearchTerm(String searchTerm);

    Optional<User> findUserByUsername(String username);

    Boolean exists(String username);

    void deleteUserByUsername(String username);
}
