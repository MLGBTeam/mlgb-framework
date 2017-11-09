package cn.mlgbteam.system.authorization.controller;

import cn.mlgbteam.system.authorization.entity.User;
import com.github.javafaker.Faker;
import java.util.Locale;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lujunfeng00
 */
@RestController
@RequestMapping("user")
public class UserController {

  @GetMapping("getUser")
  public User getUser() {
    User user = new User();
    Faker faker = new Faker(Locale.CHINA);
    user.setId(UUID.randomUUID().toString());
    user.setName(faker.name().name());
    user.setAge(faker.number().numberBetween(20, 40));
    return user;
  }

}
