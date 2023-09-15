package com.luvjavaspring.ecommerce.dto;

import com.luvjavaspring.ecommerce.entity.Address;
import com.luvjavaspring.ecommerce.entity.Customer;
import com.luvjavaspring.ecommerce.entity.Order;
import com.luvjavaspring.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billlingAddress;


    private Order order;

    private Set<OrderItem> orderItems;
}
