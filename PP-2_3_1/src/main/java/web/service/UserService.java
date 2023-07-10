package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void delete(long id);
    User change(User user);
    List<User> listUsers();
    User findUserById(long id);
}
