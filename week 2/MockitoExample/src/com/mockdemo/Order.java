package com.mockdemo;


public class Order {


    private PaymentService paymentService;



    public Order(PaymentService paymentService){

        this.paymentService = paymentService;

    }



    public String placeOrder(double amount){


        boolean result =
                paymentService.processPayment(amount);



        if(result){

            return "Order placed successfully";

        }


        return "Payment failed";


    }


}
