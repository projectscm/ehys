package tr.gov.tpe.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.gov.tpe.base.entity.User;
import tr.gov.tpe.base.service.UserService;

import java.util.List;


/**
 * Provides user list. Only admins use this controller.
 */
@Controller
public class UserController {

  /**
   * User service.
   */
  @Autowired
  UserService userService;

  /**
   * get User list.
   * @param model model
   * @return String /admin/users
   */
  @RequestMapping("/userlist")
  public String userList(Model model) {
    List<User> userList = userService.findAll();
    model.addAttribute("user", userList);
    return "/admin/users";
  }
}
