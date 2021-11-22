package mykh.vitalii.spring.service;

import mykh.vitalii.spring.model.MovieSession;
import mykh.vitalii.spring.model.ShoppingCart;
import mykh.vitalii.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
