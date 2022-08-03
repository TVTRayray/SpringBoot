package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.domain.Role;
@Mapper
public interface RoleDao extends BaseMapper<Role> {

    void delUserRoleRel(long roleId);
}
