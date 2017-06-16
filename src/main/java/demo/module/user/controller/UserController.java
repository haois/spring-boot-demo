package demo.module.user.controller;

import demo.module.user.daomain.User;
import demo.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by haol on 2017/6/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {

        @Autowired
        private UserService userService;

        @RequestMapping("/skip")
        public String skip(){
                return "hello";
        }

        @RequestMapping("/start")
        public String start(){
                return "login";
        }

        @RequestMapping(value = "/login",method = RequestMethod.POST)
        public String login(User user, Model model){
                User u = userService.getByAccount(user.getAccount());
                if (u != null){
                        if (!u.getPassword().equals(user.getPassword())){
                                model.addAttribute("error","密码错误");
                                return "redirect:/user/start";
                        }else {
                                model.addAttribute("user",u);
                                return "hello";
                        }
                }else {
                        model.addAttribute("error","用户名不存在");
                        return "redirect:/user/start";
                }
        }





}
