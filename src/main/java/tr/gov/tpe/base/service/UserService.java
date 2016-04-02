package tr.gov.tpe.base.service;

import tr.gov.tpe.base.entity.User;

import java.util.List;

public interface UserService {

  List<User> findAll();

  User create(User user);

  User findUserById(long id);

  User login(String username, String password);

  User update(User user);

  void deleteUser(long id);

  User findUserByUsername(String username);
}
