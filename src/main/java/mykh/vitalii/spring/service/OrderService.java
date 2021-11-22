package mykh.vitalii.spring.service;

import java.util.List;
import mykh.vitalii.spring.model.Order;
import mykh.vitalii.spring.model.ShoppingCart;
import mykh.vitalii.spring.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
