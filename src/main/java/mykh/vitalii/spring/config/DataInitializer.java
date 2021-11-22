package mykh.vitalii.spring.config;

import java.util.Set;
import javax.annotation.PostConstruct;
import mykh.vitalii.spring.model.Role;
import mykh.vitalii.spring.model.RoleName;
import mykh.vitalii.spring.model.User;
import mykh.vitalii.spring.service.RoleService;
import mykh.vitalii.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setName(RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setName(RoleName.USER);
        roleService.add(userRole);
        User user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("u12345");
        user.setRoles(Set.of(userRole));
        userService.add(user);
        User admin = new User();
        admin.setEmail("admin@gmail.com");
        admin.setPassword("a12345");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);
    }
}
