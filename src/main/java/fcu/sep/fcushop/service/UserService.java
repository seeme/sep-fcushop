package fcu.sep.fcushop.service;

import fcu.sep.fcushop.database.Sql2oDbHandler;
import fcu.sep.fcushop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import java.math.BigInteger;

/**
 * The service used to access the data related to user.
 */
@Service
public class UserService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  /**
   * Register a user.
   *
   * @param newUser input user
   * @return user with given id
   */
  public User registerUser(User newUser) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "INSERT INTO USER (NAME, PASSWORD, EMAIL) "
          + "VALUES (:name, :password, :email)";
      Object id = connection.createQuery(query, true)
          .addParameter("name", newUser.getUsername())
          .addParameter("password", newUser.getPassword())
          .addParameter("email", newUser.getEmail())
          .executeUpdate()
          .getKey();
      newUser.setId(((BigInteger) id).intValue());

      return newUser;
    }
  }
}
