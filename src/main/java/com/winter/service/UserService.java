package com.winter.service;

import com.winter.model.User;

import java.util.List;

/**
 * Created by v_keshu on 2018/5/8
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);


}