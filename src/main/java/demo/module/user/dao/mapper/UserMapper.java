package demo.module.user.dao.mapper;

import demo.module.user.daomain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by haol on 2017/6/16.
 */
@Repository
public interface UserMapper {

        User getByAccount(@Param("account") String account);
}
