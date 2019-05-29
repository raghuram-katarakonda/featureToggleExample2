package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.FeatureDecisions;
import com.example.demo.config.NotSupportedException;

@RestController
@RequestMapping("/coupons")
class CouponController {

    private final FeatureDecisions featureDecisions;

    CouponController(FeatureDecisions featureDecisions) {
        this.featureDecisions = featureDecisions;
    }

    @GetMapping
    List<String> listCouponNames() {
        if (!featureDecisions.couponEnabled()) {
            throw new NotSupportedException();
        }
        return Arrays.asList("First deal coupon", "10% coupon");
    }

}
