package com.sys.service;

import com.github.pagehelper.PageInfo;
import com.sys.model.User;

/**
 * Created by lhh on 2020/12/01
 */
public interface UserService extends IService<User>{
    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

}
