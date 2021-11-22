package mykh.vitalii.spring.dao;

import java.util.List;
import mykh.vitalii.spring.model.Order;
import mykh.vitalii.spring.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
