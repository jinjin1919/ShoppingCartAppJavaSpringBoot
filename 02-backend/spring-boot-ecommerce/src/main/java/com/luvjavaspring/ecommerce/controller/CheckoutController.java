package com.luvjavaspring.ecommerce.controller;

import com.luvjavaspring.ecommerce.dto.Purchase;
import com.luvjavaspring.ecommerce.dto.PurchaseResponse;
import com.luvjavaspring.ecommerce.service.CheckoutService;
import org.hibernate.annotations.Check;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }
}
