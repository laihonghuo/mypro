package com.sys.mapper;

import java.util.List;

import com.sys.model.Role;
import com.util.MyMapper;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}