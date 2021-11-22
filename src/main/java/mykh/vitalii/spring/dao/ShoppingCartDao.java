package mykh.vitalii.spring.dao;

import mykh.vitalii.spring.model.ShoppingCart;
import mykh.vitalii.spring.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
