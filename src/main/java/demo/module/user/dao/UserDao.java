package demo.module.user.dao;

import demo.module.user.dao.mapper.UserMapper;
import demo.module.user.daomain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by haol on 2017/6/16.
 */
@Repository
public class UserDao {

        @Autowired
        private UserMapper mapper;

        Logger logger = LoggerFactory.getLogger(UserDao.class);

        public User getByAccount(String account){
                try{
                        return mapper.getByAccount(account);
                }catch (Exception e){
                        logger.error(e.getMessage());
                        return null;
                }
        }
}
