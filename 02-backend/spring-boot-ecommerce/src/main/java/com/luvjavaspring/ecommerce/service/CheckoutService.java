package com.luvjavaspring.ecommerce.service;

import com.luvjavaspring.ecommerce.dto.Purchase;
import com.luvjavaspring.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

}
