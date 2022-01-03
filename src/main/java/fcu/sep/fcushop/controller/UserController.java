package fcu.sep.fcushop.controller;

import fcu.sep.fcushop.model.User;
import fcu.sep.fcushop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The controller used to serve the requests regarding the access of user.
 */
@RestController
public class UserController {

  @Autowired
  private UserService userService;

  /**
   * Register a user.
   *
   * @param newUser input user
   * @return user object with given id
   */
  @PostMapping("/register")
  public User register(@RequestBody User newUser) {
    System.out.println(newUser.getUsername());
    newUser = userService.registerUser(newUser);
    return newUser;
  }

}
