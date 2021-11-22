package mykh.vitalii.spring.dao;

import java.util.Optional;
import mykh.vitalii.spring.model.Role;
import mykh.vitalii.spring.model.RoleName;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(RoleName roleName);
}
