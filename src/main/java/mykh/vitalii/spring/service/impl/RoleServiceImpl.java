package mykh.vitalii.spring.service.impl;

import mykh.vitalii.spring.dao.RoleDao;
import mykh.vitalii.spring.exception.DataProcessingException;
import mykh.vitalii.spring.model.Role;
import mykh.vitalii.spring.model.RoleName;
import mykh.vitalii.spring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByName(RoleName roleName) {
        return roleDao.getRoleByName(roleName)
                .orElseThrow(() -> new DataProcessingException("Can`t get"
                        + " role with name: " + roleName));
    }
}
