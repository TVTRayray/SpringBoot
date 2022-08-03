package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.dao.RoleDao;
import org.example.domain.Role;
import org.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {
    @Autowired
    private RoleDao roleDao;




}
