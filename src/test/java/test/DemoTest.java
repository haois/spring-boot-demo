package test;

import demo.Application;
import demo.module.user.daomain.User;
import demo.module.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Created by haol on 2017/6/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
class DemoTest {

        @Autowired
        private UserService userService;

        @Test
        public void test(){
                User user = userService.getByAccount("haois");
                if (user != null){
                        System.out.println(user.toString());
                }

        }

}
