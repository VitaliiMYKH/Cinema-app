package mykh.vitalii.spring.service;

import mykh.vitalii.spring.model.Role;
import mykh.vitalii.spring.model.RoleName;

public interface RoleService {
    void add(Role role);
      
    Role getRoleByName(RoleName roleName);
}
