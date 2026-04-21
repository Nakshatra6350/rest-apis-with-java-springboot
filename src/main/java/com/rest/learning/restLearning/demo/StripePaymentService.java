package com.rest.learning.restLearning.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "stripe") // either provide PAYMENT_PROVIDER=razorpay in edit config env variables or payment.provider=razorpay in application properties present in resources
public class StripePaymentService implements PaymentService {

    @Override
    public String pay() {
        String payment = "Stripe";
        System.out.println("Inside Stripe");
        return payment;
    }
}
