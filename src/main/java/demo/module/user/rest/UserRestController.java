package demo.module.user.rest;

import demo.module.user.daomain.User;
import demo.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by haol on 2017/6/16.
 */
@RestController
@RequestMapping("/rest")
public class UserRestController {

        @Autowired
        private UserService userService;

        @RequestMapping("/hello/{name}")
        public String hello(@PathVariable String name) {
                return "<h1>Hello <a style='color:red'> "+name+" " +
                        "<a>! <br> spring-boot 项目已经成功运行了<h1>";
        }

        @RequestMapping("/get/{account}")
        public User getInfo(@PathVariable String account) {
                User user = userService.getByAccount(account);
                return user;
        }


}
