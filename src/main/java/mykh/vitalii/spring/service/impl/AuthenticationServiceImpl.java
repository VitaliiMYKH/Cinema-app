package mykh.vitalii.spring.service.impl;

import java.util.HashSet;
import mykh.vitalii.spring.model.RoleName;
import mykh.vitalii.spring.model.User;
import mykh.vitalii.spring.service.AuthenticationService;
import mykh.vitalii.spring.service.RoleService;
import mykh.vitalii.spring.service.ShoppingCartService;
import mykh.vitalii.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(new HashSet<>());
        roleService.getRoleByName(RoleName.USER);
        user.getRoles().add(roleService.getRoleByName(RoleName.USER));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
