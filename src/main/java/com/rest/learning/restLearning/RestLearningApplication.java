package com.rest.learning.restLearning;

import com.rest.learning.restLearning.demo.PaymentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class RestLearningApplication implements CommandLineRunner {
//
//	public static void main(String[] args) {
//		SpringApplication.run(RestLearningApplication.class, args);
//	}
//
//    private final PaymentService paymentService;
//
//    public RestLearningApplication(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception{
//        String payment = paymentService.pay();
//        System.out.println(payment);
//    }
//}

@SpringBootApplication
public class RestLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestLearningApplication.class, args);
    }
}
