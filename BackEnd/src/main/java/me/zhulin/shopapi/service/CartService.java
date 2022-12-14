package me.zhulin.shopapi.service;

import me.zhulin.shopapi.entity.Cart;
import me.zhulin.shopapi.entity.ProductInOrder;
import me.zhulin.shopapi.entity.User;

import java.util.Collection;


public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
