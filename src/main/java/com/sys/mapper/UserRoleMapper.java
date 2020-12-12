package com.sys.mapper;

import java.util.List;

import com.sys.model.UserRole;
import com.util.MyMapper;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}