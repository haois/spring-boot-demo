package demo.module.user.service;

import demo.module.user.dao.UserDao;
import demo.module.user.daomain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by haol on 2017/6/16.
 */
@Service
public class UserService {

        @Autowired
        private UserDao userDao;

        public User getByAccount(String account){
                return userDao.getByAccount(account);
        }
}
