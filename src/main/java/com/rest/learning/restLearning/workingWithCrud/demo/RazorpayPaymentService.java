package com.rest.learning.restLearning.workingWithCrud.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "razorpay") // either provide PAYMENT_PROVIDER=razorpay in edit config env variables or payment.provider=razorpay in application properties present in resources
public class RazorpayPaymentService implements PaymentService{

    @Override
    public String pay() {
        String payment = "Razorpay";
        System.out.println("Inside razorpay");
        return payment;
    }
}
